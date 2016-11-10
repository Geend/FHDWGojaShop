package persistence;

import model.*;

public class ProducerFacade{

	static private Long sequencer = new Long(0);

	static protected long getTheNextId(){
		long result = -1;
		synchronized (sequencer) { 
			result = sequencer.longValue() + 1;
			sequencer = new Long(result);
		}
		return result;
	}

	protected long getNextId(){
		return getTheNextId();
	}

	

	public ProducerFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentProducer newProducer(String name,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentProducer)PersistentProxi.createProxi(idCreateIfLessZero, 198);
        long id = ConnectionHandler.getTheConnectionHandler().theProducerFacade.getNextId();
        Producer result = new Producer(name,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProducer)PersistentProxi.createProxi(id, 198);
    }
    
    public PersistentProducer newDelayedProducer(String name) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theProducerFacade.getNextId();
        Producer result = new Producer(name,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProducer)PersistentProxi.createProxi(id, 198);
    }
    
    public Producer getProducer(long ProducerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 198)) return 198;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void nameSet(long ProducerId, String nameVal) throws PersistenceException {
        
    }
    public void ThisSet(long ProducerId, Producer4Public ThisVal) throws PersistenceException {
        
    }

}

