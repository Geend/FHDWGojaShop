package model.meta;

import persistence.*;

public class ArticleReduceStockIntegerMssg implements ArticleDOWNMssgs,ArticleUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentArticle rcvr;
    public final long quantity;
    
    public ArticleReduceStockIntegerMssg(long quantity,
                                         persistence.PersistentArticle rcvr){
        this.quantity = quantity;
        this.rcvr = rcvr;
    }
    public void accept(ArticleMssgsVisitor visitor) throws PersistenceException{
        visitor.handleArticleReduceStockIntegerMssg(this);
    }
    public void accept(ComponentMssgsVisitor visitor) throws PersistenceException{
        visitor.handleArticleReduceStockIntegerMssg(this);
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
