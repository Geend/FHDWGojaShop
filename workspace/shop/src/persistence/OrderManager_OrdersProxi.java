package persistence;

import model.*;

import java.util.Iterator;

public class OrderManager_OrdersProxi extends PersistentListProxi<Order4Public> {

  	private OrderList list;
  	private OrderManager owner;

  	public OrderManager_OrdersProxi(OrderManager owner) {
    	this.owner = owner;
  	}
  	public OrderList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new OrderList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theOrderManagerFacade.ordersGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<Order4Public> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(Order4Public entry) throws PersistenceException {
    	if (entry != null) {
      		OrderList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade
        	               	.ordersAdd(owner.getId(), entry);
      		}
      		list.add((Order4Public)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade.ordersRem(entry.getListEntryId());
    	}
    	
  	}
  	public OrderManager_OrdersProxi copy(OrderManager owner) throws PersistenceException {
  		OrderManager_OrdersProxi result = new OrderManager_OrdersProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<Order4Public> entries = (this.list == null ? new java.util.Vector<Order4Public>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			Order4Public current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade
            	           .ordersAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
