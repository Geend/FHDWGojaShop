package persistence;


public interface PersistentNewProductGroupCommand extends Anything, ComponentContainerCommand, PersistentCommonDate, AbstractPersistentProxi, NewProductGroupCommand4Public {
    
    public void setCommandResult(ProductGroup4Public newValue) throws PersistenceException ;
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

