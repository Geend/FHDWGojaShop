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
        if(idCreateIfLessZero > 0) return (PersistentChangeArticleNameCommand)PersistentProxi.createProxi(idCreateIfLessZero, 290);
        long id = ConnectionHandler.getTheConnectionHandler().theChangeArticleNameCommandFacade.getNextId();
        ChangeArticleNameCommand result = new ChangeArticleNameCommand(newName,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeArticleNameCommand)PersistentProxi.createProxi(id, 290);
    }
    
    public PersistentChangeArticleNameCommand newDelayedChangeArticleNameCommand(String newName) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theChangeArticleNameCommandFacade.getNextId();
        ChangeArticleNameCommand result = new ChangeArticleNameCommand(newName,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeArticleNameCommand)PersistentProxi.createProxi(id, 290);
    }
    
    public ChangeArticleNameCommand getChangeArticleNameCommand(long ChangeArticleNameCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 290)) return 290;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void newNameSet(long ChangeArticleNameCommandId, String newNameVal) throws PersistenceException {
        
    }
    public void invokerSet(long ChangeArticleNameCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ChangeArticleNameCommandId, ArticleWrapper4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ChangeArticleNameCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

