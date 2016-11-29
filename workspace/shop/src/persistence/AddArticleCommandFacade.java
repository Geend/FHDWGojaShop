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
    public PersistentAddArticleCommand newAddArticleCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentAddArticleCommand)PersistentProxi.createProxi(idCreateIfLessZero, 292);
        long id = ConnectionHandler.getTheConnectionHandler().theAddArticleCommandFacade.getNextId();
        AddArticleCommand result = new AddArticleCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAddArticleCommand)PersistentProxi.createProxi(id, 292);
    }
    
    public PersistentAddArticleCommand newDelayedAddArticleCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theAddArticleCommandFacade.getNextId();
        AddArticleCommand result = new AddArticleCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAddArticleCommand)PersistentProxi.createProxi(id, 292);
    }
    
    public AddArticleCommand getAddArticleCommand(long AddArticleCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 292)) return 292;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleSet(long AddArticleCommandId, ShoppingCartQuantifiedArticle4Public articleVal) throws PersistenceException {
        
    }
    public void invokerSet(long AddArticleCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long AddArticleCommandId, ShoppingCart4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long AddArticleCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

