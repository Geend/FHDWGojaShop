package persistence;

import model.*;

import java.util.Iterator;

public class ProducerLst_CurrentProducerProxi extends PersistentListProxi<Producer4Public> {

  	private ProducerList list;
  	private ProducerLst owner;

  	public ProducerLst_CurrentProducerProxi(ProducerLst owner) {
    	this.owner = owner;
  	}
  	public ProducerList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new ProducerList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theProducerLstFacade.currentProducerGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<Producer4Public> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(Producer4Public entry) throws PersistenceException {
    	if (entry != null) {
      		ProducerList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theProducerLstFacade
        	               	.currentProducerAdd(owner.getId(), entry);
      		}
      		list.add((Producer4Public)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theProducerLstFacade.currentProducerRem(entry.getListEntryId());
    	}
    	
  	}
  	public ProducerLst_CurrentProducerProxi copy(ProducerLst owner) throws PersistenceException {
  		ProducerLst_CurrentProducerProxi result = new ProducerLst_CurrentProducerProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<Producer4Public> entries = (this.list == null ? new java.util.Vector<Producer4Public>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			Producer4Public current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theProducerLstFacade
            	           .currentProducerAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
