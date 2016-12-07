package persistence;

import model.*;

import java.util.Iterator;

public class OrderManagerOrders_ObserveeProxi extends PersistentListProxi<Order4Public> {

  	private OrderList list;
  	private OrderManagerOrders owner;

  	public OrderManagerOrders_ObserveeProxi(OrderManagerOrders owner) {
    	this.owner = owner;
  	}
  	public OrderList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new OrderList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theOrderManagerOrdersFacade.observeeGet(this.owner.getId());
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
        		entryId = ConnectionHandler.getTheConnectionHandler().theOrderManagerOrdersFacade
        	               	.observeeAdd(owner.getId(), entry);
      		}
      		list.add((Order4Public)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		entry.register(this.owner);
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theOrderManagerOrdersFacade.observeeRem(entry.getListEntryId());
    	}
    	((Order4Public)entry).deregister(this.owner);
  	}
  	public OrderManagerOrders_ObserveeProxi copy(OrderManagerOrders owner) throws PersistenceException {
  		OrderManagerOrders_ObserveeProxi result = new OrderManagerOrders_ObserveeProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<Order4Public> entries = (this.list == null ? new java.util.Vector<Order4Public>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			Order4Public current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theOrderManagerOrdersFacade
            	           .observeeAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
