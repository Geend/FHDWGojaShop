package model.meta;

public interface OwnerOrderManagerMssgs {
    void accept(OwnerOrderManagerMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface OwnerOrderManagerDOWNMssgs extends OrderManagerDOWNMssgs, OwnerOrderManagerMssgs{}
interface OwnerOrderManagerUPMssgs extends Mssgs, OwnerOrderManagerMssgs{}
