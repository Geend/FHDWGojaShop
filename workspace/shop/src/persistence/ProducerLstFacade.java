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

    public PersistentProducerLst getTheProducerLst() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theProducerLstFacade.getNextId();
        ProducerLst result = new ProducerLst(null, null, id);
        PersistentInCacheProxi cached = Cache.getTheCache().putSingleton(result);
        return (PersistentProducerLst)PersistentProxi.createProxi(cached.getId()  * (cached.getTheObject().isTheSameAs(result) ? -1 : 1), 210);
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
    public void subServiceSet(long ProducerLstId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ProducerLstId, ProducerLst4Public ThisVal) throws PersistenceException {
        
    }

}

