package model.meta;

public interface CustomerOrderManagerMssgsVisitor extends CustomerOrderManagerDOWNMssgsVisitor, CustomerOrderManagerUPMssgsVisitor {}


interface CustomerOrderManagerDOWNMssgsVisitor  {

    
}


interface CustomerOrderManagerUPMssgsVisitor extends OrderManagerUPMssgsVisitor {

    
}
