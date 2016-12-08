package persistence;


public interface PersistentCreateCustomerDeliveryTimeCommand extends Anything, ShopCommand, PersistentCommonDate, AbstractPersistentProxi, CreateCustomerDeliveryTimeCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

