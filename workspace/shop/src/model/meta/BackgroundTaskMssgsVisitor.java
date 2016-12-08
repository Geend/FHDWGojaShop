package model.meta;

public interface BackgroundTaskMssgsVisitor extends BackgroundTaskDOWNMssgsVisitor, BackgroundTaskUPMssgsVisitor {}


interface BackgroundTaskDOWNMssgsVisitor extends GlobalOrderManagerDOWNMssgsVisitor, ReOrderManagerDOWNMssgsVisitor, OrderManagerUPMssgsVisitor {

    public void handleBackgroundTaskStepMssg(BackgroundTaskStepMssg event) throws persistence.PersistenceException;
    
}


interface BackgroundTaskUPMssgsVisitor  {

    public void handleBackgroundTaskStepMssg(BackgroundTaskStepMssg event) throws persistence.PersistenceException;
    
}
