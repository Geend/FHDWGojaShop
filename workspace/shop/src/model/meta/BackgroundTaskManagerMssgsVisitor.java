package model.meta;

public interface BackgroundTaskManagerMssgsVisitor extends BackgroundTaskManagerDOWNMssgsVisitor, BackgroundTaskManagerUPMssgsVisitor {}


interface BackgroundTaskManagerDOWNMssgsVisitor  {

    public void handleBackgroundTaskManagerStepMssg(BackgroundTaskManagerStepMssg event) throws persistence.PersistenceException;
    
}


interface BackgroundTaskManagerUPMssgsVisitor  {

    public void handleBackgroundTaskManagerStepMssg(BackgroundTaskManagerStepMssg event) throws persistence.PersistenceException;
    
}
