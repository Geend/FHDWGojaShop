package persistence;


public interface PersistentChangeMinStockCommand extends Anything, ShopCommand, PersistentCommonDate, AbstractPersistentProxi, ChangeMinStockCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

