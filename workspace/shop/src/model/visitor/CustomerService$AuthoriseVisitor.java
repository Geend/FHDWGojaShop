
package model.visitor;

import persistence.*;

public abstract class CustomerService$AuthoriseVisitor extends AnythingStandardVisitor{
    
    public abstract void handleOrderArticleWrapper(PersistentOrderArticleWrapper orderArticleWrapper) throws PersistenceException;
    public abstract void handleStandardArticleWrapper(PersistentStandardArticleWrapper standardArticleWrapper) throws PersistenceException;
    public abstract void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException;
    public abstract void handleRemainingStock(PersistentRemainingStock remainingStock) throws PersistenceException;
    public abstract void handleDefaultProductGroupWrapper(PersistentDefaultProductGroupWrapper defaultProductGroupWrapper) throws PersistenceException;
    public abstract void handleRootProductGroup(PersistentRootProductGroup rootProductGroup) throws PersistenceException;
    public abstract void handleArticle(PersistentArticle article) throws PersistenceException;
    public abstract void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public abstract void handleNotInSale(PersistentNotInSale notInSale) throws PersistenceException;
    public abstract void handleSubProductGroup(PersistentSubProductGroup subProductGroup) throws PersistenceException;
    public abstract void handleInSale(PersistentInSale inSale) throws PersistenceException;
    public abstract void handleProducer(PersistentProducer producer) throws PersistenceException;
    public abstract void handleShoppingCart(PersistentShoppingCart shoppingCart) throws PersistenceException;
    public abstract void handleCustomerShopArticleWrapper(PersistentCustomerShopArticleWrapper customerShopArticleWrapper) throws PersistenceException;
    public abstract void handleOwnerArticleWrapper(PersistentOwnerArticleWrapper ownerArticleWrapper) throws PersistenceException;
    public abstract void handleShoppingCartQuantifiedArticle(PersistentShoppingCartQuantifiedArticle shoppingCartQuantifiedArticle) throws PersistenceException;
    public abstract void handleNewCreated(PersistentNewCreated newCreated) throws PersistenceException;
    public abstract void handleShopArticleWrapper(PersistentShopArticleWrapper shopArticleWrapper) throws PersistenceException;
    public abstract void handleShoppingCartArticleWrapper(PersistentShoppingCartArticleWrapper shoppingCartArticleWrapper) throws PersistenceException;
    
}
