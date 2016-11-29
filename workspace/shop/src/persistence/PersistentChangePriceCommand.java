package persistence;


public interface PersistentChangePriceCommand extends Anything, ArticleWrapperCommand, PersistentCommonDate, AbstractPersistentProxi, ChangePriceCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

