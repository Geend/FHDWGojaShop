package model.meta;

import persistence.*;

public class GlobalOrderManagerHandleOrderPreOrderStateOrderPreOrderStateMssg implements GlobalOrderManagerDOWNMssgs,GlobalOrderManagerUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentGlobalOrderManager rcvr;
    public final persistence.Order4Public order;
    public final persistence.PreOrderState4Public preOrderState;
    
    public GlobalOrderManagerHandleOrderPreOrderStateOrderPreOrderStateMssg(persistence.Order4Public order,
                                                                            persistence.PreOrderState4Public preOrderState,
                                                                            persistence.PersistentGlobalOrderManager rcvr){
        this.order = order;
        this.preOrderState = preOrderState;
        this.rcvr = rcvr;
    }
    public void accept(GlobalOrderManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleGlobalOrderManagerHandleOrderPreOrderStateOrderPreOrderStateMssg(this);
    }
    public void accept(OrderManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleGlobalOrderManagerHandleOrderPreOrderStateOrderPreOrderStateMssg(this);
    }
    public void accept(BackgroundTaskMssgsVisitor visitor) throws PersistenceException{
        visitor.handleGlobalOrderManagerHandleOrderPreOrderStateOrderPreOrderStateMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.handleOrderPreOrderStateImplementation(this.order, this.preOrderState);
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
