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
        if(Cache.getTheCache().contains(objectId, 308)) return 308;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public long ordersAdd(long OrderManagerId, Order4Public ordersVal) throws PersistenceException {
        return 0;
    }
    public void ordersRem(long ordersId) throws PersistenceException {
        
    }
    public OrderList ordersGet(long OrderManagerId) throws PersistenceException {
        return new OrderList(); // remote access for initialization only!
    }
    public void subServiceSet(long OrderManagerId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long OrderManagerId, OrderManager4Public ThisVal) throws PersistenceException {
        
    }

}

