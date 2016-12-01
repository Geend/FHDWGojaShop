package persistence;


public interface PersistentAddArticleReturnCommand extends Anything, ReturnManagerCommand, PersistentCommonDate, AbstractPersistentProxi, AddArticleReturnCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

