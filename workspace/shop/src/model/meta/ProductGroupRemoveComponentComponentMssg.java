package model.meta;

import persistence.*;

public class ProductGroupRemoveComponentComponentMssg implements ProductGroupDOWNMssgs,ProductGroupUPMssgs, SubComponentDOWNMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentProductGroup rcvr;
    public final persistence.Component4Public component;
    
    public ProductGroupRemoveComponentComponentMssg(persistence.Component4Public component,
                                                    persistence.PersistentProductGroup rcvr){
        this.component = component;
        this.rcvr = rcvr;
    }
    public void accept(ProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupRemoveComponentComponentMssg(this);
    }
    public void accept(ComponentMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupRemoveComponentComponentMssg(this);
    }
    public void accept(SubProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupRemoveComponentComponentMssg(this);
    }
    public void accept(RootProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupRemoveComponentComponentMssg(this);
    }
    public void accept(SubComponentMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupRemoveComponentComponentMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.removeComponentImplementation(this.component);
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
