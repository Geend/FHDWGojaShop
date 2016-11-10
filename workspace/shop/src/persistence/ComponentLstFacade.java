package persistence;

import model.*;

public class ComponentLstFacade{

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

	

	public ComponentLstFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentComponentLst newComponentLst(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentComponentLst)PersistentProxi.createProxi(idCreateIfLessZero, 177);
        long id = ConnectionHandler.getTheConnectionHandler().theComponentLstFacade.getNextId();
        ComponentLst result = new ComponentLst(null,id);
        Cache.getTheCache().put(result);
        return (PersistentComponentLst)PersistentProxi.createProxi(id, 177);
    }
    
    public PersistentComponentLst newDelayedComponentLst() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theComponentLstFacade.getNextId();
        ComponentLst result = new ComponentLst(null,id);
        Cache.getTheCache().put(result);
        return (PersistentComponentLst)PersistentProxi.createProxi(id, 177);
    }
    
    public ComponentLst getComponentLst(long ComponentLstId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 177)) return 177;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public long currentComponentsAdd(long ComponentLstId, Component4Public currentComponentsVal) throws PersistenceException {
        return 0;
    }
    public void currentComponentsRem(long currentComponentsId) throws PersistenceException {
        
    }
    public ComponentList currentComponentsGet(long ComponentLstId) throws PersistenceException {
        return new ComponentList(); // remote access for initialization only!
    }
    public void ThisSet(long ComponentLstId, ComponentLst4Public ThisVal) throws PersistenceException {
        
    }

}

