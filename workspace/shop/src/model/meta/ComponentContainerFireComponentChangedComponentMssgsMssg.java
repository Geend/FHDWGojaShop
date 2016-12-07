package model.meta;

import persistence.*;

public class ComponentContainerFireComponentChangedComponentMssgsMssg implements ComponentContainerDOWNMssgs,ComponentContainerUPMssgs, ComponentDOWNMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.ComponentContainer rcvr;
    public final model.meta.ComponentMssgs evnt;
    
    public ComponentContainerFireComponentChangedComponentMssgsMssg(model.meta.ComponentMssgs evnt,
                                                                    persistence.ComponentContainer rcvr){
        this.evnt = evnt;
        this.rcvr = rcvr;
    }
    public void accept(ComponentContainerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentContainerFireComponentChangedComponentMssgsMssg(this);
    }
    public void accept(ProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentContainerFireComponentChangedComponentMssgsMssg(this);
    }
    public void accept(ComponentContainerImplementationMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentContainerFireComponentChangedComponentMssgsMssg(this);
    }
    public void accept(ComponentManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentContainerFireComponentChangedComponentMssgsMssg(this);
    }
    public void accept(ComponentMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentContainerFireComponentChangedComponentMssgsMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.fireComponentChangedImplementation(this.evnt);
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
