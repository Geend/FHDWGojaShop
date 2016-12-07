
package view.visitor;

import view.*;

public interface OrderStateReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleArticlesInReturnOrderState(ArticlesInReturnOrderStateView articlesInReturnOrderState) throws ModelException, E;
    public R handleFinishedOrderState(FinishedOrderStateView finishedOrderState) throws ModelException, E;
    public R handleInTransitOrderState(InTransitOrderStateView inTransitOrderState) throws ModelException, E;
    public R handlePreOrderState(PreOrderStateView preOrderState) throws ModelException, E;
    public R handleProcessingOrderState(ProcessingOrderStateView processingOrderState) throws ModelException, E;
    public R handleWaitingForAcceptOrderState(WaitingForAcceptOrderStateView waitingForAcceptOrderState) throws ModelException, E;
    
}
