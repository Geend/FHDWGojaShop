package persistence;

public abstract class ComponentWrapperListEntryProxi extends ComponentWrapperProxi implements PersistentComponentWrapperListEntryProxi {

  long entryId;

  public ComponentWrapperListEntryProxi(long objectId, long entryId) {
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