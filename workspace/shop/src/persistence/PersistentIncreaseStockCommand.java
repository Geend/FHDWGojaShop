package persistence;


public interface PersistentIncreaseStockCommand extends Anything, OwnerArticleWrapperCommand, PersistentCommonDate, AbstractPersistentProxi, IncreaseStockCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

