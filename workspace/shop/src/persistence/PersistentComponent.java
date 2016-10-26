package persistence;


public interface PersistentComponent extends Anything, PartsHIERARCHY, AbstractPersistentProxi, Component4Public {
    
    public abstract PersistentComponent getThis() throws PersistenceException ;
    
    

}

