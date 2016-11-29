package persistence;



public class OrderStateFacade{

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

	

	public OrderStateFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 233)) return 233;
        if(Cache.getTheCache().contains(objectId, 310)) return 310;
        if(Cache.getTheCache().contains(objectId, 311)) return 311;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void subServiceSet(long OrderStateId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long OrderStateId, OrderState4Public ThisVal) throws PersistenceException {
        
    }

}

