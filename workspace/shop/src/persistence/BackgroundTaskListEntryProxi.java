package persistence;

public abstract class BackgroundTaskListEntryProxi extends BackgroundTaskProxi implements PersistentBackgroundTaskListEntryProxi {

  long entryId;

  public BackgroundTaskListEntryProxi(long objectId, long entryId) {
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