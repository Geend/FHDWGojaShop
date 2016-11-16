package persistence;



public class AbstractOrderFacade{

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

	

	public AbstractOrderFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 233)) return 233;
        if(Cache.getTheCache().contains(objectId, 238)) return 238;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public long articlesAdd(long AbstractOrderId, OrderQuantifiedArticle4Public articlesVal) throws PersistenceException {
        return 0;
    }
    public void articlesRem(long articlesId) throws PersistenceException {
        
    }
    public OrderQuantifiedArticleList articlesGet(long AbstractOrderId) throws PersistenceException {
        return new OrderQuantifiedArticleList(); // remote access for initialization only!
    }
    public void customerDeliveryTimeSet(long AbstractOrderId, CustomerDeliveryTime4Public customerDeliveryTimeVal) throws PersistenceException {
        
    }
    public void subServiceSet(long AbstractOrderId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long AbstractOrderId, AbstractOrder4Public ThisVal) throws PersistenceException {
        
    }

}

