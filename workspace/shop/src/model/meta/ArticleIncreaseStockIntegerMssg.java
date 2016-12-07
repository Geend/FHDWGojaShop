package model.meta;

import persistence.*;

public class ArticleIncreaseStockIntegerMssg implements ArticleDOWNMssgs,ArticleUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentArticle rcvr;
    public final long quantity;
    
    public ArticleIncreaseStockIntegerMssg(long quantity,
                                           persistence.PersistentArticle rcvr){
        this.quantity = quantity;
        this.rcvr = rcvr;
    }
    public void accept(ArticleMssgsVisitor visitor) throws PersistenceException{
        visitor.handleArticleIncreaseStockIntegerMssg(this);
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
