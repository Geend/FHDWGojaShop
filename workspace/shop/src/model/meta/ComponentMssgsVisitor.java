package model.meta;

public interface ComponentMssgsVisitor extends ComponentDOWNMssgsVisitor, ComponentUPMssgsVisitor {}


interface ComponentDOWNMssgsVisitor extends ProductGroupDOWNMssgsVisitor, ArticleDOWNMssgsVisitor, SubComponentUPMssgsVisitor {

    
}


interface ComponentUPMssgsVisitor  {

    
}
