package persistence;


public interface PersistentAddSubProductGroupCommand extends ProductGroupCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, AddSubProductGroupCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

