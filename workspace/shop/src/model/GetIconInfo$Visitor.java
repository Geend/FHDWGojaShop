package model;

import constants.IconConstants;
import persistence.Anything;
import persistence.ArticleWrapper4Public;
import persistence.CustomerAccount4Public;
import persistence.CustomerDeliveryTime4Public;
import persistence.CustomerDeliveryTimeManager4Public;
import persistence.OrderQuantifiedArticle4Public;
import persistence.PersistenceException;
import persistence.Producer4Public;
import persistence.RootProductGroup4Public;
import persistence.Settings4Public;
import persistence.ShoppingCart4Public;
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
}
