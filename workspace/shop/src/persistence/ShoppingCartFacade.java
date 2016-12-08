package persistence;

import model.*;

public class ShoppingCartFacade{

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

	

	public ShoppingCartFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentShoppingCart newShoppingCart(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentShoppingCart)PersistentProxi.createProxi(idCreateIfLessZero, 241);
        long id = ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade.getNextId();
        ShoppingCart result = new ShoppingCart(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShoppingCart)PersistentProxi.createProxi(id, 241);
    }
    
    public PersistentShoppingCart newDelayedShoppingCart() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade.getNextId();
        ShoppingCart result = new ShoppingCart(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShoppingCart)PersistentProxi.createProxi(id, 241);
    }
    
    public ShoppingCart getShoppingCart(long ShoppingCartId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 241)) return 241;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public long articlesAdd(long ShoppingCartId, ShoppingCartQuantifiedArticle4Public articlesVal) throws PersistenceException {
        return 0;
    }
    public void articlesRem(long articlesId) throws PersistenceException {
        
    }
    public ShoppingCartQuantifiedArticleList articlesGet(long ShoppingCartId) throws PersistenceException {
        return new ShoppingCartQuantifiedArticleList(); // remote access for initialization only!
    }
    public void subServiceSet(long ShoppingCartId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ShoppingCartId, ShoppingCart4Public ThisVal) throws PersistenceException {
        
    }

}

