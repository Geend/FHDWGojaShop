package persistence;



public class ComponentFacade{

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

	

	public ComponentFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 214)) return 214;
        if(Cache.getTheCache().contains(objectId, 213)) return 213;
        if(Cache.getTheCache().contains(objectId, 242)) return 242;
        if(Cache.getTheCache().contains(objectId, 194)) return 194;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public ComponentSearchList getComponentByName(String name) throws PersistenceException {
        name = name.replaceAll("%", ".*");
        name = name.replaceAll("_", ".");
        ComponentSearchList result = new ComponentSearchList();
        java.util.Iterator<?> candidates;
        candidates = Cache.getTheCache().iterator(214);
        while (candidates.hasNext()){
            PersistentComponent current = (PersistentComponent)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getName().matches(name))
                result.add((PersistentComponent)PersistentProxi.createProxi(current.getId(), current.getClassId()));
        }
        candidates = Cache.getTheCache().iterator(213);
        while (candidates.hasNext()){
            PersistentComponent current = (PersistentComponent)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getName().matches(name))
                result.add((PersistentComponent)PersistentProxi.createProxi(current.getId(), current.getClassId()));
        }
        candidates = Cache.getTheCache().iterator(242);
        while (candidates.hasNext()){
            PersistentComponent current = (PersistentComponent)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getName().matches(name))
                result.add((PersistentComponent)PersistentProxi.createProxi(current.getId(), current.getClassId()));
        }
        candidates = Cache.getTheCache().iterator(194);
        while (candidates.hasNext()){
            PersistentComponent current = (PersistentComponent)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getName().matches(name))
                result.add((PersistentComponent)PersistentProxi.createProxi(current.getId(), current.getClassId()));
        }
        return result;
    }
    public void nameSet(long ComponentId, String nameVal) throws PersistenceException {
        
    }
    public void subServiceSet(long ComponentId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ComponentId, Component4Public ThisVal) throws PersistenceException {
        
    }

}

