package model.meta;

import persistence.*;

public class ShopPreOrderCartCustomerOrderManagerShoppingCartCustomerDeliveryTimeMssg implements ShopDOWNMssgs,ShopUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentShop rcvr;
    public final persistence.CustomerOrderManager4Public manager;
    public final persistence.ShoppingCart4Public cart;
    public final persistence.CustomerDeliveryTime4Public customerDeliveryTime;
    
    public ShopPreOrderCartCustomerOrderManagerShoppingCartCustomerDeliveryTimeMssg(persistence.CustomerOrderManager4Public manager,
                                                                                    persistence.ShoppingCart4Public cart,
                                                                                    persistence.CustomerDeliveryTime4Public customerDeliveryTime,
                                                                                    persistence.PersistentShop rcvr){
        this.manager = manager;
        this.cart = cart;
        this.customerDeliveryTime = customerDeliveryTime;
        this.rcvr = rcvr;
    }
    public void accept(ShopMssgsVisitor visitor) throws PersistenceException{
        visitor.handleShopPreOrderCartCustomerOrderManagerShoppingCartCustomerDeliveryTimeMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.preOrderCartImplementation(this.manager, this.cart, this.customerDeliveryTime);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized void getResult() throws model.EmptyCartException, model.NotEnoughMoneyException, model.ArticleNotInSaleException, PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof model.EmptyCartException) throw (model.EmptyCartException) this.excptn;
            if(this.excptn instanceof model.NotEnoughMoneyException) throw (model.NotEnoughMoneyException) this.excptn;
            if(this.excptn instanceof model.ArticleNotInSaleException) throw (model.ArticleNotInSaleException) this.excptn;
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
    }
    
}
