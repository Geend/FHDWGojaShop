package persistence;

public class BackgroundTaskManagerListEntryProxi extends BackgroundTaskManagerProxi implements PersistentBackgroundTaskManagerListEntryProxi {

  long entryId;

  public BackgroundTaskManagerListEntryProxi(long objectId, long entryId) {
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