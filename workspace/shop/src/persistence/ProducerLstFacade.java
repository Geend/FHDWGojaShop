package persistence;

import model.*;

public class ProducerLstFacade{

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

	

	public ProducerLstFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentProducerLst newProducerLst(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentProducerLst)PersistentProxi.createProxi(idCreateIfLessZero, 210);
        long id = ConnectionHandler.getTheConnectionHandler().theProducerLstFacade.getNextId();
        ProducerLst result = new ProducerLst(null,id);
        Cache.getTheCache().put(result);
        return (PersistentProducerLst)PersistentProxi.createProxi(id, 210);
    }
    
    public PersistentProducerLst newDelayedProducerLst() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theProducerLstFacade.getNextId();
        ProducerLst result = new ProducerLst(null,id);
        Cache.getTheCache().put(result);
        return (PersistentProducerLst)PersistentProxi.createProxi(id, 210);
    }
    
    public ProducerLst getProducerLst(long ProducerLstId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 210)) return 210;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public long currentProducerAdd(long ProducerLstId, Producer4Public currentProducerVal) throws PersistenceException {
        return 0;
    }
    public void currentProducerRem(long currentProducerId) throws PersistenceException {
        
    }
    public ProducerList currentProducerGet(long ProducerLstId) throws PersistenceException {
        return new ProducerList(); // remote access for initialization only!
    }
    public void ThisSet(long ProducerLstId, ProducerLst4Public ThisVal) throws PersistenceException {
        
    }

}

