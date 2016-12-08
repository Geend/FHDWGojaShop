package persistence;


public interface PersistentPreOrderCartCommand extends Anything, ShopCommand, PersistentCommonDate, AbstractPersistentProxi, PreOrderCartCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

