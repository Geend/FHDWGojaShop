package model.meta;

public interface ReOrderManagerMssgsVisitor extends ReOrderManagerDOWNMssgsVisitor, ReOrderManagerUPMssgsVisitor {}


interface ReOrderManagerDOWNMssgsVisitor  {

    public void handleReOrderManagerDoReorderStepMssg(ReOrderManagerDoReorderStepMssg event) throws persistence.PersistenceException;
    
}


interface ReOrderManagerUPMssgsVisitor extends BackgroundTaskUPMssgsVisitor {

    public void handleReOrderManagerDoReorderStepMssg(ReOrderManagerDoReorderStepMssg event) throws persistence.PersistenceException;
    
}
