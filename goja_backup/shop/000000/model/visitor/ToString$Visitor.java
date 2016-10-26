
package model.visitor;

import persistence.*;

public abstract class ToString$Visitor extends AnythingStandardVisitor{
    
    public abstract void handleOrder(PersistentOrder order) throws PersistenceException;
    public abstract void handleOrderArticleWrapper(PersistentOrderArticleWrapper orderArticleWrapper) throws PersistenceException;
    public abstract void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException;
    public abstract void handleRemainingStock(PersistentRemainingStock remainingStock) throws PersistenceException;
    public abstract void handleOrderQuantifiedArticle(PersistentOrderQuantifiedArticle orderQuantifiedArticle) throws PersistenceException;
    public abstract void handleServer(PersistentServer server) throws PersistenceException;
    public abstract void handleArticle(PersistentArticle article) throws PersistenceException;
    public abstract void handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException;
    public abstract void handleNotInSale(PersistentNotInSale notInSale) throws PersistenceException;
    public abstract void handleCustomerAccount(PersistentCustomerAccount customerAccount) throws PersistenceException;
    public abstract void handleInSale(PersistentInSale inSale) throws PersistenceException;
    public abstract void handleCustomerDeliveryTime(PersistentCustomerDeliveryTime customerDeliveryTime) throws PersistenceException;
    public abstract void handleProducer(PersistentProducer producer) throws PersistenceException;
    public abstract void handleShoppingCart(PersistentShoppingCart shoppingCart) throws PersistenceException;
    public abstract void handleShoppingCartQuantifiedArticle(PersistentShoppingCartQuantifiedArticle shoppingCartQuantifiedArticle) throws PersistenceException;
    public abstract void handleNewCreated(PersistentNewCreated newCreated) throws PersistenceException;
    public abstract void handleShopArticleWrapper(PersistentShopArticleWrapper shopArticleWrapper) throws PersistenceException;
    public abstract void handleShoppingCartArticleWrapper(PersistentShoppingCartArticleWrapper shoppingCartArticleWrapper) throws PersistenceException;
    
}
