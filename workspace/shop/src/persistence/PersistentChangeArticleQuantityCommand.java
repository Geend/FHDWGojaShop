package persistence;


public interface PersistentChangeArticleQuantityCommand extends Anything, ShoppingCartQuantifiedArticleCommand, PersistentCommonDate, AbstractPersistentProxi, ChangeArticleQuantityCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

