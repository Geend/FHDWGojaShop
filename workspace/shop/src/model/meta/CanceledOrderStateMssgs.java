package model.meta;

public interface CanceledOrderStateMssgs {
    void accept(CanceledOrderStateMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CanceledOrderStateDOWNMssgs extends OrderStatusDOWNMssgs, CanceledOrderStateMssgs{}
interface CanceledOrderStateUPMssgs extends Mssgs, CanceledOrderStateMssgs{}
