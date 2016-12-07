package persistence;

import model.*;

public class OrderManagerOrdersFacade{

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

	

	public OrderManagerOrdersFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOrderManagerOrders newOrderManagerOrders(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOrderManagerOrders)PersistentProxi.createProxi(idCreateIfLessZero, 373);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderManagerOrdersFacade.getNextId();
        OrderManagerOrders result = new OrderManagerOrders(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderManagerOrders)PersistentProxi.createProxi(id, 373);
    }
    
    public PersistentOrderManagerOrders newDelayedOrderManagerOrders() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderManagerOrdersFacade.getNextId();
        OrderManagerOrders result = new OrderManagerOrders(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderManagerOrders)PersistentProxi.createProxi(id, 373);
    }
    
    public OrderManagerOrders getOrderManagerOrders(long OrderManagerOrdersId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 373)) return 373;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long OrderManagerOrdersId, OrderManager4Public observerVal) throws PersistenceException {
        
    }
    public long observeeAdd(long OrderManagerOrdersId, Order4Public observeeVal) throws PersistenceException {
        return 0;
    }
    public void observeeRem(long observeeId) throws PersistenceException {
        
    }
    public OrderList observeeGet(long OrderManagerOrdersId) throws PersistenceException {
        return new OrderList(); // remote access for initialization only!
    }
    public void ThisSet(long OrderManagerOrdersId, OrderManagerOrders4Public ThisVal) throws PersistenceException {
        
    }

}

