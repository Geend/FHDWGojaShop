
package model.visitor;

import persistence.*;

public abstract class OrderStateStandardVisitor implements OrderStateVisitor {
    
    public void handlePreOrderState(PreOrderState4Public preOrderState) throws PersistenceException{
        this.standardHandling(preOrderState);
    }
    public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderState4Public waitingForAcceptOrderState) throws PersistenceException{
        this.standardHandling(waitingForAcceptOrderState);
    }
    public void handleFinishedOrderState(FinishedOrderState4Public finishedOrderState) throws PersistenceException{
        this.standardHandling(finishedOrderState);
    }
    public void handleProcessingOrderState(ProcessingOrderState4Public processingOrderState) throws PersistenceException{
        this.standardHandling(processingOrderState);
    }
    public void handleInTransitOrderState(InTransitOrderState4Public inTransitOrderState) throws PersistenceException{
        this.standardHandling(inTransitOrderState);
    }
    protected abstract void standardHandling(OrderState4Public orderState) throws PersistenceException;
}
