package model.meta;

import persistence.*;

public class OwnerArticleWrapperReduceStockIntegerMssg implements OwnerArticleWrapperDOWNMssgs,OwnerArticleWrapperUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentOwnerArticleWrapper rcvr;
    public final long quantity;
    
    public OwnerArticleWrapperReduceStockIntegerMssg(long quantity,
                                                     persistence.PersistentOwnerArticleWrapper rcvr){
        this.quantity = quantity;
        this.rcvr = rcvr;
    }
    public void accept(OwnerArticleWrapperMssgsVisitor visitor) throws PersistenceException{
        visitor.handleOwnerArticleWrapperReduceStockIntegerMssg(this);
    }
    public void accept(ArticleWrapperMssgsVisitor visitor) throws PersistenceException{
        visitor.handleOwnerArticleWrapperReduceStockIntegerMssg(this);
    }
    public void accept(ComponentWrapperMssgsVisitor visitor) throws PersistenceException{
        visitor.handleOwnerArticleWrapperReduceStockIntegerMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.reduceStockImplementation(this.quantity);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized void getResult() throws model.NotEnoughStockException, PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof model.NotEnoughStockException) throw (model.NotEnoughStockException) this.excptn;
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
    }
    
}
