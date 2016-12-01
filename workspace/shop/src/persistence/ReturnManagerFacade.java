package persistence;

import model.*;

public class ReturnManagerFacade{

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

	

	public ReturnManagerFacade() {
	}

    public PersistentReturnManager getTheReturnManager() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theReturnManagerFacade.getNextId();
        ReturnManager result = new ReturnManager(null, null, id);
        PersistentInCacheProxi cached = Cache.getTheCache().putSingleton(result);
        return (PersistentReturnManager)PersistentProxi.createProxi(cached.getId()  * (cached.getTheObject().isTheSameAs(result) ? -1 : 1), 351);
    }
    
    public ReturnManager getReturnManager(long ReturnManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 351)) return 351;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public long articleReturnAdd(long ReturnManagerId, ArticleReturn4Public articleReturnVal) throws PersistenceException {
        return 0;
    }
    public void articleReturnRem(long articleReturnId) throws PersistenceException {
        
    }
    public ArticleReturnList articleReturnGet(long ReturnManagerId) throws PersistenceException {
        return new ArticleReturnList(); // remote access for initialization only!
    }
    public void subServiceSet(long ReturnManagerId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ReturnManagerId, ReturnManager4Public ThisVal) throws PersistenceException {
        
    }

}

