
package model.visitor;

import persistence.*;

public interface OrderStateExceptionVisitor<E extends model.UserException> {
    
    public void handleFinishedOrderState(FinishedOrderState4Public finishedOrderState) throws PersistenceException, E;
    public void handleInTransitOrderState(InTransitOrderState4Public inTransitOrderState) throws PersistenceException, E;
    public void handlePreOrderState(PreOrderState4Public preOrderState) throws PersistenceException, E;
    public void handleProcessingOrderState(ProcessingOrderState4Public processingOrderState) throws PersistenceException, E;
    public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderState4Public waitingForAcceptOrderState) throws PersistenceException, E;
    
}
