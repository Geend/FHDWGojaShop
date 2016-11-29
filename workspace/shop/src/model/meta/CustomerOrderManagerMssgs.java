package model.meta;

public interface CustomerOrderManagerMssgs {
    void accept(CustomerOrderManagerMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CustomerOrderManagerDOWNMssgs extends OrderManagerDOWNMssgs, CustomerOrderManagerMssgs{}
interface CustomerOrderManagerUPMssgs extends Mssgs, CustomerOrderManagerMssgs{}
