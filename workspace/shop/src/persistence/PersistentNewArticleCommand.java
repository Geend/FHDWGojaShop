package persistence;


public interface PersistentNewArticleCommand extends Anything, ShopCommand, PersistentCommonDate, AbstractPersistentProxi, NewArticleCommand4Public {
    
    public void setCommandResult(ArticleWrapper4Public newValue) throws PersistenceException ;
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

