
package model.visitor;

import persistence.*;

public interface OrderStatusVisitor {
    
    public void handleArticlesInReturnOrderState(ArticlesInReturnOrderState4Public articlesInReturnOrderState) throws PersistenceException;
    public void handleFinishedOrderState(FinishedOrderState4Public finishedOrderState) throws PersistenceException;
    public void handleInTransitOrderState(InTransitOrderState4Public inTransitOrderState) throws PersistenceException;
    public void handlePreOrderState(PreOrderState4Public preOrderState) throws PersistenceException;
    public void handleProcessingOrderState(ProcessingOrderState4Public processingOrderState) throws PersistenceException;
    public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderState4Public waitingForAcceptOrderState) throws PersistenceException;
    
}
