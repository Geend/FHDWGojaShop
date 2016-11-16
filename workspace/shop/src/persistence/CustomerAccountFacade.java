package persistence;

import model.*;

public class CustomerAccountFacade{

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

	

	public CustomerAccountFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerAccount newCustomerAccount(common.Fraction balance,long limit,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerAccount)PersistentProxi.createProxi(idCreateIfLessZero, 239);
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade.getNextId();
        CustomerAccount result = new CustomerAccount(balance,limit,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerAccount)PersistentProxi.createProxi(id, 239);
    }
    
    public PersistentCustomerAccount newDelayedCustomerAccount(common.Fraction balance,long limit) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade.getNextId();
        CustomerAccount result = new CustomerAccount(balance,limit,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerAccount)PersistentProxi.createProxi(id, 239);
    }
    
    public CustomerAccount getCustomerAccount(long CustomerAccountId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 239)) return 239;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void balanceSet(long CustomerAccountId, common.Fraction balanceVal) throws PersistenceException {
        
    }
    public void limitSet(long CustomerAccountId, long limitVal) throws PersistenceException {
        
    }
    public void shoppingCartSet(long CustomerAccountId, ShoppingCart4Public shoppingCartVal) throws PersistenceException {
        
    }
    public void subServiceSet(long CustomerAccountId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long CustomerAccountId, CustomerAccount4Public ThisVal) throws PersistenceException {
        
    }

}

