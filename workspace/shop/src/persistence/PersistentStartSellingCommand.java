package persistence;


public interface PersistentStartSellingCommand extends Anything, ShopCommand, PersistentCommonDate, AbstractPersistentProxi, StartSellingCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

