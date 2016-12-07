package persistence;

public class ComponentContainerImplementationComponentsListEntryProxi extends ComponentContainerImplementationComponentsProxi implements PersistentComponentContainerImplementationComponentsListEntryProxi {

  long entryId;

  public ComponentContainerImplementationComponentsListEntryProxi(long objectId, long entryId) {
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