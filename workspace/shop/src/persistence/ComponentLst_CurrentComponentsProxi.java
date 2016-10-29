package persistence;

import model.*;

import java.util.Iterator;

public class ComponentLst_CurrentComponentsProxi extends PersistentListProxi<Component4Public> {

  	private ComponentList list;
  	private ComponentLst owner;

  	public ComponentLst_CurrentComponentsProxi(ComponentLst owner) {
    	this.owner = owner;
  	}
  	public ComponentList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new ComponentList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theComponentLstFacade.currentComponentsGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<Component4Public> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(Component4Public entry) throws PersistenceException {
    	if (entry != null) {
      		ComponentList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theComponentLstFacade
        	               	.currentComponentsAdd(owner.getId(), entry);
      		}
      		list.add((Component4Public)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theComponentLstFacade.currentComponentsRem(entry.getListEntryId());
    	}
    	
  	}
  	public ComponentLst_CurrentComponentsProxi copy(ComponentLst owner) throws PersistenceException {
  		ComponentLst_CurrentComponentsProxi result = new ComponentLst_CurrentComponentsProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<Component4Public> entries = (this.list == null ? new java.util.Vector<Component4Public>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			Component4Public current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theComponentLstFacade
            	           .currentComponentsAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
