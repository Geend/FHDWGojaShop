
package view.visitor;

import view.*;

public interface OrderStateVisitor {
    
    public void handleFinishedOrderState(FinishedOrderStateView finishedOrderState) throws ModelException;
    public void handleInTransitOrderState(InTransitOrderStateView inTransitOrderState) throws ModelException;
    public void handlePreOrderState(PreOrderStateView preOrderState) throws ModelException;
    public void handleProcessingOrderState(ProcessingOrderStateView processingOrderState) throws ModelException;
    public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderStateView waitingForAcceptOrderState) throws ModelException;
    
}
