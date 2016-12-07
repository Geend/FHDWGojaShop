package persistence;


public interface PersistentMoveToCommand extends Anything, ComponentCommand, PersistentCommonDate, AbstractPersistentProxi, MoveToCommand4Public {
    
    public CommonDate4Public getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException ;
    
    

}

