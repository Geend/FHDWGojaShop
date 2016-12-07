package model.meta;

public interface ComponentMssgsVisitor extends ComponentDOWNMssgsVisitor, ComponentUPMssgsVisitor {}


interface ComponentDOWNMssgsVisitor extends ProductGroupDOWNMssgsVisitor, ArticleWrapperDOWNMssgsVisitor, ComponentContainerUPMssgsVisitor {

    public void handleComponentMoveToComponentContainerMssg(ComponentMoveToComponentContainerMssg event) throws persistence.PersistenceException;
    
}


interface ComponentUPMssgsVisitor  {

    public void handleComponentMoveToComponentContainerMssg(ComponentMoveToComponentContainerMssg event) throws persistence.PersistenceException;
    
}
