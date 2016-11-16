package persistence;


public interface PersistentNewSubProductGroupCommand extends ProductGroupCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, NewSubProductGroupCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

