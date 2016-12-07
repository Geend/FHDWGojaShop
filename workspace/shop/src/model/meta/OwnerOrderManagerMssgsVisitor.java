package model.meta;

public interface OwnerOrderManagerMssgsVisitor extends OwnerOrderManagerDOWNMssgsVisitor, OwnerOrderManagerUPMssgsVisitor {}


interface OwnerOrderManagerDOWNMssgsVisitor  {

    
}


interface OwnerOrderManagerUPMssgsVisitor extends OrderManagerUPMssgsVisitor, BackgroundTaskUPMssgsVisitor {

    
}
