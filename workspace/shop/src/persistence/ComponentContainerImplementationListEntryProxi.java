package persistence;

public class ComponentContainerImplementationListEntryProxi extends ComponentContainerImplementationProxi implements PersistentComponentContainerImplementationListEntryProxi {

  long entryId;

  public ComponentContainerImplementationListEntryProxi(long objectId, long entryId) {
    super(objectId);
    this.entryId = entryId;
  }
	
  public long getListEntryId() {
    return this.entryId;
  }
  public void setListEntryId(long id){
	this.entryId = id;  
  }

}