package model.meta;

public interface BackgroundTaskMssgsVisitor extends BackgroundTaskDOWNMssgsVisitor, BackgroundTaskUPMssgsVisitor {}


interface BackgroundTaskDOWNMssgsVisitor extends GlobalOrderManagerDOWNMssgsVisitor, ReOrderManagerDOWNMssgsVisitor, OrderManagerUPMssgsVisitor {

    
}


interface BackgroundTaskUPMssgsVisitor  {

    
}
