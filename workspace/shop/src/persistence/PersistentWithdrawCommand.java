package persistence;


public interface PersistentWithdrawCommand extends CustomerAccountCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, WithdrawCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

