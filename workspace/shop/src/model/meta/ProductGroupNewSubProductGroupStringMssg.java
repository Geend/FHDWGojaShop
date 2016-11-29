package model.meta;

import persistence.*;

public class ProductGroupNewSubProductGroupStringMssg implements ProductGroupDOWNMssgs,ProductGroupUPMssgs, SubComponentDOWNMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentProductGroup rcvr;
    public final String name;
    
    public ProductGroupNewSubProductGroupStringMssg(String name,
                                                    persistence.PersistentProductGroup rcvr){
        this.name = name;
        this.rcvr = rcvr;
    }
    public void accept(ProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupNewSubProductGroupStringMssg(this);
    }
    public void accept(ComponentMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupNewSubProductGroupStringMssg(this);
    }
    public void accept(SubProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupNewSubProductGroupStringMssg(this);
    }
    public void accept(RootProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupNewSubProductGroupStringMssg(this);
    }
    public void accept(SubComponentMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupNewSubProductGroupStringMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.newSubProductGroupImplementation(this.name);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized void getResult() throws model.DoubleDefinitionException, model.CycleException, PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof model.DoubleDefinitionException) throw (model.DoubleDefinitionException) this.excptn;
            if(this.excptn instanceof model.CycleException) throw (model.CycleException) this.excptn;
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
    }
    
}
