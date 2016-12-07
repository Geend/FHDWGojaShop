package persistence;

import model.*;

import java.util.Iterator;

public class BackgroundTaskManager_TasksProxi extends PersistentListProxi<BackgroundTask4Public> {

  	private BackgroundTaskList list;
  	private BackgroundTaskManager owner;

  	public BackgroundTaskManager_TasksProxi(BackgroundTaskManager owner) {
    	this.owner = owner;
  	}
  	public BackgroundTaskList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new BackgroundTaskList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theBackgroundTaskManagerFacade.tasksGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<BackgroundTask4Public> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(BackgroundTask4Public entry) throws PersistenceException {
    	if (entry != null) {
      		BackgroundTaskList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theBackgroundTaskManagerFacade
        	               	.tasksAdd(owner.getId(), entry);
      		}
      		list.add((BackgroundTask4Public)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theBackgroundTaskManagerFacade.tasksRem(entry.getListEntryId());
    	}
    	
  	}
  	public BackgroundTaskManager_TasksProxi copy(BackgroundTaskManager owner) throws PersistenceException {
  		BackgroundTaskManager_TasksProxi result = new BackgroundTaskManager_TasksProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<BackgroundTask4Public> entries = (this.list == null ? new java.util.Vector<BackgroundTask4Public>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			BackgroundTask4Public current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theBackgroundTaskManagerFacade
            	           .tasksAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
