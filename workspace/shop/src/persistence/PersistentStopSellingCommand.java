package persistence;


public interface PersistentStopSellingCommand extends Anything, ShopCommand, PersistentCommonDate, AbstractPersistentProxi, StopSellingCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

