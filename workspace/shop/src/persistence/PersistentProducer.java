package persistence;


public interface PersistentProducer extends Anything, AbstractPersistentProxi, Producer4Public {
    
    public void setName(String newValue) throws PersistenceException ;
    public PersistentProducer getThis() throws PersistenceException ;
    
    

}

