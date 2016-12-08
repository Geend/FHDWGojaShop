package model.meta;

public interface WaitingForAcceptOrderStateMssgs {
    void accept(WaitingForAcceptOrderStateMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface WaitingForAcceptOrderStateDOWNMssgs extends OrderStatusDOWNMssgs, WaitingForAcceptOrderStateMssgs{}
interface WaitingForAcceptOrderStateUPMssgs extends Mssgs, WaitingForAcceptOrderStateMssgs{}
