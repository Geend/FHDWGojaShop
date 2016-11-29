package model.meta;

public interface FinishedOrderMssgs {
    void accept(FinishedOrderMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface FinishedOrderDOWNMssgs extends OrderStateDOWNMssgs, FinishedOrderMssgs{}
interface FinishedOrderUPMssgs extends Mssgs, FinishedOrderMssgs{}
