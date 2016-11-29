package persistence;

import model.meta.*;

public class ChangeArticleQuantityCommandFacade{

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

	

	public ChangeArticleQuantityCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentChangeArticleQuantityCommand newChangeArticleQuantityCommand(long newQuantity,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentChangeArticleQuantityCommand)PersistentProxi.createProxi(idCreateIfLessZero, 294);
        long id = ConnectionHandler.getTheConnectionHandler().theChangeArticleQuantityCommandFacade.getNextId();
        ChangeArticleQuantityCommand result = new ChangeArticleQuantityCommand(newQuantity,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeArticleQuantityCommand)PersistentProxi.createProxi(id, 294);
    }
    
    public PersistentChangeArticleQuantityCommand newDelayedChangeArticleQuantityCommand(long newQuantity) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theChangeArticleQuantityCommandFacade.getNextId();
        ChangeArticleQuantityCommand result = new ChangeArticleQuantityCommand(newQuantity,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeArticleQuantityCommand)PersistentProxi.createProxi(id, 294);
    }
    
    public ChangeArticleQuantityCommand getChangeArticleQuantityCommand(long ChangeArticleQuantityCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 294)) return 294;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void newQuantitySet(long ChangeArticleQuantityCommandId, long newQuantityVal) throws PersistenceException {
        
    }
    public void invokerSet(long ChangeArticleQuantityCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ChangeArticleQuantityCommandId, ShoppingCartQuantifiedArticle4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ChangeArticleQuantityCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

