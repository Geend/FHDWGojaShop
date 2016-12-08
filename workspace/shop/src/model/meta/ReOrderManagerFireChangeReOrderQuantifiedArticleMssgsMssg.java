package model.meta;

import persistence.*;

public class ReOrderManagerFireChangeReOrderQuantifiedArticleMssgsMssg implements ReOrderManagerDOWNMssgs,ReOrderManagerUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentReOrderManager rcvr;
    public final model.meta.ReOrderQuantifiedArticleMssgs evnt;
    
    public ReOrderManagerFireChangeReOrderQuantifiedArticleMssgsMssg(model.meta.ReOrderQuantifiedArticleMssgs evnt,
                                                                     persistence.PersistentReOrderManager rcvr){
        this.evnt = evnt;
        this.rcvr = rcvr;
    }
    public void accept(ReOrderManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleReOrderManagerFireChangeReOrderQuantifiedArticleMssgsMssg(this);
    }
    public void accept(BackgroundTaskMssgsVisitor visitor) throws PersistenceException{
        visitor.handleReOrderManagerFireChangeReOrderQuantifiedArticleMssgsMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.fireChangeImplementation(this.evnt);
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
