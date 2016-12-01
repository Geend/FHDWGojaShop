
package model.visitor;

import persistence.*;

public abstract class CustomerService$AuthoriseVisitor extends AnythingStandardVisitor{
    
    public abstract void handlePreOrderState(PersistentPreOrderState preOrderState) throws PersistenceException;
    public abstract void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException;
    public abstract void handleRemainingStock(PersistentRemainingStock remainingStock) throws PersistenceException;
    public abstract void handleOrderQuantifiedArticle(PersistentOrderQuantifiedArticle orderQuantifiedArticle) throws PersistenceException;
    public abstract void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public abstract void handleArticle(PersistentArticle article) throws PersistenceException;
    public abstract void handleNotInSale(PersistentNotInSale notInSale) throws PersistenceException;
    public abstract void handleSubProductGroup(PersistentSubProductGroup subProductGroup) throws PersistenceException;
    public abstract void handleProcessingOrderState(PersistentProcessingOrderState processingOrderState) throws PersistenceException;
    public abstract void handleCustomerDeliveryTime(PersistentCustomerDeliveryTime customerDeliveryTime) throws PersistenceException;
    public abstract void handleFinishedOrderState(PersistentFinishedOrderState finishedOrderState) throws PersistenceException;
    public abstract void handleCustomerArticleLst(PersistentCustomerArticleLst customerArticleLst) throws PersistenceException;
    public abstract void handleShoppingCartQuantifiedArticle(PersistentShoppingCartQuantifiedArticle shoppingCartQuantifiedArticle) throws PersistenceException;
    public abstract void handleNewCreated(PersistentNewCreated newCreated) throws PersistenceException;
    public abstract void handleCustomerDeliveryTimeManager(PersistentCustomerDeliveryTimeManager customerDeliveryTimeManager) throws PersistenceException;
    public abstract void handleOrder(PersistentOrder order) throws PersistenceException;
    public abstract void handleWaitingForAcceptOrderState(PersistentWaitingForAcceptOrderState waitingForAcceptOrderState) throws PersistenceException;
    public abstract void handleRootProductGroup(PersistentRootProductGroup rootProductGroup) throws PersistenceException;
    public abstract void handleCustomerAccount(PersistentCustomerAccount customerAccount) throws PersistenceException;
    public abstract void handleInSale(PersistentInSale inSale) throws PersistenceException;
    public abstract void handleInTransitOrderState(PersistentInTransitOrderState inTransitOrderState) throws PersistenceException;
    public abstract void handleProducer(PersistentProducer producer) throws PersistenceException;
    public abstract void handleShoppingCart(PersistentShoppingCart shoppingCart) throws PersistenceException;
    public abstract void handleCustomerOrderManager(PersistentCustomerOrderManager customerOrderManager) throws PersistenceException;
    public abstract void handleArticleWrapper(PersistentArticleWrapper articleWrapper) throws PersistenceException;
    
}
