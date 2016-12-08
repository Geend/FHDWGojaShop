package model.meta;

public interface OrderManagerMssgsVisitor extends OrderManagerDOWNMssgsVisitor, OrderManagerUPMssgsVisitor {}


interface OrderManagerDOWNMssgsVisitor extends GlobalOrderManagerDOWNMssgsVisitor, CustomerOrderManagerDOWNMssgsVisitor, BackgroundTaskUPMssgsVisitor {

    
}


interface OrderManagerUPMssgsVisitor  {

    
}
