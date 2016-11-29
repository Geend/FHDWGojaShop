package model.meta;

public interface ActiveOrderMssgs {
    void accept(ActiveOrderMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ActiveOrderDOWNMssgs extends OrderStateDOWNMssgs, ActiveOrderMssgs{}
interface ActiveOrderUPMssgs extends Mssgs, ActiveOrderMssgs{}
