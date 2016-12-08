package persistence;

public class GlobalOrderManagerListEntryProxi extends GlobalOrderManagerProxi implements PersistentGlobalOrderManagerListEntryProxi {

  long entryId;

  public GlobalOrderManagerListEntryProxi(long objectId, long entryId) {
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