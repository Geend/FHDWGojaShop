package persistence;


public interface PersistentCancelPreOrderCommand extends Anything, ShopCommand, PersistentCommonDate, AbstractPersistentProxi, CancelPreOrderCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

