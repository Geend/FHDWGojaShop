package persistence;


public interface PersistentOrderCartCommand extends Anything, ShopCommand, PersistentCommonDate, AbstractPersistentProxi, OrderCartCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

