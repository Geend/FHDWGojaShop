package model.meta;

public interface OrderManagerMssgsVisitor extends OrderManagerDOWNMssgsVisitor, OrderManagerUPMssgsVisitor {}


interface OrderManagerDOWNMssgsVisitor extends OwnerOrderManagerDOWNMssgsVisitor, CustomerOrderManagerDOWNMssgsVisitor, BackgroundTaskUPMssgsVisitor {

    
}


interface OrderManagerUPMssgsVisitor  {

    
}