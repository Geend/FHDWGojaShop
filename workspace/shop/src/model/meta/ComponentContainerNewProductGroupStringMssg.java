package model.meta;

import persistence.*;

public class ComponentContainerNewProductGroupStringMssg implements ComponentContainerDOWNMssgs,ComponentContainerUPMssgs, ComponentDOWNMssgs{
    
    private java.util.Date exctDte = null;
    private persistence.ProductGroup4Public rslt;
    private Exception excptn;
    public final persistence.ComponentContainer rcvr;
    public final String name;
    
    public ComponentContainerNewProductGroupStringMssg(String name,
                                                       persistence.ComponentContainer rcvr){
        this.name = name;
        this.rcvr = rcvr;
    }
    public void accept(ComponentContainerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentContainerNewProductGroupStringMssg(this);
    }
    public void accept(ProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentContainerNewProductGroupStringMssg(this);
    }
    public void accept(ComponentManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentContainerNewProductGroupStringMssg(this);
    }
    public void accept(ComponentMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentContainerNewProductGroupStringMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                rslt = this.rcvr.newProductGroupImplementation(this.name);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized persistence.ProductGroup4Public getResult() throws model.DoubleDefinitionException, model.CycleException, PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof model.DoubleDefinitionException) throw (model.DoubleDefinitionException) this.excptn;
            if(this.excptn instanceof model.CycleException) throw (model.CycleException) this.excptn;
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
        return this.rslt;
    }
    
}
