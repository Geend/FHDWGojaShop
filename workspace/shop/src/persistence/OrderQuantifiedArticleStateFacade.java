package persistence;



public class OrderQuantifiedArticleStateFacade{

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

	

	public OrderQuantifiedArticleStateFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 356)) return 356;
        if(Cache.getTheCache().contains(objectId, 355)) return 355;
        if(Cache.getTheCache().contains(objectId, 451)) return 451;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void subServiceSet(long OrderQuantifiedArticleStateId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long OrderQuantifiedArticleStateId, OrderQuantifiedArticleState4Public ThisVal) throws PersistenceException {
        
    }

}

