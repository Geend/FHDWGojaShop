package persistence;

import model.*;

public class OrderFacade{

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

	

	public OrderFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOrder newOrder(common.Fraction totalPrice,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOrder)PersistentProxi.createProxi(idCreateIfLessZero, 238);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderFacade.getNextId();
        Order result = new Order(null,totalPrice,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrder)PersistentProxi.createProxi(id, 238);
    }
    
    public PersistentOrder newDelayedOrder(common.Fraction totalPrice) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderFacade.getNextId();
        Order result = new Order(null,totalPrice,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrder)PersistentProxi.createProxi(id, 238);
    }
    
    public Order getOrder(long OrderId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 238)) return 238;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public long articlesAdd(long OrderId, OrderQuantifiedArticle4Public articlesVal) throws PersistenceException {
        return 0;
    }
    public void articlesRem(long articlesId) throws PersistenceException {
        
    }
    public OrderQuantifiedArticleList articlesGet(long OrderId) throws PersistenceException {
        return new OrderQuantifiedArticleList(); // remote access for initialization only!
    }
    public void customerDeliveryTimeSet(long OrderId, CustomerDeliveryTime4Public customerDeliveryTimeVal) throws PersistenceException {
        
    }
    public void totalPriceSet(long OrderId, common.Fraction totalPriceVal) throws PersistenceException {
        
    }
    public void stateSet(long OrderId, OrderStatus4Public stateVal) throws PersistenceException {
        
    }
    public void subServiceSet(long OrderId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long OrderId, Order4Public ThisVal) throws PersistenceException {
        
    }

}

