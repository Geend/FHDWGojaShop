package model.meta;

public interface OrderManagerMssgs {
    void accept(OrderManagerMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface OrderManagerDOWNMssgs extends Mssgs, OrderManagerMssgs{}
interface OrderManagerUPMssgs extends GlobalOrderManagerUPMssgs, CustomerOrderManagerUPMssgs, OrderManagerMssgs{}
