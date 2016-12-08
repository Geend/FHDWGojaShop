package persistence;

import model.*;

public class ArticleFacade{

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

	

	public ArticleFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentArticle newArticle(String name,common.Fraction price,long minStock,long maxStock,long currentStock,long producerDeliveryTime,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentArticle)PersistentProxi.createProxi(idCreateIfLessZero, 194);
        long id = ConnectionHandler.getTheConnectionHandler().theArticleFacade.getNextId();
        Article result = new Article(name,price,minStock,maxStock,currentStock,producerDeliveryTime,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentArticle)PersistentProxi.createProxi(id, 194);
    }
    
    public PersistentArticle newDelayedArticle(String name,common.Fraction price,long minStock,long maxStock,long currentStock,long producerDeliveryTime) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theArticleFacade.getNextId();
        Article result = new Article(name,price,minStock,maxStock,currentStock,producerDeliveryTime,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentArticle)PersistentProxi.createProxi(id, 194);
    }
    
    public Article getArticle(long ArticleId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 194)) return 194;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public ArticleSearchList getArticleByName(String name) throws PersistenceException {
        name = name.replaceAll("%", ".*");
        name = name.replaceAll("_", ".");
        ArticleSearchList result = new ArticleSearchList();
        java.util.Iterator<?> candidates;
        candidates = Cache.getTheCache().iterator(194);
        while (candidates.hasNext()){
            PersistentArticle current = (PersistentArticle)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getName().matches(name))
                result.add((PersistentArticle)PersistentProxi.createProxi(current.getId(), current.getClassId()));
        }
        return result;
    }
    public void nameSet(long ArticleId, String nameVal) throws PersistenceException {
        
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
    public void subServiceSet(long ArticleId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ArticleId, Article4Public ThisVal) throws PersistenceException {
        
    }

}

