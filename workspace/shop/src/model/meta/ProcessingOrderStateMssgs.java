package model.meta;

public interface ProcessingOrderStateMssgs {
    void accept(ProcessingOrderStateMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ProcessingOrderStateDOWNMssgs extends OrderStatusDOWNMssgs, ProcessingOrderStateMssgs{}
interface ProcessingOrderStateUPMssgs extends Mssgs, ProcessingOrderStateMssgs{}
