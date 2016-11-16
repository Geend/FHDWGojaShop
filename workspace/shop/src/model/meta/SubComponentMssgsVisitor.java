package model.meta;

public interface SubComponentMssgsVisitor extends SubComponentDOWNMssgsVisitor, SubComponentUPMssgsVisitor {}


interface SubComponentDOWNMssgsVisitor extends ArticleDOWNMssgsVisitor, SubProductGroupDOWNMssgsVisitor, ProductGroupUPMssgsVisitor {

    public void handleSubComponentMoveToProductGroupMssg(SubComponentMoveToProductGroupMssg event) throws persistence.PersistenceException;
    
}


interface SubComponentUPMssgsVisitor  {

    public void handleSubComponentMoveToProductGroupMssg(SubComponentMoveToProductGroupMssg event) throws persistence.PersistenceException;
    
}
