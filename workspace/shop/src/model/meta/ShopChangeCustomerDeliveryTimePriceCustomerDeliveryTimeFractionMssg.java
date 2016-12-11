package model.meta;

import persistence.*;

public class ShopChangeCustomerDeliveryTimePriceCustomerDeliveryTimeFractionMssg implements ShopDOWNMssgs,ShopUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentShop rcvr;
    public final persistence.CustomerDeliveryTime4Public customerDeliveryTime;
    public final common.Fraction newValue;
    
    public ShopChangeCustomerDeliveryTimePriceCustomerDeliveryTimeFractionMssg(persistence.CustomerDeliveryTime4Public customerDeliveryTime,
                                                                               common.Fraction newValue,
                                                                               persistence.PersistentShop rcvr){
        this.customerDeliveryTime = customerDeliveryTime;
        this.newValue = newValue;
        this.rcvr = rcvr;
    }
    public void accept(ShopMssgsVisitor visitor) throws PersistenceException{
        visitor.handleShopChangeCustomerDeliveryTimePriceCustomerDeliveryTimeFractionMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.changeCustomerDeliveryTimePriceImplementation(this.customerDeliveryTime, this.newValue);
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
