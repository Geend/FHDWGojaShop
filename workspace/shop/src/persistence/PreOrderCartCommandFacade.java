package persistence;

import model.meta.*;

public class PreOrderCartCommandFacade{

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

	

	public PreOrderCartCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentPreOrderCartCommand newPreOrderCartCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentPreOrderCartCommand)PersistentProxi.createProxi(idCreateIfLessZero, 435);
        long id = ConnectionHandler.getTheConnectionHandler().thePreOrderCartCommandFacade.getNextId();
        PreOrderCartCommand result = new PreOrderCartCommand(null,null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentPreOrderCartCommand)PersistentProxi.createProxi(id, 435);
    }
    
    public PersistentPreOrderCartCommand newDelayedPreOrderCartCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().thePreOrderCartCommandFacade.getNextId();
        PreOrderCartCommand result = new PreOrderCartCommand(null,null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentPreOrderCartCommand)PersistentProxi.createProxi(id, 435);
    }
    
    public PreOrderCartCommand getPreOrderCartCommand(long PreOrderCartCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 435)) return 435;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void managerSet(long PreOrderCartCommandId, CustomerOrderManager4Public managerVal) throws PersistenceException {
        
    }
    public void cartSet(long PreOrderCartCommandId, ShoppingCart4Public cartVal) throws PersistenceException {
        
    }
    public void customerDeliveryTimeSet(long PreOrderCartCommandId, CustomerDeliveryTime4Public customerDeliveryTimeVal) throws PersistenceException {
        
    }
    public void invokerSet(long PreOrderCartCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long PreOrderCartCommandId, Shop4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long PreOrderCartCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

