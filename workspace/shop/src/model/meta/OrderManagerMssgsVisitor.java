package model.meta;

public interface OrderManagerMssgsVisitor extends OrderManagerDOWNMssgsVisitor, OrderManagerUPMssgsVisitor {}


interface OrderManagerDOWNMssgsVisitor extends CustomerOrderManagerDOWNMssgsVisitor {

    
}


interface OrderManagerUPMssgsVisitor  {

    
}
