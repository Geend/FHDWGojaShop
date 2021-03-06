package persistence;

import model.*;

import java.util.Iterator;

public class ComponentContainerImplementation_ComponentsProxi extends PersistentListProxi<Component4Public> {

  	private ComponentList list;
  	private ComponentContainerImplementation owner;

  	public ComponentContainerImplementation_ComponentsProxi(ComponentContainerImplementation owner) {
    	this.owner = owner;
  	}
  	public ComponentList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new ComponentList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theComponentContainerImplementationFacade.componentsGet(this.owner.getId());
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
  	public void add(Component4Public entry) throws PersistenceException , model.CycleException{
    	if (entry != null) {
      		if (entry.containsCompHierarchy(this.owner)) throw new model.CycleException("Cycle in CompHierarchy detected!");
			ComponentList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade
        	               	.componentsAdd(owner.getId(), entry);
      		}
      		list.add((Component4Public)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade.componentsRem(entry.getListEntryId());
    	}
    	
  	}
  	public ComponentContainerImplementation_ComponentsProxi copy(ComponentContainerImplementation owner) throws PersistenceException {
  		ComponentContainerImplementation_ComponentsProxi result = new ComponentContainerImplementation_ComponentsProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<Component4Public> entries = (this.list == null ? new java.util.Vector<Component4Public>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			Component4Public current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade
            	           .componentsAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
