package persistence;

import model.*;

public class ArticleFacade{



	public ArticleFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentArticle newArticle(String name,common.Fraction price,long minStock,long maxStock,long currentStock,long producerDeliveryTime,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentArticle)PersistentProxi.createProxi(idCreateIfLessZero, 194);
        long id = ConnectionHandler.getTheConnectionHandler().theComponentFacade.getNextId();
        Article result = new Article(name,null,null,price,minStock,maxStock,currentStock,producerDeliveryTime,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentArticle)PersistentProxi.createProxi(id, 194);
    }
    
    public PersistentArticle newDelayedArticle(String name,common.Fraction price,long minStock,long maxStock,long currentStock,long producerDeliveryTime) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theComponentFacade.getNextId();
        Article result = new Article(name,null,null,price,minStock,maxStock,currentStock,producerDeliveryTime,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentArticle)PersistentProxi.createProxi(id, 194);
    }
    
    public Article getArticle(long ArticleId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void priceSet(long ArticleId, common.Fraction priceVal) throws PersistenceException {
        
    }
    public void minStockSet(long ArticleId, long minStockVal) throws PersistenceException {
        
    }
    public void maxStockSet(long ArticleId, long maxStockVal) throws PersistenceException {
        
    }
    public void currentStockSet(long ArticleId, long currentStockVal) throws PersistenceException {
        
    }
    public void producerDeliveryTimeSet(long ArticleId, long producerDeliveryTimeVal) throws PersistenceException {
        
    }
    public void producerSet(long ArticleId, Producer4Public producerVal) throws PersistenceException {
        
    }
    public void stateSet(long ArticleId, ArticleState4Public stateVal) throws PersistenceException {
        
    }
    public void parentSet(long ArticleId, ProductGroup4Public parentVal) throws PersistenceException {
        
    }

}

