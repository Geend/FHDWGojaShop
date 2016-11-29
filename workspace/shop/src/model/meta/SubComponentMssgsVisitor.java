package model.meta;

public interface SubComponentMssgsVisitor extends SubComponentDOWNMssgsVisitor, SubComponentUPMssgsVisitor {}


interface SubComponentDOWNMssgsVisitor extends SubProductGroupDOWNMssgsVisitor, ArticleWrapperDOWNMssgsVisitor, ProductGroupUPMssgsVisitor {

    public void handleSubComponentMoveToProductGroupMssg(SubComponentMoveToProductGroupMssg event) throws persistence.PersistenceException;
    
}


interface SubComponentUPMssgsVisitor  {

    public void handleSubComponentMoveToProductGroupMssg(SubComponentMoveToProductGroupMssg event) throws persistence.PersistenceException;
    
}
