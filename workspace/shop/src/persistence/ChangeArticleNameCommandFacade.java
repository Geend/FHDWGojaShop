package persistence;

import model.meta.*;

public class ChangeArticleNameCommandFacade{

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

	

	public ChangeArticleNameCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentChangeArticleNameCommand newChangeArticleNameCommand(String newName,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentChangeArticleNameCommand)PersistentProxi.createProxi(idCreateIfLessZero, 430);
        long id = ConnectionHandler.getTheConnectionHandler().theChangeArticleNameCommandFacade.getNextId();
        ChangeArticleNameCommand result = new ChangeArticleNameCommand(null,newName,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeArticleNameCommand)PersistentProxi.createProxi(id, 430);
    }
    
    public PersistentChangeArticleNameCommand newDelayedChangeArticleNameCommand(String newName) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theChangeArticleNameCommandFacade.getNextId();
        ChangeArticleNameCommand result = new ChangeArticleNameCommand(null,newName,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeArticleNameCommand)PersistentProxi.createProxi(id, 430);
    }
    
    public ChangeArticleNameCommand getChangeArticleNameCommand(long ChangeArticleNameCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 430)) return 430;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleSet(long ChangeArticleNameCommandId, ArticleWrapper4Public articleVal) throws PersistenceException {
        
    }
    public void newNameSet(long ChangeArticleNameCommandId, String newNameVal) throws PersistenceException {
        
    }
    public void invokerSet(long ChangeArticleNameCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ChangeArticleNameCommandId, Shop4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ChangeArticleNameCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

