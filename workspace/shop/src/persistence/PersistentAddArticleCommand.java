package persistence;


public interface PersistentAddArticleCommand extends ProductGroupCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, AddArticleCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

