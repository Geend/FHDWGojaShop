package persistence;

import model.*;

public class ComponentManagerFacade{

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

	

	public ComponentManagerFacade() {
	}

    public PersistentComponentManager getTheComponentManager() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theComponentManagerFacade.getNextId();
        ComponentManager result = new ComponentManager(null, null, null, id);
        PersistentInCacheProxi cached = Cache.getTheCache().putSingleton(result);
        return (PersistentComponentManager)PersistentProxi.createProxi(cached.getId()  * (cached.getTheObject().isTheSameAs(result) ? -1 : 1), 379);
    }
    
    public ComponentManager getComponentManager(long ComponentManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 379)) return 379;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void containerSet(long ComponentManagerId, ComponentContainerImplementation4Public containerVal) throws PersistenceException {
        
    }
    public void subServiceSet(long ComponentManagerId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ComponentManagerId, ComponentManager4Public ThisVal) throws PersistenceException {
        
    }

}

