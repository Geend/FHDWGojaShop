package persistence;


public interface PersistentProducerLst extends Anything, SubjInterface, AbstractPersistentProxi, ProducerLst4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentProducerLst getThis() throws PersistenceException ;
    
    

}

