package model.meta;

import persistence.*;

public class ShopNewProductGroupComponentContainerStringMssg implements ShopDOWNMssgs,ShopUPMssgs{
    
    private java.util.Date exctDte = null;
    private persistence.ProductGroup4Public rslt;
    private Exception excptn;
    public final persistence.PersistentShop rcvr;
    public final persistence.ComponentContainer parent;
    public final String name;
    
    public ShopNewProductGroupComponentContainerStringMssg(persistence.ComponentContainer parent,
                                                           String name,
                                                           persistence.PersistentShop rcvr){
        this.parent = parent;
        this.name = name;
        this.rcvr = rcvr;
    }
    public void accept(ShopMssgsVisitor visitor) throws PersistenceException{
        visitor.handleShopNewProductGroupComponentContainerStringMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                rslt = this.rcvr.newProductGroupImplementation(this.parent, this.name);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized persistence.ProductGroup4Public getResult() throws model.DoubleDefinitionException, model.EmptyDefinitionException, model.CycleException, PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof model.DoubleDefinitionException) throw (model.DoubleDefinitionException) this.excptn;
            if(this.excptn instanceof model.EmptyDefinitionException) throw (model.EmptyDefinitionException) this.excptn;
            if(this.excptn instanceof model.CycleException) throw (model.CycleException) this.excptn;
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
        return this.rslt;
    }
    
}
