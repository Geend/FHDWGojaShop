package model;

import persistence.*;

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
	public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException {
		result = "Hersteller (H)";
	}

	@Override
	public void handleOrderArticleWrapper(OrderArticleWrapper4Public orderArticleWrapper) throws PersistenceException {

	}

	@Override
	public void handleCustomerService(CustomerService4Public customerService) throws PersistenceException {

	}


	@Override
	public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
		result = "Restposten";
	}

	@Override
	public void handleOrderQuantifiedArticle(OrderQuantifiedArticle4Public orderQuantifiedArticle) throws PersistenceException {

	}

	@Override
	public void handleServer(Server4Public server) throws PersistenceException {

	}

	@Override
	public void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException {
		result = "RootProductGroup (" + rootProductGroup.getName() + ")";
	}

	@Override
	public void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException {

	}


	@Override
	public void handleArticle(Article4Public article) throws PersistenceException {
		result = "A: " + article.getName();
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
		result = "P: " + subProductGroup.getName();
	}

	@Override
	public void handleCustomerRegisterService(CustomerRegisterService4Public customerRegisterService) throws PersistenceException {

	}

	@Override
	public void handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException {

	}

	@Override
	public void handleOwnerService(OwnerService4Public ownerService) throws PersistenceException {

	}

	@Override
	public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException {

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
	public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapper4Public shoppingCartArticleWrapper) throws PersistenceException {
		result = shoppingCartArticleWrapper.getName();
	}


	@Override
	public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
		result = "Neuer Artikel, nicht im Verkauf";
	}

	@Override
	public void handleShopArticleWrapper(ShopArticleWrapper4Public shopArticleWrapper) throws PersistenceException {

	}

	@Override
	public void handleOrder(Order4Public order) throws PersistenceException {
		result = "Bestellung";
	}
}
