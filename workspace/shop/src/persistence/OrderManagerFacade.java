package persistence;



public class OrderManagerFacade{

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

	

	public OrderManagerFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 343)) return 343;
        if(Cache.getTheCache().contains(objectId, 308)) return 308;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void ordersSet(long OrderManagerId, OrderManagerOrders4Public ordersVal) throws PersistenceException {
        
    }
    public void subServiceSet(long OrderManagerId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long OrderManagerId, OrderManager4Public ThisVal) throws PersistenceException {
        
    }

}

