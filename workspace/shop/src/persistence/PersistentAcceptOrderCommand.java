package persistence;


public interface PersistentAcceptOrderCommand extends Anything, ShopCommand, PersistentCommonDate, AbstractPersistentProxi, AcceptOrderCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

