package persistence;


public interface PersistentNewOrderCommand extends CustomerOrderManagerCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, NewOrderCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

