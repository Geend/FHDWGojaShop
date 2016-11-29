package persistence;

import model.*;

public class ArticleWrapperFacade{



	public ArticleWrapperFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentArticleWrapper newArticleWrapper(String name,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentArticleWrapper)PersistentProxi.createProxi(idCreateIfLessZero, 242);
        long id = ConnectionHandler.getTheConnectionHandler().theComponentFacade.getNextId();
        ArticleWrapper result = new ArticleWrapper(name,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentArticleWrapper)PersistentProxi.createProxi(id, 242);
    }
    
    public PersistentArticleWrapper newDelayedArticleWrapper(String name) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theComponentFacade.getNextId();
        ArticleWrapper result = new ArticleWrapper(name,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentArticleWrapper)PersistentProxi.createProxi(id, 242);
    }
    
    public ArticleWrapper getArticleWrapper(long ArticleWrapperId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void articleSet(long ArticleWrapperId, Article4Public articleVal) throws PersistenceException {
        
    }
    public void parentSet(long ArticleWrapperId, ProductGroup4Public parentVal) throws PersistenceException {
        
    }

}

