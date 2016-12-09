package model.meta;

import persistence.*;

public class GlobalOrderManagerHandleOrderInTransitOrderStateOrderInTransitOrderStateMssg implements GlobalOrderManagerDOWNMssgs,GlobalOrderManagerUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentGlobalOrderManager rcvr;
    public final persistence.Order4Public order;
    public final persistence.InTransitOrderState4Public inTransitOrderState;
    
    public GlobalOrderManagerHandleOrderInTransitOrderStateOrderInTransitOrderStateMssg(persistence.Order4Public order,
                                                                                        persistence.InTransitOrderState4Public inTransitOrderState,
                                                                                        persistence.PersistentGlobalOrderManager rcvr){
        this.order = order;
        this.inTransitOrderState = inTransitOrderState;
        this.rcvr = rcvr;
    }
    public void accept(GlobalOrderManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleGlobalOrderManagerHandleOrderInTransitOrderStateOrderInTransitOrderStateMssg(this);
    }
    public void accept(OrderManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleGlobalOrderManagerHandleOrderInTransitOrderStateOrderInTransitOrderStateMssg(this);
    }
    public void accept(BackgroundTaskMssgsVisitor visitor) throws PersistenceException{
        visitor.handleGlobalOrderManagerHandleOrderInTransitOrderStateOrderInTransitOrderStateMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.handleOrderInTransitOrderStateImplementation(this.order, this.inTransitOrderState);
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
