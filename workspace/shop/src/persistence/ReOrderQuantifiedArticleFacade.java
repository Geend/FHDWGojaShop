package persistence;

import model.*;

public class ReOrderQuantifiedArticleFacade{



	public ReOrderQuantifiedArticleFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentReOrderQuantifiedArticle newReOrderQuantifiedArticle(long quantity,long producerDeliveryTimeAtReorder,long countdown,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentReOrderQuantifiedArticle)PersistentProxi.createProxi(idCreateIfLessZero, 326);
        long id = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticleFacade.getNextId();
        ReOrderQuantifiedArticle result = new ReOrderQuantifiedArticle(quantity,null,null,null,producerDeliveryTimeAtReorder,countdown,id);
        Cache.getTheCache().put(result);
        return (PersistentReOrderQuantifiedArticle)PersistentProxi.createProxi(id, 326);
    }
    
    public PersistentReOrderQuantifiedArticle newDelayedReOrderQuantifiedArticle(long quantity,long producerDeliveryTimeAtReorder,long countdown) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticleFacade.getNextId();
        ReOrderQuantifiedArticle result = new ReOrderQuantifiedArticle(quantity,null,null,null,producerDeliveryTimeAtReorder,countdown,id);
        Cache.getTheCache().put(result);
        return (PersistentReOrderQuantifiedArticle)PersistentProxi.createProxi(id, 326);
    }
    
    public ReOrderQuantifiedArticle getReOrderQuantifiedArticle(long ReOrderQuantifiedArticleId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void producerDeliveryTimeAtReorderSet(long ReOrderQuantifiedArticleId, long producerDeliveryTimeAtReorderVal) throws PersistenceException {
        
    }
    public void countdownSet(long ReOrderQuantifiedArticleId, long countdownVal) throws PersistenceException {
        
    }

}

