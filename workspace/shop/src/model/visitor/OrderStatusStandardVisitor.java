
package model.visitor;

import persistence.*;

public abstract class OrderStatusStandardVisitor implements OrderStatusVisitor {
    
    public void handlePreOrderState(PreOrderState4Public preOrderState) throws PersistenceException{
        this.standardHandling(preOrderState);
    }
    public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderState4Public waitingForAcceptOrderState) throws PersistenceException{
        this.standardHandling(waitingForAcceptOrderState);
    }
    public void handleArticlesInReturnOrderState(ArticlesInReturnOrderState4Public articlesInReturnOrderState) throws PersistenceException{
        this.standardHandling(articlesInReturnOrderState);
    }
    public void handleFinishedOrderState(FinishedOrderState4Public finishedOrderState) throws PersistenceException{
        this.standardHandling(finishedOrderState);
    }
    public void handleCanceledOrderState(CanceledOrderState4Public canceledOrderState) throws PersistenceException{
        this.standardHandling(canceledOrderState);
    }
    public void handleProcessingOrderState(ProcessingOrderState4Public processingOrderState) throws PersistenceException{
        this.standardHandling(processingOrderState);
    }
    public void handleInTransitOrderState(InTransitOrderState4Public inTransitOrderState) throws PersistenceException{
        this.standardHandling(inTransitOrderState);
    }
    protected abstract void standardHandling(OrderStatus4Public orderStatus) throws PersistenceException;
}
