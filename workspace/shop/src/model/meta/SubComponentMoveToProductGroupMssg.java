package model.meta;

import persistence.*;

public class SubComponentMoveToProductGroupMssg implements SubComponentDOWNMssgs,SubComponentUPMssgs, ProductGroupDOWNMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.SubComponent rcvr;
    public final persistence.ProductGroup4Public productGroup;
    
    public SubComponentMoveToProductGroupMssg(persistence.ProductGroup4Public productGroup,
                                              persistence.SubComponent rcvr){
        this.productGroup = productGroup;
        this.rcvr = rcvr;
    }
    public void accept(SubComponentMssgsVisitor visitor) throws PersistenceException{
        visitor.handleSubComponentMoveToProductGroupMssg(this);
    }
    public void accept(ArticleMssgsVisitor visitor) throws PersistenceException{
        visitor.handleSubComponentMoveToProductGroupMssg(this);
    }
    public void accept(SubProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleSubComponentMoveToProductGroupMssg(this);
    }
    public void accept(ProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleSubComponentMoveToProductGroupMssg(this);
    }
    public void accept(ComponentMssgsVisitor visitor) throws PersistenceException{
        visitor.handleSubComponentMoveToProductGroupMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.moveToImplementation(this.productGroup);
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
