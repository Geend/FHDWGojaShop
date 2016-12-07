package model.meta;

public interface ProductGroupMssgs {
    void accept(ProductGroupMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ProductGroupDOWNMssgs extends ComponentDOWNMssgs, ComponentContainerDOWNMssgs, ProductGroupMssgs{}
interface ProductGroupUPMssgs extends Mssgs, ProductGroupMssgs{}
