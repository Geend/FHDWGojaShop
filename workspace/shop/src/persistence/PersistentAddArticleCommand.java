package persistence;


public interface PersistentAddArticleCommand extends Anything, ShoppingCartCommand, PersistentCommonDate, AbstractPersistentProxi, AddArticleCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

