package persistence;



public class OrderStatusFacade{

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

	

	public OrderStatusFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 335)) return 335;
        if(Cache.getTheCache().contains(objectId, 336)) return 336;
        if(Cache.getTheCache().contains(objectId, 337)) return 337;
        if(Cache.getTheCache().contains(objectId, 338)) return 338;
        if(Cache.getTheCache().contains(objectId, 332)) return 332;
        if(Cache.getTheCache().contains(objectId, 361)) return 361;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void subServiceSet(long OrderStatusId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long OrderStatusId, OrderStatus4Public ThisVal) throws PersistenceException {
        
    }

}

