package persistence;

import model.*;

import java.util.Iterator;

public class CustomerDeliveryTimeManager_CustomerDeliveryTimesProxi extends PersistentListProxi<CustomerDeliveryTime4Public> {

  	private CustomerDeliveryTimeList list;
  	private CustomerDeliveryTimeManager owner;

  	public CustomerDeliveryTimeManager_CustomerDeliveryTimesProxi(CustomerDeliveryTimeManager owner) {
    	this.owner = owner;
  	}
  	public CustomerDeliveryTimeList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new CustomerDeliveryTimeList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theCustomerDeliveryTimeManagerFacade.customerDeliveryTimesGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<CustomerDeliveryTime4Public> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(CustomerDeliveryTime4Public entry) throws PersistenceException {
    	if (entry != null) {
      		CustomerDeliveryTimeList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeManagerFacade
        	               	.customerDeliveryTimesAdd(owner.getId(), entry);
      		}
      		list.add((CustomerDeliveryTime4Public)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeManagerFacade.customerDeliveryTimesRem(entry.getListEntryId());
    	}
    	
  	}
  	public CustomerDeliveryTimeManager_CustomerDeliveryTimesProxi copy(CustomerDeliveryTimeManager owner) throws PersistenceException {
  		CustomerDeliveryTimeManager_CustomerDeliveryTimesProxi result = new CustomerDeliveryTimeManager_CustomerDeliveryTimesProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<CustomerDeliveryTime4Public> entries = (this.list == null ? new java.util.Vector<CustomerDeliveryTime4Public>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			CustomerDeliveryTime4Public current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeManagerFacade
            	           .customerDeliveryTimesAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
