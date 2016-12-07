package persistence;

public class CONCBackgroundTaskListEntryProxi extends CONCBackgroundTaskProxi implements PersistentCONCBackgroundTaskListEntryProxi {

  long entryId;

  public CONCBackgroundTaskListEntryProxi(long objectId, long entryId) {
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