package model.meta;

public interface OwnerServiceMssgs {
    void accept(OwnerServiceMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface OwnerServiceDOWNMssgs extends ServiceDOWNMssgs, OwnerServiceMssgs{}
interface OwnerServiceUPMssgs extends Mssgs, OwnerServiceMssgs{}
