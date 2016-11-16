package persistence;


public interface PersistentProducer extends Anything, SubjInterface, AbstractPersistentProxi, Producer4Public {
    
    public void setName(String newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentProducer getThis() throws PersistenceException ;
    
    

}

