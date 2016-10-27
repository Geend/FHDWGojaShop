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
	public void handleOrder(PersistentOrder order) throws PersistenceException {

	}

	@Override
	public void handleOrderArticleWrapper(PersistentOrderArticleWrapper orderArticleWrapper) throws PersistenceException {

	}

	@Override
	public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException {
		result = "PG: " + productGroup.getName();

	}

	@Override
	public void handleRemainingStock(PersistentRemainingStock remainingStock) throws PersistenceException {

	}

	@Override
	public void handleOrderQuantifiedArticle(PersistentOrderQuantifiedArticle orderQuantifiedArticle) throws PersistenceException {

	}

	@Override
	public void handleServer(PersistentServer server) throws PersistenceException {

	}

	@Override
	public void handleArticle(PersistentArticle article) throws PersistenceException {
		result = "Article: " + article.getName();

	}

	@Override
	public void handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException {

	}

	@Override
	public void handleNotInSale(PersistentNotInSale notInSale) throws PersistenceException {

	}

	@Override
	public void handleCustomerAccount(PersistentCustomerAccount customerAccount) throws PersistenceException {

	}

	@Override
	public void handleInSale(PersistentInSale inSale) throws PersistenceException {

	}

	@Override
	public void handleCustomerDeliveryTime(PersistentCustomerDeliveryTime customerDeliveryTime) throws PersistenceException {

	}

	@Override
	public void handleProducer(PersistentProducer producer) throws PersistenceException {

	}

	@Override
	public void handleShoppingCart(PersistentShoppingCart shoppingCart) throws PersistenceException {

	}



	@Override
	public void handleShoppingCartQuantifiedArticle(PersistentShoppingCartQuantifiedArticle shoppingCartQuantifiedArticle) throws PersistenceException {

	}

	@Override
	public void handleNewCreated(PersistentNewCreated newCreated) throws PersistenceException {

	}

	@Override
	public void handleShopArticleWrapper(PersistentShopArticleWrapper shopArticleWrapper) throws PersistenceException {

	}

	@Override
	public void handleShoppingCartArticleWrapper(PersistentShoppingCartArticleWrapper shoppingCartArticleWrapper) throws PersistenceException {

	}
}
