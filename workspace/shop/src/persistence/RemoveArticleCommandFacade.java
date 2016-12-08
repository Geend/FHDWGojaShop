package persistence;

import model.meta.*;

public class RemoveArticleCommandFacade{

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

	

	public RemoveArticleCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentRemoveArticleCommand newRemoveArticleCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentRemoveArticleCommand)PersistentProxi.createProxi(idCreateIfLessZero, 293);
        long id = ConnectionHandler.getTheConnectionHandler().theRemoveArticleCommandFacade.getNextId();
        RemoveArticleCommand result = new RemoveArticleCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentRemoveArticleCommand)PersistentProxi.createProxi(id, 293);
    }
    
    public PersistentRemoveArticleCommand newDelayedRemoveArticleCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theRemoveArticleCommandFacade.getNextId();
        RemoveArticleCommand result = new RemoveArticleCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentRemoveArticleCommand)PersistentProxi.createProxi(id, 293);
    }
    
    public RemoveArticleCommand getRemoveArticleCommand(long RemoveArticleCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 293)) return 293;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleSet(long RemoveArticleCommandId, ShoppingCartQuantifiedArticle4Public articleVal) throws PersistenceException {
        
    }
    public void invokerSet(long RemoveArticleCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long RemoveArticleCommandId, ShoppingCart4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long RemoveArticleCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

