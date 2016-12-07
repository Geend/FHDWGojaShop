package model.meta;

public interface BackgroundTaskMssgsVisitor extends BackgroundTaskDOWNMssgsVisitor, BackgroundTaskUPMssgsVisitor {}


interface BackgroundTaskDOWNMssgsVisitor extends ReOrderManagerDOWNMssgsVisitor, OwnerOrderManagerDOWNMssgsVisitor, OrderManagerUPMssgsVisitor {

    
}


interface BackgroundTaskUPMssgsVisitor  {

    
}
