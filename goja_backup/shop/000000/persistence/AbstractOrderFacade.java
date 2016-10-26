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
        if(Cache.getTheCache().contains(objectId, 147)) return 147;
        if(Cache.getTheCache().contains(objectId, 149)) return 149;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articlesSet(long AbstractOrderId, PersistentOrderQuantifiedArticle articlesVal) throws PersistenceException {
        
    }
    public void customerDeliveryTimeSet(long AbstractOrderId, PersistentCustomerDeliveryTime customerDeliveryTimeVal) throws PersistenceException {
        
    }
    public void ThisSet(long AbstractOrderId, PersistentAbstractOrder ThisVal) throws PersistenceException {
        
    }

}

