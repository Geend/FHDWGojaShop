package model.meta;

import persistence.*;

public class ComponentMoveToComponentContainerMssg implements ComponentDOWNMssgs,ComponentUPMssgs, ComponentContainerDOWNMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentComponent rcvr;
    public final persistence.ComponentContainer container;
    
    public ComponentMoveToComponentContainerMssg(persistence.ComponentContainer container,
                                                 persistence.PersistentComponent rcvr){
        this.container = container;
        this.rcvr = rcvr;
    }
    public void accept(ComponentMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentMoveToComponentContainerMssg(this);
    }
    public void accept(ProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentMoveToComponentContainerMssg(this);
    }
    public void accept(ArticleWrapperMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentMoveToComponentContainerMssg(this);
    }
    public void accept(ComponentContainerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentMoveToComponentContainerMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.moveToImplementation(this.container);
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
