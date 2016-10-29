package persistence;


public interface PersistentCreateProductGroupCommand extends Anything, ComponentLstCommand, PersistentCommonDate, AbstractPersistentProxi, CreateProductGroupCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

