package model.meta;

public interface SubProductGroupMssgs {
    void accept(SubProductGroupMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface SubProductGroupDOWNMssgs extends ProductGroupDOWNMssgs, SubComponentDOWNMssgs, SubProductGroupMssgs{}
interface SubProductGroupUPMssgs extends Mssgs, SubProductGroupMssgs{}
