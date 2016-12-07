package model;

import constants.IconConstants;
import persistence.Anything;
import persistence.ArticleReturn4Public;
import persistence.ArticleWrapper4Public;
import persistence.CustomerAccount4Public;
import persistence.CustomerArticleLst4Public;
import persistence.CustomerDeliveryTime4Public;
import persistence.CustomerDeliveryTimeManager4Public;
import persistence.CustomerOrderManager4Public;
import persistence.Order4Public;
import persistence.OrderQuantifiedArticle4Public;
import persistence.OwnerOrderManager4Public;
import persistence.PersistenceException;
import persistence.Producer4Public;
import persistence.ProducerLst4Public;
import persistence.ReOrderManager4Public;
import persistence.ReOrderQuantifiedArticle4Public;
import persistence.ReturnManager4Public;
import persistence.ReturnQuantifiedArticle4Public;
import persistence.RootProductGroup4Public;
import persistence.Settings4Public;
import persistence.ShoppingCart4Public;
import persistence.ShoppingCartQuantifiedArticle4Public;
import persistence.SubProductGroup4Public;
import viewClient.IconManager;

public class GetIconInfo$Visitor extends model.visitor.AnythingStandardVisitor {

	int result = 0;
	
	@Override
	protected void standardHandling(Anything anything) throws PersistenceException {
		result = 0;	
	}

	public int getIconInfo(Anything anything) throws PersistenceException {
		anything.accept(this);
		return result;
	}


	@Override
	public void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException {
		result = IconConstants.ARTICLE;
	}

	@Override
	public void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException {
		result = IconConstants.PRODUCT_GROUP;
	}

	@Override
	public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException {
		result = IconConstants.PRODUCT_GROUP;
	}

	@Override
	public void handleCustomerAccount(CustomerAccount4Public customerAccount) throws PersistenceException {
		result = IconConstants.USER;
	}

	@Override
	public void handleProducer(Producer4Public producer) throws PersistenceException {
		result = IconConstants.PRODUCER;
	}

	@Override
	public void handleShoppingCart(ShoppingCart4Public shoppingCart) throws PersistenceException {
		result = IconConstants.CART;
	}

	@Override
	public void handleOrderQuantifiedArticle(OrderQuantifiedArticle4Public orderQuantifiedArticle) throws PersistenceException {
		result = IconConstants.ARTICLE;
	}

	@Override
	public void handleCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public customerDeliveryTimeManager) throws PersistenceException {
		result = IconConstants.DELIVERY_TIME;
	}

	@Override
	public void handleCustomerDeliveryTime(CustomerDeliveryTime4Public customerDeliveryTime) throws PersistenceException {
		result = IconConstants.DELIVERY_TIME;
	}

	@Override
	public void handleSettings(Settings4Public settings) throws PersistenceException {
		result = IconConstants.SETTINGS;
	}

	@Override
	public void handleProducerLst(ProducerLst4Public producerLst) throws PersistenceException {
		result = IconConstants.PRODUCER;
	}

	@Override
	public void handleArticleReturn(ArticleReturn4Public articleReturn) throws PersistenceException {
		result = IconConstants.RETURN;
	}

	@Override
	public void handleReturnManager(ReturnManager4Public returnManager) throws PersistenceException {
		result = IconConstants.RETURN;
	}

	@Override
	public void handleOwnerOrderManager(OwnerOrderManager4Public ownerOrderManager) throws PersistenceException {
		result = IconConstants.ORDER;
	}

	@Override
	public void handleCustomerOrderManager(CustomerOrderManager4Public customerOrderManager) throws PersistenceException {
		result = IconConstants.ORDER;
	}

	@Override
	public void handleOrder(Order4Public order) throws PersistenceException {
		result = IconConstants.ORDER;
	}

	@Override
	public void handleReOrderManager(ReOrderManager4Public reOrderManager) throws PersistenceException {
		result = IconConstants.REORDER;
	}

	@Override
	public void handleCustomerArticleLst(CustomerArticleLst4Public customerArticleLst) throws PersistenceException {
		result = IconConstants.SEARCH_LIST;
	}

	@Override
	public void handleReOrderQuantifiedArticle(ReOrderQuantifiedArticle4Public reOrderQuantifiedArticle) throws PersistenceException {
		result = IconConstants.ARTICLE;
	}

	@Override
	public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException {
		result = IconConstants.ARTICLE;
	}

	@Override
	public void handleReturnQuantifiedArticle(ReturnQuantifiedArticle4Public returnQuantifiedArticle) throws PersistenceException {
		result = IconConstants.ARTICLE;
	}


}
