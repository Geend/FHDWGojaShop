package model;

import model.visitor.ArticleStateReturnVisitor;
import persistence.*;

import java.text.MessageFormat;

public class ToString$Visitor extends model.visitor.ToString$Visitor {

	private String result;

	public ToString$Visitor() {
	}
	public synchronized String toString(Anything anything) throws PersistenceException {
		try {
			result = null;
			anything.accept(this);
			if (result == null) {
				this.standardHandling(anything);
			} else {
				if (common.RPCConstantsAndServices.test)
					result = " " + anything.getClassId() + " , " + anything.getId() + "::  " + result;
			}
		} catch (Exception ex){
			System.out.println("During toString of " + anything.getClass() + " happened " + ex);
			this.standardHandling(anything);
		}
		return result;
	}

	protected void standardHandling(Anything anything) {
		result = anything.getClassId() + ";" + anything.getId();
	}



	@Override
	public void handleServer(Server4Public server) throws PersistenceException {
	}

	@Override
	public void handleOwnerService(OwnerService4Public ownerService) throws PersistenceException {
	}

	@Override
	public void handleActiveOrder(ActiveOrder4Public activeOrder) throws PersistenceException {

	}

	@Override
	public void handleCustomerService(CustomerService4Public customerService) throws PersistenceException {
	}

	@Override
	public void handleCustomerRegisterService(CustomerRegisterService4Public customerRegisterService) throws PersistenceException {
	}


	@Override
	public void handleArticle(Article4Public article) throws PersistenceException {
		//Needs no implemenation, because only ArticleWrapper are visible on the ui
	}

	@Override
	public void handleFinishedOrder(FinishedOrder4Public finishedOrder) throws PersistenceException {

	}

	@Override
	public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException {
		result = "Hersteller (H)";
	}





	@Override
	public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
		result = "Restposten";
	}

	@Override
	public void handleOrderQuantifiedArticle(OrderQuantifiedArticle4Public orderQuantifiedArticle) throws PersistenceException {
		result = orderQuantifiedArticle.getQuantity() + "x " + orderQuantifiedArticle.getArticle().getName();
	}



	@Override
	public void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException {
		result = "RootProductGroup (" + rootProductGroup.getName() + ")";
	}


	@Override
	public void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException {
		result = "Kunde " + customerAccount.getName();
	}




	@Override
	public void handlePreOrder(PreOrder4Public preOrder) throws PersistenceException {

	}

	@Override
	public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException {
		result = "Nicht im Verkauf";
	}

	@Override
	public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException {
		result = subProductGroup.getName();
	}


	@Override
	public void handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException {
		result = MessageFormat.format("{0} ({1}€ - {2} Tage)", customerDeliveryTime.getName(), customerDeliveryTime.getPrice(), customerDeliveryTime.getDeliveryTime());
	}



	@Override
	public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException {
		result = shoppingCartQuantifiedArticle.getQuantity() + "x " + shoppingCartQuantifiedArticle.getArticle().getName();
	}

	@Override
	public void handleCustomerArticleLst(CustomerArticleLst4Public customerArticleLst) throws PersistenceException {
		result = "Such Liste";
	}

	@Override
	public void handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public customerDeliveryTimeManager) throws PersistenceException {
		result = "Kundenlieferzeiten";
	}

	@Override
	public void handleSettings(Settings4Public settings) throws PersistenceException {
		result = "Einstellungen";
	}


	@Override
	public void handleInSale(InSale4Public inSale) throws PersistenceException {
		result = "Im Verkauf";
	}



	@Override
	public void handleProducer(Producer4Public producer) throws PersistenceException {
		result = producer.getName();
	}

	@Override
	public void handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException {
		result = "Warenkorb";
	}

	@Override
	public void handleCustomerOrderManager(CustomerOrderManager4Public customerOrderManager) throws PersistenceException {
		result = "Bestellungen";
	}



	@Override
	public void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException {
		result = articleWrapper.getName();

		result += articleWrapper.getArticle().getState().accept(new ArticleStateReturnVisitor<String>() {
			@Override
			public String handleInSale(InSale4Public inSale) throws PersistenceException {
				return " - " + articleWrapper.getArticle().getPrice().toString() + "€";
			}

			@Override
			public String handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
				return " (Neu)";
			}

			@Override
			public String handleNotInSale(NotInSale4Public notInSale) throws PersistenceException {
				return " (Nicht im Verkauf)";
			}

			@Override
			public String handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
				return " (Restposten)";
			}
		});
	}


	@Override
	public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
		result = "Neuer Artikel, nicht im Verkauf";
	}




	@Override
	public void handleOrder(Order4Public order) throws PersistenceException {
		result = "Bestellung";
	}


}
