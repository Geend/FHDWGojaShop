package persistence;

public class WaitingForAcceptOrderStateListEntryProxi extends WaitingForAcceptOrderStateProxi implements PersistentWaitingForAcceptOrderStateListEntryProxi {

  long entryId;

  public WaitingForAcceptOrderStateListEntryProxi(long objectId, long entryId) {
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