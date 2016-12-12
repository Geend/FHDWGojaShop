
package model.visitor;

import persistence.*;

public interface OrderStatusExceptionVisitor<E extends model.UserException> {
    
    public void handleArticlesInReturnOrderState(ArticlesInReturnOrderState4Public articlesInReturnOrderState) throws PersistenceException, E;
    public void handleCanceledOrderState(CanceledOrderState4Public canceledOrderState) throws PersistenceException, E;
    public void handleFinishedOrderState(FinishedOrderState4Public finishedOrderState) throws PersistenceException, E;
    public void handleInTransitOrderState(InTransitOrderState4Public inTransitOrderState) throws PersistenceException, E;
    public void handlePreOrderState(PreOrderState4Public preOrderState) throws PersistenceException, E;
    public void handleProcessingOrderState(ProcessingOrderState4Public processingOrderState) throws PersistenceException, E;
    public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderState4Public waitingForAcceptOrderState) throws PersistenceException, E;
    
}
