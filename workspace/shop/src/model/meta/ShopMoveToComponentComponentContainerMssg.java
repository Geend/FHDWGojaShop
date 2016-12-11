package model.meta;

import persistence.*;

public class ShopMoveToComponentComponentContainerMssg implements ShopDOWNMssgs,ShopUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentShop rcvr;
    public final persistence.Component4Public component;
    public final persistence.ComponentContainer newParentGroup;
    
    public ShopMoveToComponentComponentContainerMssg(persistence.Component4Public component,
                                                     persistence.ComponentContainer newParentGroup,
                                                     persistence.PersistentShop rcvr){
        this.component = component;
        this.newParentGroup = newParentGroup;
        this.rcvr = rcvr;
    }
    public void accept(ShopMssgsVisitor visitor) throws PersistenceException{
        visitor.handleShopMoveToComponentComponentContainerMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.moveToImplementation(this.component, this.newParentGroup);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized void getResult() throws model.InvalidMoveException, model.CycleException, PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof model.InvalidMoveException) throw (model.InvalidMoveException) this.excptn;
            if(this.excptn instanceof model.CycleException) throw (model.CycleException) this.excptn;
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
    }
    
}
