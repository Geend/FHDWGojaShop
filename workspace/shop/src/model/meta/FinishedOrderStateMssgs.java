package model.meta;

public interface FinishedOrderStateMssgs {
    void accept(FinishedOrderStateMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface FinishedOrderStateDOWNMssgs extends OrderStatusDOWNMssgs, FinishedOrderStateMssgs{}
interface FinishedOrderStateUPMssgs extends Mssgs, FinishedOrderStateMssgs{}
