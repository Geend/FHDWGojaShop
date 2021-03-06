package model.meta;

import persistence.*;

public class BackgroundTaskManagerStepMssg implements BackgroundTaskManagerDOWNMssgs,BackgroundTaskManagerUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentBackgroundTaskManager rcvr;
    
    public BackgroundTaskManagerStepMssg(persistence.PersistentBackgroundTaskManager rcvr){
        this.rcvr = rcvr;
    }
    public void accept(BackgroundTaskManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleBackgroundTaskManagerStepMssg(this);
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
