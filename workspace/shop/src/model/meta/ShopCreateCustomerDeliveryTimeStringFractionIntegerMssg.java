package model.meta;

import persistence.*;

public class ShopCreateCustomerDeliveryTimeStringFractionIntegerMssg implements ShopDOWNMssgs,ShopUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentShop rcvr;
    public final String name;
    public final common.Fraction price;
    public final long time;
    
    public ShopCreateCustomerDeliveryTimeStringFractionIntegerMssg(String name,
                                                                   common.Fraction price,
                                                                   long time,
                                                                   persistence.PersistentShop rcvr){
        this.name = name;
        this.price = price;
        this.time = time;
        this.rcvr = rcvr;
    }
    public void accept(ShopMssgsVisitor visitor) throws PersistenceException{
        visitor.handleShopCreateCustomerDeliveryTimeStringFractionIntegerMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.createCustomerDeliveryTimeImplementation(this.name, this.price, this.time);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized void getResult() throws model.DoubleDefinitionException, model.EmptyDefinitionException, PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof model.DoubleDefinitionException) throw (model.DoubleDefinitionException) this.excptn;
            if(this.excptn instanceof model.EmptyDefinitionException) throw (model.EmptyDefinitionException) this.excptn;
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
    }
    
}
