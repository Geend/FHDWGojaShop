package persistence;

public class ComponentManagerListEntryProxi extends ComponentManagerProxi implements PersistentComponentManagerListEntryProxi {

  long entryId;

  public ComponentManagerListEntryProxi(long objectId, long entryId) {
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