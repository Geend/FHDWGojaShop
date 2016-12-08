package model.meta;

public interface ComponentContainerMssgsVisitor extends ComponentContainerDOWNMssgsVisitor, ComponentContainerUPMssgsVisitor {}


interface ComponentContainerDOWNMssgsVisitor extends ProductGroupDOWNMssgsVisitor, ComponentContainerImplementationDOWNMssgsVisitor, ComponentManagerDOWNMssgsVisitor, ComponentUPMssgsVisitor {

    
}


interface ComponentContainerUPMssgsVisitor  {

    
}
