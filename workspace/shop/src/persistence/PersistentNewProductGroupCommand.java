package persistence;


public interface PersistentNewProductGroupCommand extends Anything, ShopCommand, PersistentCommonDate, AbstractPersistentProxi, NewProductGroupCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

