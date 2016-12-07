
package view.visitor;

import view.*;

public interface OrderStatusVisitor {
    
    public void handleArticlesInReturnOrderState(ArticlesInReturnOrderStateView articlesInReturnOrderState) throws ModelException;
    public void handleFinishedOrderState(FinishedOrderStateView finishedOrderState) throws ModelException;
    public void handleInTransitOrderState(InTransitOrderStateView inTransitOrderState) throws ModelException;
    public void handlePreOrderState(PreOrderStateView preOrderState) throws ModelException;
    public void handleProcessingOrderState(ProcessingOrderStateView processingOrderState) throws ModelException;
    public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderStateView waitingForAcceptOrderState) throws ModelException;
    
}
