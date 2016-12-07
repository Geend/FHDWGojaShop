package model.meta;

public interface PreOrderStateMssgs {
    void accept(PreOrderStateMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface PreOrderStateDOWNMssgs extends OrderStatusDOWNMssgs, PreOrderStateMssgs{}
interface PreOrderStateUPMssgs extends Mssgs, PreOrderStateMssgs{}
