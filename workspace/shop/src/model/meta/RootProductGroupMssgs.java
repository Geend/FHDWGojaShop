package model.meta;

public interface RootProductGroupMssgs {
    void accept(RootProductGroupMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface RootProductGroupDOWNMssgs extends ProductGroupDOWNMssgs, RootProductGroupMssgs{}
interface RootProductGroupUPMssgs extends Mssgs, RootProductGroupMssgs{}
