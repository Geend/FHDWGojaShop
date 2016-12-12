package persistence;


public interface PersistentChangeMaxStockCommand extends Anything, ShopCommand, PersistentCommonDate, AbstractPersistentProxi, ChangeMaxStockCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

