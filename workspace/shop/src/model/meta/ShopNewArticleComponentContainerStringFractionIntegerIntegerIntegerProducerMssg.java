package model.meta;

import persistence.*;

public class ShopNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssg implements ShopDOWNMssgs,ShopUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentShop rcvr;
    public final persistence.ComponentContainer parent;
    public final String name;
    public final common.Fraction price;
    public final long minStock;
    public final long maxStock;
    public final long producerDeliveryTime;
    public final persistence.Producer4Public producer;
    
    public ShopNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssg(persistence.ComponentContainer parent,
                                                                                           String name,
                                                                                           common.Fraction price,
                                                                                           long minStock,
                                                                                           long maxStock,
                                                                                           long producerDeliveryTime,
                                                                                           persistence.Producer4Public producer,
                                                                                           persistence.PersistentShop rcvr){
        this.parent = parent;
        this.name = name;
        this.price = price;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.producerDeliveryTime = producerDeliveryTime;
        this.producer = producer;
        this.rcvr = rcvr;
    }
    public void accept(ShopMssgsVisitor visitor) throws PersistenceException{
        visitor.handleShopNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.newArticleImplementation(this.parent, this.name, this.price, this.minStock, this.maxStock, this.producerDeliveryTime, this.producer);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized void getResult() throws model.DoubleDefinitionException, model.CycleException, PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof model.DoubleDefinitionException) throw (model.DoubleDefinitionException) this.excptn;
            if(this.excptn instanceof model.CycleException) throw (model.CycleException) this.excptn;
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
    }
    
}
