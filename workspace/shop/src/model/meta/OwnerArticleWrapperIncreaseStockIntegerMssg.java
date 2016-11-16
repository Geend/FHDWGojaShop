package model.meta;

import persistence.*;

public class OwnerArticleWrapperIncreaseStockIntegerMssg implements OwnerArticleWrapperDOWNMssgs,OwnerArticleWrapperUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentOwnerArticleWrapper rcvr;
    public final long quantity;
    
    public OwnerArticleWrapperIncreaseStockIntegerMssg(long quantity,
                                                       persistence.PersistentOwnerArticleWrapper rcvr){
        this.quantity = quantity;
        this.rcvr = rcvr;
    }
    public void accept(OwnerArticleWrapperMssgsVisitor visitor) throws PersistenceException{
        visitor.handleOwnerArticleWrapperIncreaseStockIntegerMssg(this);
    }
    public void accept(ArticleWrapperMssgsVisitor visitor) throws PersistenceException{
        visitor.handleOwnerArticleWrapperIncreaseStockIntegerMssg(this);
    }
    public void accept(ComponentWrapperMssgsVisitor visitor) throws PersistenceException{
        visitor.handleOwnerArticleWrapperIncreaseStockIntegerMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.increaseStockImplementation(this.quantity);
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
