package persistence;

import model.meta.*;

public class NewArticleCommandFacade{

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

	

	public NewArticleCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentNewArticleCommand newNewArticleCommand(String name,common.Fraction price,long minStock,long maxStock,long producerDeliveryTime,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentNewArticleCommand)PersistentProxi.createProxi(idCreateIfLessZero, 272);
        long id = ConnectionHandler.getTheConnectionHandler().theNewArticleCommandFacade.getNextId();
        NewArticleCommand result = new NewArticleCommand(name,price,minStock,maxStock,producerDeliveryTime,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentNewArticleCommand)PersistentProxi.createProxi(id, 272);
    }
    
    public PersistentNewArticleCommand newDelayedNewArticleCommand(String name,common.Fraction price,long minStock,long maxStock,long producerDeliveryTime) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theNewArticleCommandFacade.getNextId();
        NewArticleCommand result = new NewArticleCommand(name,price,minStock,maxStock,producerDeliveryTime,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentNewArticleCommand)PersistentProxi.createProxi(id, 272);
    }
    
    public NewArticleCommand getNewArticleCommand(long NewArticleCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 272)) return 272;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void nameSet(long NewArticleCommandId, String nameVal) throws PersistenceException {
        
    }
    public void priceSet(long NewArticleCommandId, common.Fraction priceVal) throws PersistenceException {
        
    }
    public void minStockSet(long NewArticleCommandId, long minStockVal) throws PersistenceException {
        
    }
    public void maxStockSet(long NewArticleCommandId, long maxStockVal) throws PersistenceException {
        
    }
    public void producerDeliveryTimeSet(long NewArticleCommandId, long producerDeliveryTimeVal) throws PersistenceException {
        
    }
    public void producerSet(long NewArticleCommandId, Producer4Public producerVal) throws PersistenceException {
        
    }
    public void invokerSet(long NewArticleCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long NewArticleCommandId, ProductGroup4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long NewArticleCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

