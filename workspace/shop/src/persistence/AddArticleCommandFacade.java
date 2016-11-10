package persistence;

import model.meta.*;

public class AddArticleCommandFacade{

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

	

	public AddArticleCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentAddArticleCommand newAddArticleCommand(String name,common.Fraction price,long minStock,long maxStock,long producerDeliveryTime,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentAddArticleCommand)PersistentProxi.createProxi(idCreateIfLessZero, 208);
        long id = ConnectionHandler.getTheConnectionHandler().theAddArticleCommandFacade.getNextId();
        AddArticleCommand result = new AddArticleCommand(name,price,minStock,maxStock,producerDeliveryTime,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAddArticleCommand)PersistentProxi.createProxi(id, 208);
    }
    
    public PersistentAddArticleCommand newDelayedAddArticleCommand(String name,common.Fraction price,long minStock,long maxStock,long producerDeliveryTime) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theAddArticleCommandFacade.getNextId();
        AddArticleCommand result = new AddArticleCommand(name,price,minStock,maxStock,producerDeliveryTime,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAddArticleCommand)PersistentProxi.createProxi(id, 208);
    }
    
    public AddArticleCommand getAddArticleCommand(long AddArticleCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 208)) return 208;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void nameSet(long AddArticleCommandId, String nameVal) throws PersistenceException {
        
    }
    public void priceSet(long AddArticleCommandId, common.Fraction priceVal) throws PersistenceException {
        
    }
    public void minStockSet(long AddArticleCommandId, long minStockVal) throws PersistenceException {
        
    }
    public void maxStockSet(long AddArticleCommandId, long maxStockVal) throws PersistenceException {
        
    }
    public void producerDeliveryTimeSet(long AddArticleCommandId, long producerDeliveryTimeVal) throws PersistenceException {
        
    }
    public void producerSet(long AddArticleCommandId, Producer4Public producerVal) throws PersistenceException {
        
    }
    public void invokerSet(long AddArticleCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long AddArticleCommandId, ProductGroup4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long AddArticleCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

