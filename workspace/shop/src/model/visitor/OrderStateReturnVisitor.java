
package model.visitor;

import persistence.*;

public interface OrderStateReturnVisitor<R> {
    
    public R handleFinishedOrderState(FinishedOrderState4Public finishedOrderState) throws PersistenceException;
    public R handleInTransitOrderState(InTransitOrderState4Public inTransitOrderState) throws PersistenceException;
    public R handlePreOrderState(PreOrderState4Public preOrderState) throws PersistenceException;
    public R handleProcessingOrderState(ProcessingOrderState4Public processingOrderState) throws PersistenceException;
    public R handleWaitingForAcceptOrderState(WaitingForAcceptOrderState4Public waitingForAcceptOrderState) throws PersistenceException;
    
}
