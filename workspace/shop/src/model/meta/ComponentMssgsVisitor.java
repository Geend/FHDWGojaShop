package model.meta;

public interface ComponentMssgsVisitor extends ComponentDOWNMssgsVisitor, ComponentUPMssgsVisitor {}


interface ComponentDOWNMssgsVisitor extends ProductGroupDOWNMssgsVisitor, ArticleWrapperDOWNMssgsVisitor, ArticleDOWNMssgsVisitor, SubComponentUPMssgsVisitor {

    
}


interface ComponentUPMssgsVisitor  {

    
}
