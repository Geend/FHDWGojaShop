package model.meta;

import persistence.*;

public class ShopChangeMaxStockArticleWrapperIntegerMssg implements ShopDOWNMssgs,ShopUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentShop rcvr;
    public final persistence.ArticleWrapper4Public article;
    public final long newValue;
    
    public ShopChangeMaxStockArticleWrapperIntegerMssg(persistence.ArticleWrapper4Public article,
                                                       long newValue,
                                                       persistence.PersistentShop rcvr){
        this.article = article;
        this.newValue = newValue;
        this.rcvr = rcvr;
    }
    public void accept(ShopMssgsVisitor visitor) throws PersistenceException{
        visitor.handleShopChangeMaxStockArticleWrapperIntegerMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.changeMaxStockImplementation(this.article, this.newValue);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized void getResult() throws model.InvalidInputException, PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof model.InvalidInputException) throw (model.InvalidInputException) this.excptn;
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
    }
    
}
