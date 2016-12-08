package model.meta;

public interface CustomerRegisterServiceMssgs {
    void accept(CustomerRegisterServiceMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CustomerRegisterServiceDOWNMssgs extends ServiceDOWNMssgs, CustomerRegisterServiceMssgs{}
interface CustomerRegisterServiceUPMssgs extends Mssgs, CustomerRegisterServiceMssgs{}
