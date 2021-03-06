package model.meta;

import persistence.*;

public class ShopAcceptOrderCustomerOrderManagerOrderMssg implements ShopDOWNMssgs,ShopUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentShop rcvr;
    public final persistence.CustomerOrderManager4Public manager;
    public final persistence.Order4Public order;
    
    public ShopAcceptOrderCustomerOrderManagerOrderMssg(persistence.CustomerOrderManager4Public manager,
                                                        persistence.Order4Public order,
                                                        persistence.PersistentShop rcvr){
        this.manager = manager;
        this.order = order;
        this.rcvr = rcvr;
    }
    public void accept(ShopMssgsVisitor visitor) throws PersistenceException{
        visitor.handleShopAcceptOrderCustomerOrderManagerOrderMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.acceptOrderImplementation(this.manager, this.order);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized void getResult() throws model.OrderNotAcceptableException, model.NotEnoughMoneyException, PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof model.OrderNotAcceptableException) throw (model.OrderNotAcceptableException) this.excptn;
            if(this.excptn instanceof model.NotEnoughMoneyException) throw (model.NotEnoughMoneyException) this.excptn;
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
    }
    
}
