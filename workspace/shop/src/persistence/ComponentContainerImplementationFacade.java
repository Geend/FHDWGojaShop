package persistence;

import model.*;

public class ComponentContainerImplementationFacade{

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

	

	public ComponentContainerImplementationFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentComponentContainerImplementation newComponentContainerImplementation(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentComponentContainerImplementation)PersistentProxi.createProxi(idCreateIfLessZero, 395);
        long id = ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade.getNextId();
        ComponentContainerImplementation result = new ComponentContainerImplementation(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentComponentContainerImplementation)PersistentProxi.createProxi(id, 395);
    }
    
    public PersistentComponentContainerImplementation newDelayedComponentContainerImplementation() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade.getNextId();
        ComponentContainerImplementation result = new ComponentContainerImplementation(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentComponentContainerImplementation)PersistentProxi.createProxi(id, 395);
    }
    
    public ComponentContainerImplementation getComponentContainerImplementation(long ComponentContainerImplementationId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 395)) return 395;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public long componentsAdd(long ComponentContainerImplementationId, Component4Public componentsVal) throws PersistenceException {
        return 0;
    }
    public void componentsRem(long componentsId) throws PersistenceException {
        
    }
    public ComponentList componentsGet(long ComponentContainerImplementationId) throws PersistenceException {
        return new ComponentList(); // remote access for initialization only!
    }
    public void subServiceSet(long ComponentContainerImplementationId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ComponentContainerImplementationId, ComponentContainerImplementation4Public ThisVal) throws PersistenceException {
        
    }

}

