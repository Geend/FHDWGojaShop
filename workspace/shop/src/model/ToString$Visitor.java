package model;

import model.visitor.ArticleStateReturnVisitor;
import model.visitor.OrderQuantifiedArticleStateVisitor;
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
	public void handleReOrderQuantifiedArticle(ReOrderQuantifiedArticle4Public reOrderQuantifiedArticle) throws PersistenceException {
		result = reOrderQuantifiedArticle.getQuantity() + "x " + reOrderQuantifiedArticle.getArticle().getName() + "(" + reOrderQuantifiedArticle.getCountdown()+ " Ticks remaining)";

	}

	@Override
	public void handleOwnerService(OwnerService4Public ownerService) throws PersistenceException {
	}

	@Override
	public void handleFinishedOrderState(FinishedOrderState4Public finishedOrderState) throws PersistenceException {
		result = "abgeschlossen";
	}


	@Override
	public void handleCustomerService(CustomerService4Public customerService) throws PersistenceException {
	}

	@Override
	public void handleCustomerRegisterService(CustomerRegisterService4Public customerRegisterService) throws PersistenceException {
	}

	@Override
	public void handleProcessingOrderState(ProcessingOrderState4Public processingOrderState) throws PersistenceException {
		result = "in Bearbeitung";
	}


	@Override
	public void handleArticle(Article4Public article) throws PersistenceException {
		//Needs no implemenation, because only ArticleWrapper are visible on the ui
	}

	@Override
	public void handleOwnerOrderManager(OwnerOrderManager4Public ownerOrderManager) throws PersistenceException {
		result = "Laufende Kunden-Bestellungen";
	}


	@Override
	public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException {
		result = "Hersteller";
	}





	@Override
	public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
		result = "Restposten";
	}

	@Override
	public void handleOrderQuantifiedArticle(OrderQuantifiedArticle4Public orderQuantifiedArticle) throws PersistenceException {
		result = orderQuantifiedArticle.getQuantity() + "x " + orderQuantifiedArticle.getArticle().getName();

		orderQuantifiedArticle.getState().accept(new OrderQuantifiedArticleStateVisitor() {
			@Override
			public void handleOrderQuantifiedArticleMarkedForReturnState(OrderQuantifiedArticleMarkedForReturnState4Public orderQuantifiedArticleMarkedForReturnState) throws PersistenceException {
				result += " (Retour)";
			}

			@Override
			public void handleOrderQuantifiedArticleNormalState(OrderQuantifiedArticleNormalState4Public orderQuantifiedArticleNormalState) throws PersistenceException {

			}


		});
	}



	@Override
	public void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException {
		result = "Produkte (" + rootProductGroup.getName() + ")";
	}

	@Override
	public void handleOrderQuantifiedArticleNormalState(OrderQuantifiedArticleNormalState4Public orderQuantifiedArticleNormalState) throws PersistenceException {

	}


	@Override
	public void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException {
		result = "Kunde " + customerAccount.getName();
	}

	@Override
	public void handleReOrderManager(ReOrderManager4Public reOrderManager) throws PersistenceException {
		result = "Offene Nachbestellungen";
	}

	@Override
	public void handleInTransitOrderState(InTransitOrderState4Public inTransitOrderState) throws PersistenceException {
		result = "unterwegs";
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
	public void handleArticleReturn(ArticleReturn4Public articleReturn) throws PersistenceException {
		result = "Retour";
	}

	@Override
	public void handleOrderQuantifiedArticleMarkedForReturnState(OrderQuantifiedArticleMarkedForReturnState4Public orderQuantifiedArticleMarkedForReturnState) throws PersistenceException {

	}

	@Override
	public void handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException {
		result = "Warenkorb";
	}

	@Override
	public void handleArticlesInReturnOrderState(ArticlesInReturnOrderState4Public articlesInReturnOrderState) throws PersistenceException {

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
	public void handlePreOrderState(PreOrderState4Public preOrderState) throws PersistenceException {
		result = "vorbestellt";
	}

	@Override
	public void handleReturnManager(ReturnManager4Public returnManager) throws PersistenceException {
		result = "Laufende Retouren";
	}


	@Override
	public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
		result = "Neuer Artikel, nicht im Verkauf";
	}

	@Override
	public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderState4Public waitingForAcceptOrderState) throws PersistenceException {
		result = "warten auf Annahme";
	}

	@Override
	public void handleBackgroundTaskManager(BackgroundTaskManager4Public backgroundTaskManager) throws PersistenceException {

	}

	@Override
	public void handleReturnQuantifiedArticle(ReturnQuantifiedArticle4Public returnQuantifiedArticle) throws PersistenceException {
		result = returnQuantifiedArticle.getArticle().getName();
		//TODO! improve result
	}


	@Override
	public void handleOrder(Order4Public order) throws PersistenceException {
		result = "Bestellung";
	}


}
