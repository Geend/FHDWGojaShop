package model.meta;

public interface CustomerAccountMssgs {
    void accept(CustomerAccountMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CustomerAccountDOWNMssgs extends Mssgs, CustomerAccountMssgs{}
interface CustomerAccountUPMssgs extends Mssgs, CustomerAccountMssgs{}
