package model.meta;

public interface InTransitOrderStateMssgs {
    void accept(InTransitOrderStateMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface InTransitOrderStateDOWNMssgs extends OrderStateDOWNMssgs, InTransitOrderStateMssgs{}
interface InTransitOrderStateUPMssgs extends Mssgs, InTransitOrderStateMssgs{}
