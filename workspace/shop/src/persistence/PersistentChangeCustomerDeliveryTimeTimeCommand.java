package persistence;


public interface PersistentChangeCustomerDeliveryTimeTimeCommand extends Anything, ShopCommand, PersistentCommonDate, AbstractPersistentProxi, ChangeCustomerDeliveryTimeTimeCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

