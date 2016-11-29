package persistence;


public interface PersistentChangeArticleNameCommand extends Anything, ArticleWrapperCommand, PersistentCommonDate, AbstractPersistentProxi, ChangeArticleNameCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

