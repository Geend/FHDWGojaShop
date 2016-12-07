package model.meta;

import persistence.*;

public class ComponentContainerNewArticleStringFractionIntegerIntegerIntegerProducerMssg implements ComponentContainerDOWNMssgs,ComponentContainerUPMssgs, ComponentDOWNMssgs{
    
    private java.util.Date exctDte = null;
    private persistence.ArticleWrapper4Public rslt;
    private Exception excptn;
    public final persistence.ComponentContainer rcvr;
    public final String name;
    public final common.Fraction price;
    public final long minStock;
    public final long maxStock;
    public final long producerDeliveryTime;
    public final persistence.Producer4Public producer;
    
    public ComponentContainerNewArticleStringFractionIntegerIntegerIntegerProducerMssg(String name,
                                                                                       common.Fraction price,
                                                                                       long minStock,
                                                                                       long maxStock,
                                                                                       long producerDeliveryTime,
                                                                                       persistence.Producer4Public producer,
                                                                                       persistence.ComponentContainer rcvr){
        this.name = name;
        this.price = price;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.producerDeliveryTime = producerDeliveryTime;
        this.producer = producer;
        this.rcvr = rcvr;
    }
    public void accept(ComponentContainerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentContainerNewArticleStringFractionIntegerIntegerIntegerProducerMssg(this);
    }
    public void accept(ProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentContainerNewArticleStringFractionIntegerIntegerIntegerProducerMssg(this);
    }
    public void accept(ComponentManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentContainerNewArticleStringFractionIntegerIntegerIntegerProducerMssg(this);
    }
    public void accept(ComponentMssgsVisitor visitor) throws PersistenceException{
        visitor.handleComponentContainerNewArticleStringFractionIntegerIntegerIntegerProducerMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                rslt = this.rcvr.newArticleImplementation(this.name, this.price, this.minStock, this.maxStock, this.producerDeliveryTime, this.producer);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized persistence.ArticleWrapper4Public getResult() throws model.CycleException, PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof model.CycleException) throw (model.CycleException) this.excptn;
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
        return this.rslt;
    }
    
}
