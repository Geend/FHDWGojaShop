package persistence;


public interface PersistentStartSellingCommand extends ArticleCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, StartSellingCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

