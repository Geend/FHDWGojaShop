
package model.visitor;

import persistence.*;

public abstract class CustomerService$AuthoriseVisitor extends AnythingStandardVisitor{
    
    public abstract void handlePreOrderState(PersistentPreOrderState preOrderState) throws PersistenceException;
    public abstract void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException;
    public abstract void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException;
    public abstract void handleOrderQuantifiedArticle(PersistentOrderQuantifiedArticle orderQuantifiedArticle) throws PersistenceException;
    public abstract void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public abstract void handleProcessingOrderState(PersistentProcessingOrderState processingOrderState) throws PersistenceException;
    public abstract void handleComponentContainerImplementation(PersistentComponentContainerImplementation componentContainerImplementation) throws PersistenceException;
    public abstract void handleCustomerDeliveryTime(PersistentCustomerDeliveryTime customerDeliveryTime) throws PersistenceException;
    public abstract void handleFinishedOrderState(PersistentFinishedOrderState finishedOrderState) throws PersistenceException;
    public abstract void handleComponentManager(PersistentComponentManager componentManager) throws PersistenceException;
    public abstract void handleCustomerArticleLst(PersistentCustomerArticleLst customerArticleLst) throws PersistenceException;
    public abstract void handleShoppingCartQuantifiedArticle(PersistentShoppingCartQuantifiedArticle shoppingCartQuantifiedArticle) throws PersistenceException;
    public abstract void handleCustomerDeliveryTimeManager(PersistentCustomerDeliveryTimeManager customerDeliveryTimeManager) throws PersistenceException;
    public abstract void handleOrder(PersistentOrder order) throws PersistenceException;
    public abstract void handleWaitingForAcceptOrderState(PersistentWaitingForAcceptOrderState waitingForAcceptOrderState) throws PersistenceException;
    public abstract void handleOrderQuantifiedArticleNormalState(PersistentOrderQuantifiedArticleNormalState orderQuantifiedArticleNormalState) throws PersistenceException;
    public abstract void handleCustomerAccount(PersistentCustomerAccount customerAccount) throws PersistenceException;
    public abstract void handleReturnQuantifiedArticle(PersistentReturnQuantifiedArticle returnQuantifiedArticle) throws PersistenceException;
    public abstract void handleInTransitOrderState(PersistentInTransitOrderState inTransitOrderState) throws PersistenceException;
    public abstract void handleShop(PersistentShop shop) throws PersistenceException;
    public abstract void handleShoppingCart(PersistentShoppingCart shoppingCart) throws PersistenceException;
    public abstract void handleArticlesInReturnOrderState(PersistentArticlesInReturnOrderState articlesInReturnOrderState) throws PersistenceException;
    public abstract void handleOrderQuantifiedArticlePreOrder(PersistentOrderQuantifiedArticlePreOrder orderQuantifiedArticlePreOrder) throws PersistenceException;
    public abstract void handleCanceledOrderState(PersistentCanceledOrderState canceledOrderState) throws PersistenceException;
    public abstract void handleArticleReturn(PersistentArticleReturn articleReturn) throws PersistenceException;
    public abstract void handleOrderQuantifiedArticleMarkedForReturnState(PersistentOrderQuantifiedArticleMarkedForReturnState orderQuantifiedArticleMarkedForReturnState) throws PersistenceException;
    public abstract void handleCustomerOrderManager(PersistentCustomerOrderManager customerOrderManager) throws PersistenceException;
    public abstract void handleArticleWrapper(PersistentArticleWrapper articleWrapper) throws PersistenceException;
    
}
