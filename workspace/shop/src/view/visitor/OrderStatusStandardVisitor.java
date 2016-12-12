
package view.visitor;

import view.*;

public abstract class OrderStatusStandardVisitor implements OrderStatusVisitor {
    
    public void handlePreOrderState(PreOrderStateView preOrderState) throws ModelException{
        this.standardHandling(preOrderState);
    }
    public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderStateView waitingForAcceptOrderState) throws ModelException{
        this.standardHandling(waitingForAcceptOrderState);
    }
    public void handleArticlesInReturnOrderState(ArticlesInReturnOrderStateView articlesInReturnOrderState) throws ModelException{
        this.standardHandling(articlesInReturnOrderState);
    }
    public void handleFinishedOrderState(FinishedOrderStateView finishedOrderState) throws ModelException{
        this.standardHandling(finishedOrderState);
    }
    public void handleCanceledOrderState(CanceledOrderStateView canceledOrderState) throws ModelException{
        this.standardHandling(canceledOrderState);
    }
    public void handleProcessingOrderState(ProcessingOrderStateView processingOrderState) throws ModelException{
        this.standardHandling(processingOrderState);
    }
    public void handleInTransitOrderState(InTransitOrderStateView inTransitOrderState) throws ModelException{
        this.standardHandling(inTransitOrderState);
    }
    protected abstract void standardHandling(OrderStatusView orderStatus) throws ModelException;
}
