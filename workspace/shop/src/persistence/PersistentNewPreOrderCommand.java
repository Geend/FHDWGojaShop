package persistence;


public interface PersistentNewPreOrderCommand extends CustomerOrderManagerCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, NewPreOrderCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

