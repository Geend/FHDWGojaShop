
package model.visitor;

import persistence.*;

public interface OrderStatusReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleArticlesInReturnOrderState(ArticlesInReturnOrderState4Public articlesInReturnOrderState) throws PersistenceException, E;
    public R handleCanceledOrderState(CanceledOrderState4Public canceledOrderState) throws PersistenceException, E;
    public R handleFinishedOrderState(FinishedOrderState4Public finishedOrderState) throws PersistenceException, E;
    public R handleInTransitOrderState(InTransitOrderState4Public inTransitOrderState) throws PersistenceException, E;
    public R handlePreOrderState(PreOrderState4Public preOrderState) throws PersistenceException, E;
    public R handleProcessingOrderState(ProcessingOrderState4Public processingOrderState) throws PersistenceException, E;
    public R handleWaitingForAcceptOrderState(WaitingForAcceptOrderState4Public waitingForAcceptOrderState) throws PersistenceException, E;
    
}
