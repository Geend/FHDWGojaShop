package persistence;

import model.*;

public class ComponentContainerImplementationComponentsFacade{

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

	

	public ComponentContainerImplementationComponentsFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentComponentContainerImplementationComponents newComponentContainerImplementationComponents(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentComponentContainerImplementationComponents)PersistentProxi.createProxi(idCreateIfLessZero, 396);
        long id = ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationComponentsFacade.getNextId();
        ComponentContainerImplementationComponents result = new ComponentContainerImplementationComponents(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentComponentContainerImplementationComponents)PersistentProxi.createProxi(id, 396);
    }
    
    public PersistentComponentContainerImplementationComponents newDelayedComponentContainerImplementationComponents() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationComponentsFacade.getNextId();
        ComponentContainerImplementationComponents result = new ComponentContainerImplementationComponents(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentComponentContainerImplementationComponents)PersistentProxi.createProxi(id, 396);
    }
    
    public ComponentContainerImplementationComponents getComponentContainerImplementationComponents(long ComponentContainerImplementationComponentsId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 396)) return 396;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long ComponentContainerImplementationComponentsId, ComponentContainerImplementation4Public observerVal) throws PersistenceException {
        
    }
    public long observeeAdd(long ComponentContainerImplementationComponentsId, Component4Public observeeVal) throws PersistenceException {
        return 0;
    }
    public void observeeRem(long observeeId) throws PersistenceException {
        
    }
    public ComponentList observeeGet(long ComponentContainerImplementationComponentsId) throws PersistenceException {
        return new ComponentList(); // remote access for initialization only!
    }
    public void ThisSet(long ComponentContainerImplementationComponentsId, ComponentContainerImplementationComponents4Public ThisVal) throws PersistenceException {
        
    }

}

