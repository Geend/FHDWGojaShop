
package view.visitor;

import view.*;

public interface OrderStateExceptionVisitor<E extends view.UserException> {
    
    public void handleArticlesInReturnOrderState(ArticlesInReturnOrderStateView articlesInReturnOrderState) throws ModelException, E;
    public void handleFinishedOrderState(FinishedOrderStateView finishedOrderState) throws ModelException, E;
    public void handleInTransitOrderState(InTransitOrderStateView inTransitOrderState) throws ModelException, E;
    public void handlePreOrderState(PreOrderStateView preOrderState) throws ModelException, E;
    public void handleProcessingOrderState(ProcessingOrderStateView processingOrderState) throws ModelException, E;
    public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderStateView waitingForAcceptOrderState) throws ModelException, E;
    
}
