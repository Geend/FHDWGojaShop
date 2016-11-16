package model.meta;

public interface ProductGroupMssgsVisitor extends ProductGroupDOWNMssgsVisitor, ProductGroupUPMssgsVisitor {}


interface ProductGroupDOWNMssgsVisitor extends SubProductGroupDOWNMssgsVisitor, RootProductGroupDOWNMssgsVisitor, SubComponentUPMssgsVisitor {

    public void handleProductGroupAddComponentWrapperComponentWrapperMssg(ProductGroupAddComponentWrapperComponentWrapperMssg event) throws persistence.PersistenceException;
    public void handleProductGroupRemoveComponentComponentMssg(ProductGroupRemoveComponentComponentMssg event) throws persistence.PersistenceException;
    
}


interface ProductGroupUPMssgsVisitor extends ComponentUPMssgsVisitor {

    public void handleProductGroupAddComponentWrapperComponentWrapperMssg(ProductGroupAddComponentWrapperComponentWrapperMssg event) throws persistence.PersistenceException;
    public void handleProductGroupRemoveComponentComponentMssg(ProductGroupRemoveComponentComponentMssg event) throws persistence.PersistenceException;
    
}
