package model.meta;

public interface ComponentMssgsVisitor extends ComponentDOWNMssgsVisitor, ComponentUPMssgsVisitor {}


interface ComponentDOWNMssgsVisitor extends ProductGroupDOWNMssgsVisitor, ArticleWrapperDOWNMssgsVisitor, ComponentContainerUPMssgsVisitor {

    
}


interface ComponentUPMssgsVisitor  {

    
}
