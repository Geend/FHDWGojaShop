package persistence;



public class ComponentWrapperFacade{

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

	

	public ComponentWrapperFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 290)) return 290;
        if(Cache.getTheCache().contains(objectId, 280)) return 280;
        if(Cache.getTheCache().contains(objectId, 298)) return 298;
        if(Cache.getTheCache().contains(objectId, 237)) return 237;
        if(Cache.getTheCache().contains(objectId, 294)) return 294;
        if(Cache.getTheCache().contains(objectId, 295)) return 295;
        if(Cache.getTheCache().contains(objectId, 243)) return 243;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void componentSet(long ComponentWrapperId, Component4Public componentVal) throws PersistenceException {
        
    }
    public void subServiceSet(long ComponentWrapperId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ComponentWrapperId, ComponentWrapper4Public ThisVal) throws PersistenceException {
        
    }

}

