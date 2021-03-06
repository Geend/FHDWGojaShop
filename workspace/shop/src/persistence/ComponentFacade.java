package persistence;



public class ComponentFacade{

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

	

	public ComponentFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 121)) return 121;
        if(Cache.getTheCache().contains(objectId, 242)) return 242;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void parentSet(long ComponentId, ComponentContainer parentVal) throws PersistenceException {
        
    }
    public void subServiceSet(long ComponentId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ComponentId, Component4Public ThisVal) throws PersistenceException {
        
    }

}

