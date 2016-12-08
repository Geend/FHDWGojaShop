package persistence;

import model.meta.*;

public class ChangeArticlePriceCommandFacade{

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

	

	public ChangeArticlePriceCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentChangeArticlePriceCommand newChangeArticlePriceCommand(common.Fraction newPrice,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentChangeArticlePriceCommand)PersistentProxi.createProxi(idCreateIfLessZero, 431);
        long id = ConnectionHandler.getTheConnectionHandler().theChangeArticlePriceCommandFacade.getNextId();
        ChangeArticlePriceCommand result = new ChangeArticlePriceCommand(null,newPrice,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeArticlePriceCommand)PersistentProxi.createProxi(id, 431);
    }
    
    public PersistentChangeArticlePriceCommand newDelayedChangeArticlePriceCommand(common.Fraction newPrice) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theChangeArticlePriceCommandFacade.getNextId();
        ChangeArticlePriceCommand result = new ChangeArticlePriceCommand(null,newPrice,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeArticlePriceCommand)PersistentProxi.createProxi(id, 431);
    }
    
    public ChangeArticlePriceCommand getChangeArticlePriceCommand(long ChangeArticlePriceCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 431)) return 431;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleSet(long ChangeArticlePriceCommandId, ArticleWrapper4Public articleVal) throws PersistenceException {
        
    }
    public void newPriceSet(long ChangeArticlePriceCommandId, common.Fraction newPriceVal) throws PersistenceException {
        
    }
    public void invokerSet(long ChangeArticlePriceCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ChangeArticlePriceCommandId, Shop4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ChangeArticlePriceCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

