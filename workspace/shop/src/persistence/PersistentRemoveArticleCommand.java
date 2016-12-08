package persistence;


public interface PersistentRemoveArticleCommand extends Anything, ShoppingCartCommand, PersistentCommonDate, AbstractPersistentProxi, RemoveArticleCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

