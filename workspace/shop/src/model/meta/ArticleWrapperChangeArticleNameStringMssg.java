package model.meta;

import persistence.*;

public class ArticleWrapperChangeArticleNameStringMssg implements ArticleWrapperDOWNMssgs,ArticleWrapperUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentArticleWrapper rcvr;
    public final String newName;
    
    public ArticleWrapperChangeArticleNameStringMssg(String newName,
                                                     persistence.PersistentArticleWrapper rcvr){
        this.newName = newName;
        this.rcvr = rcvr;
    }
    public void accept(ArticleWrapperMssgsVisitor visitor) throws PersistenceException{
        visitor.handleArticleWrapperChangeArticleNameStringMssg(this);
    }
    public void accept(ComponentMssgsVisitor visitor) throws PersistenceException{
        visitor.handleArticleWrapperChangeArticleNameStringMssg(this);
    }
    public void accept(SubComponentMssgsVisitor visitor) throws PersistenceException{
        visitor.handleArticleWrapperChangeArticleNameStringMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.changeArticleNameImplementation(this.newName);
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
