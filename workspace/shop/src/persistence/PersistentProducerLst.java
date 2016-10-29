package persistence;


public interface PersistentProducerLst extends Anything, AbstractPersistentProxi, ProducerLst4Public {
    
    public ProducerLst_CurrentProducerProxi getCurrentProducer() throws PersistenceException ;
    public PersistentProducerLst getThis() throws PersistenceException ;
    
    

}

