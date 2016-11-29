package persistence;


public interface PersistentDepositCommand extends CustomerAccountCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, DepositCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

