package persistence;

import model.*;

public class RootProductGroupFacade{



	public RootProductGroupFacade() {
	}

    public PersistentRootProductGroup getTheRootProductGroup() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theComponentFacade.getNextId();
        RootProductGroup result = new RootProductGroup("", null, null, null, id);
        PersistentInCacheProxi cached = Cache.getTheCache().putSingleton(result);
        return (PersistentRootProductGroup)PersistentProxi.createProxi(cached.getId()  * (cached.getTheObject().isTheSameAs(result) ? -1 : 1), 213);
    }
    
    public RootProductGroup getRootProductGroup(long RootProductGroupId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

