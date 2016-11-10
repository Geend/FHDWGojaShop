package model.meta;

public interface ProductGroupMssgs {
    void accept(ProductGroupMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ProductGroupDOWNMssgs extends ComponentDOWNMssgs, ProductGroupMssgs{}
interface ProductGroupUPMssgs extends RootProductGroupUPMssgs, SubProductGroupUPMssgs, ProductGroupMssgs{}
