package persistence;


public interface PersistentReduceStockCommand extends ArticleCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, ReduceStockCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

