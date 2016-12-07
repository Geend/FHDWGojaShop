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
        Producer result = new Producer(name,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProducer)PersistentProxi.createProxi(id, 198);
    }
    
    public PersistentProducer newDelayedProducer(String name) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theProducerFacade.getNextId();
        Producer result = new Producer(name,null,null,id);
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
    public ProducerSearchList getProducerByName(String name) throws PersistenceException {
        name = name.replaceAll("%", ".*");
        name = name.replaceAll("_", ".");
        ProducerSearchList result = new ProducerSearchList();
        java.util.Iterator<?> candidates;
        candidates = Cache.getTheCache().iterator(198);
        while (candidates.hasNext()){
            PersistentProducer current = (PersistentProducer)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getName().matches(name))
                result.add((PersistentProducer)PersistentProxi.createProxi(current.getId(), current.getClassId()));
        }
        return result;
    }
    public void nameSet(long ProducerId, String nameVal) throws PersistenceException {
        
    }
    public void subServiceSet(long ProducerId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ProducerId, Producer4Public ThisVal) throws PersistenceException {
        
    }

}

