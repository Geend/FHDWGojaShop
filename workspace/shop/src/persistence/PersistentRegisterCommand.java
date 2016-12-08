package persistence;


public interface PersistentRegisterCommand extends CustomerRegisterServiceCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, RegisterCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

