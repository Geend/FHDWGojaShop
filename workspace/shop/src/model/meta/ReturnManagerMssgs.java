package model.meta;

public interface ReturnManagerMssgs {
    void accept(ReturnManagerMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ReturnManagerDOWNMssgs extends Mssgs, ReturnManagerMssgs{}
interface ReturnManagerUPMssgs extends Mssgs, ReturnManagerMssgs{}
