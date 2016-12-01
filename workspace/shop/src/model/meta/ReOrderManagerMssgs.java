package model.meta;

public interface ReOrderManagerMssgs {
    void accept(ReOrderManagerMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ReOrderManagerDOWNMssgs extends Mssgs, ReOrderManagerMssgs{}
interface ReOrderManagerUPMssgs extends Mssgs, ReOrderManagerMssgs{}
