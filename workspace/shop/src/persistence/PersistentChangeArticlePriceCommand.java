package persistence;


public interface PersistentChangeArticlePriceCommand extends Anything, ShopCommand, PersistentCommonDate, AbstractPersistentProxi, ChangeArticlePriceCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

