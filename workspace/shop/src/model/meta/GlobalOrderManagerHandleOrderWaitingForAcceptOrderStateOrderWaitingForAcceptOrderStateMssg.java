package model.meta;

import persistence.*;

public class GlobalOrderManagerHandleOrderWaitingForAcceptOrderStateOrderWaitingForAcceptOrderStateMssg implements GlobalOrderManagerDOWNMssgs,GlobalOrderManagerUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentGlobalOrderManager rcvr;
    public final persistence.Order4Public order;
    public final persistence.WaitingForAcceptOrderState4Public waitingForAcceptOrderState;
    
    public GlobalOrderManagerHandleOrderWaitingForAcceptOrderStateOrderWaitingForAcceptOrderStateMssg(persistence.Order4Public order,
                                                                                                      persistence.WaitingForAcceptOrderState4Public waitingForAcceptOrderState,
                                                                                                      persistence.PersistentGlobalOrderManager rcvr){
        this.order = order;
        this.waitingForAcceptOrderState = waitingForAcceptOrderState;
        this.rcvr = rcvr;
    }
    public void accept(GlobalOrderManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleGlobalOrderManagerHandleOrderWaitingForAcceptOrderStateOrderWaitingForAcceptOrderStateMssg(this);
    }
    public void accept(OrderManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleGlobalOrderManagerHandleOrderWaitingForAcceptOrderStateOrderWaitingForAcceptOrderStateMssg(this);
    }
    public void accept(BackgroundTaskMssgsVisitor visitor) throws PersistenceException{
        visitor.handleGlobalOrderManagerHandleOrderWaitingForAcceptOrderStateOrderWaitingForAcceptOrderStateMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.handleOrderWaitingForAcceptOrderStateImplementation(this.order, this.waitingForAcceptOrderState);
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
