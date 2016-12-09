package model.meta;

import persistence.*;

public class ReOrderManagerDoReorderStepMssg implements ReOrderManagerDOWNMssgs,ReOrderManagerUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentReOrderManager rcvr;
    
    public ReOrderManagerDoReorderStepMssg(persistence.PersistentReOrderManager rcvr){
        this.rcvr = rcvr;
    }
    public void accept(ReOrderManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleReOrderManagerDoReorderStepMssg(this);
    }
    public void accept(BackgroundTaskMssgsVisitor visitor) throws PersistenceException{
        visitor.handleReOrderManagerDoReorderStepMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.doReorderStepImplementation();
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
