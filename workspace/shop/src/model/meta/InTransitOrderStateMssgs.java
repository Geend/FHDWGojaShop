package model.meta;

public interface InTransitOrderStateMssgs {
    void accept(InTransitOrderStateMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface InTransitOrderStateDOWNMssgs extends OrderStatusDOWNMssgs, InTransitOrderStateMssgs{}
interface InTransitOrderStateUPMssgs extends Mssgs, InTransitOrderStateMssgs{}
