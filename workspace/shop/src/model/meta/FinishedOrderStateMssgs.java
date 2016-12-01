package model.meta;

public interface FinishedOrderStateMssgs {
    void accept(FinishedOrderStateMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface FinishedOrderStateDOWNMssgs extends OrderStateDOWNMssgs, FinishedOrderStateMssgs{}
interface FinishedOrderStateUPMssgs extends Mssgs, FinishedOrderStateMssgs{}
