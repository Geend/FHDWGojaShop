package persistence;

import model.*;

import java.util.Iterator;

public class GlobalOrderArchive_OrdersProxi extends PersistentListProxi<Order4Public> {

  	private OrderList list;
  	private GlobalOrderArchive owner;

  	public GlobalOrderArchive_OrdersProxi(GlobalOrderArchive owner) {
    	this.owner = owner;
  	}
  	public OrderList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new OrderList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theGlobalOrderArchiveFacade.ordersGet(this.owner.getId());
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
        		entryId = ConnectionHandler.getTheConnectionHandler().theGlobalOrderArchiveFacade
        	               	.ordersAdd(owner.getId(), entry);
      		}
      		list.add((Order4Public)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theGlobalOrderArchiveFacade.ordersRem(entry.getListEntryId());
    	}
    	
  	}
  	public GlobalOrderArchive_OrdersProxi copy(GlobalOrderArchive owner) throws PersistenceException {
  		GlobalOrderArchive_OrdersProxi result = new GlobalOrderArchive_OrdersProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<Order4Public> entries = (this.list == null ? new java.util.Vector<Order4Public>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			Order4Public current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theGlobalOrderArchiveFacade
            	           .ordersAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
