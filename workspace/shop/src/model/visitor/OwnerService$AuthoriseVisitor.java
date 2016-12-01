
package model.visitor;

import persistence.*;

public abstract class OwnerService$AuthoriseVisitor extends AnythingStandardVisitor{
    
    public abstract void handleProducerLst(PersistentProducerLst producerLst) throws PersistenceException;
    public abstract void handlePreOrderState(PersistentPreOrderState preOrderState) throws PersistenceException;
    public abstract void handleReturnManager(PersistentReturnManager returnManager) throws PersistenceException;
    public abstract void handleRemainingStock(PersistentRemainingStock remainingStock) throws PersistenceException;
    public abstract void handleOrderQuantifiedArticle(PersistentOrderQuantifiedArticle orderQuantifiedArticle) throws PersistenceException;
    public abstract void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public abstract void handleArticle(PersistentArticle article) throws PersistenceException;
    public abstract void handleReOrderQuantifiedArticle(PersistentReOrderQuantifiedArticle reOrderQuantifiedArticle) throws PersistenceException;
    public abstract void handleNotInSale(PersistentNotInSale notInSale) throws PersistenceException;
    public abstract void handleOwnerOrderManager(PersistentOwnerOrderManager ownerOrderManager) throws PersistenceException;
    public abstract void handleSubProductGroup(PersistentSubProductGroup subProductGroup) throws PersistenceException;
    public abstract void handleProcessingOrderState(PersistentProcessingOrderState processingOrderState) throws PersistenceException;
    public abstract void handleCustomerDeliveryTime(PersistentCustomerDeliveryTime customerDeliveryTime) throws PersistenceException;
    public abstract void handleOwnerService(PersistentOwnerService ownerService) throws PersistenceException;
    public abstract void handleFinishedOrderState(PersistentFinishedOrderState finishedOrderState) throws PersistenceException;
    public abstract void handleNewCreated(PersistentNewCreated newCreated) throws PersistenceException;
    public abstract void handleCustomerDeliveryTimeManager(PersistentCustomerDeliveryTimeManager customerDeliveryTimeManager) throws PersistenceException;
    public abstract void handleSettings(PersistentSettings settings) throws PersistenceException;
    public abstract void handleOrder(PersistentOrder order) throws PersistenceException;
    public abstract void handleWaitingForAcceptOrderState(PersistentWaitingForAcceptOrderState waitingForAcceptOrderState) throws PersistenceException;
    public abstract void handleRootProductGroup(PersistentRootProductGroup rootProductGroup) throws PersistenceException;
    public abstract void handleInSale(PersistentInSale inSale) throws PersistenceException;
    public abstract void handleReturnQuantifiedArticle(PersistentReturnQuantifiedArticle returnQuantifiedArticle) throws PersistenceException;
    public abstract void handleReOrderManager(PersistentReOrderManager reOrderManager) throws PersistenceException;
    public abstract void handleInTransitOrderState(PersistentInTransitOrderState inTransitOrderState) throws PersistenceException;
    public abstract void handleProducer(PersistentProducer producer) throws PersistenceException;
    public abstract void handleArticleReturn(PersistentArticleReturn articleReturn) throws PersistenceException;
    public abstract void handleArticleWrapper(PersistentArticleWrapper articleWrapper) throws PersistenceException;
    
}
