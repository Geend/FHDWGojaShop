package persistence;


public interface PersistentChangeCustomerDeliveryTimePriceCommand extends Anything, ShopCommand, PersistentCommonDate, AbstractPersistentProxi, ChangeCustomerDeliveryTimePriceCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

