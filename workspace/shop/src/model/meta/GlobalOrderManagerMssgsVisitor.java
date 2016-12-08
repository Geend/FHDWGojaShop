package model.meta;

public interface GlobalOrderManagerMssgsVisitor extends GlobalOrderManagerDOWNMssgsVisitor, GlobalOrderManagerUPMssgsVisitor {}


interface GlobalOrderManagerDOWNMssgsVisitor  {

    
}


interface GlobalOrderManagerUPMssgsVisitor extends OrderManagerUPMssgsVisitor, BackgroundTaskUPMssgsVisitor {

    
}
