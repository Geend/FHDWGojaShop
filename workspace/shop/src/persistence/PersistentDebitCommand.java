package persistence;


public interface PersistentDebitCommand extends CustomerAccountCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, DebitCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

