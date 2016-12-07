package persistence;


public interface PersistentReOrderForPreorderCommand extends ReOrderManagerCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, ReOrderForPreorderCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

