package persistence;


public interface PersistentCreateCustomerDeliveryTimeCommand extends Anything, CustomerDeliveryTimeManagerCommand, PersistentCommonDate, AbstractPersistentProxi, CreateCustomerDeliveryTimeCommand4Public {
    
    public void setCommandResult(CustomerDeliveryTime4Public newValue) throws PersistenceException ;
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

