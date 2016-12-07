package model.meta;

import persistence.*;

public class BackgroundTaskStepMssg implements BackgroundTaskDOWNMssgs,BackgroundTaskUPMssgs, OrderManagerDOWNMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentBackgroundTask rcvr;
    
    public BackgroundTaskStepMssg(persistence.PersistentBackgroundTask rcvr){
        this.rcvr = rcvr;
    }
    public void accept(BackgroundTaskMssgsVisitor visitor) throws PersistenceException{
        visitor.handleBackgroundTaskStepMssg(this);
    }
    public void accept(OwnerOrderManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleBackgroundTaskStepMssg(this);
    }
    public void accept(ReOrderManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleBackgroundTaskStepMssg(this);
    }
    public void accept(OrderManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleBackgroundTaskStepMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.stepImplementation();
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized void getResult() throws PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
    }
    
}
