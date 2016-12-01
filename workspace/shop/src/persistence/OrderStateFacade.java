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
        if(Cache.getTheCache().contains(objectId, 337)) return 337;
        if(Cache.getTheCache().contains(objectId, 335)) return 335;
        if(Cache.getTheCache().contains(objectId, 338)) return 338;
        if(Cache.getTheCache().contains(objectId, 332)) return 332;
        if(Cache.getTheCache().contains(objectId, 336)) return 336;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void subServiceSet(long OrderStateId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long OrderStateId, OrderState4Public ThisVal) throws PersistenceException {
        
    }

}

