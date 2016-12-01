package persistence;


public interface PersistentStartOrderingCommand extends ReOrderManagerCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, StartOrderingCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

