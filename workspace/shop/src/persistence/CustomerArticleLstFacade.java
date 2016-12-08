package persistence;

import model.*;

public class CustomerArticleLstFacade{

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

	

	public CustomerArticleLstFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerArticleLst newCustomerArticleLst(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerArticleLst)PersistentProxi.createProxi(idCreateIfLessZero, 324);
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerArticleLstFacade.getNextId();
        CustomerArticleLst result = new CustomerArticleLst(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerArticleLst)PersistentProxi.createProxi(id, 324);
    }
    
    public PersistentCustomerArticleLst newDelayedCustomerArticleLst() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerArticleLstFacade.getNextId();
        CustomerArticleLst result = new CustomerArticleLst(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerArticleLst)PersistentProxi.createProxi(id, 324);
    }
    
    public CustomerArticleLst getCustomerArticleLst(long CustomerArticleLstId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 324)) return 324;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public long articlesAdd(long CustomerArticleLstId, ArticleWrapper4Public articlesVal) throws PersistenceException {
        return 0;
    }
    public void articlesRem(long articlesId) throws PersistenceException {
        
    }
    public ArticleWrapperList articlesGet(long CustomerArticleLstId) throws PersistenceException {
        return new ArticleWrapperList(); // remote access for initialization only!
    }
    public void subServiceSet(long CustomerArticleLstId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long CustomerArticleLstId, CustomerArticleLst4Public ThisVal) throws PersistenceException {
        
    }

}

