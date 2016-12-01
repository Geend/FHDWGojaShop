package persistence;


public interface PersistentReOrderCommand extends ReOrderManagerCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, ReOrderCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

