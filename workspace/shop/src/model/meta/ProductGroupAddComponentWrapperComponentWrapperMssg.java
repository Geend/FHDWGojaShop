package model.meta;

import persistence.*;

public class ProductGroupAddComponentWrapperComponentWrapperMssg implements ProductGroupDOWNMssgs,ProductGroupUPMssgs, SubComponentDOWNMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentProductGroup rcvr;
    public final persistence.ComponentWrapper4Public componentWrapper;
    
    public ProductGroupAddComponentWrapperComponentWrapperMssg(persistence.ComponentWrapper4Public componentWrapper,
                                                               persistence.PersistentProductGroup rcvr){
        this.componentWrapper = componentWrapper;
        this.rcvr = rcvr;
    }
    public void accept(ProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupAddComponentWrapperComponentWrapperMssg(this);
    }
    public void accept(ComponentMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupAddComponentWrapperComponentWrapperMssg(this);
    }
    public void accept(SubProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupAddComponentWrapperComponentWrapperMssg(this);
    }
    public void accept(RootProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupAddComponentWrapperComponentWrapperMssg(this);
    }
    public void accept(SubComponentMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupAddComponentWrapperComponentWrapperMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.addComponentWrapperImplementation(this.componentWrapper);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized void getResult() throws model.CycleException, PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof model.CycleException) throw (model.CycleException) this.excptn;
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
    }
    
}
