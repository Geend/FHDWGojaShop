package persistence;

import model.meta.*;

public class AddArticleReturnCommandFacade{

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

	

	public AddArticleReturnCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentAddArticleReturnCommand newAddArticleReturnCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentAddArticleReturnCommand)PersistentProxi.createProxi(idCreateIfLessZero, 352);
        long id = ConnectionHandler.getTheConnectionHandler().theAddArticleReturnCommandFacade.getNextId();
        AddArticleReturnCommand result = new AddArticleReturnCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAddArticleReturnCommand)PersistentProxi.createProxi(id, 352);
    }
    
    public PersistentAddArticleReturnCommand newDelayedAddArticleReturnCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theAddArticleReturnCommandFacade.getNextId();
        AddArticleReturnCommand result = new AddArticleReturnCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAddArticleReturnCommand)PersistentProxi.createProxi(id, 352);
    }
    
    public AddArticleReturnCommand getAddArticleReturnCommand(long AddArticleReturnCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 352)) return 352;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleReturnSet(long AddArticleReturnCommandId, ArticleReturn4Public articleReturnVal) throws PersistenceException {
        
    }
    public void invokerSet(long AddArticleReturnCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long AddArticleReturnCommandId, ReturnManager4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long AddArticleReturnCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

