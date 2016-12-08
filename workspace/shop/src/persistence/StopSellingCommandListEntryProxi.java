package persistence;

public class StopSellingCommandListEntryProxi extends StopSellingCommandProxi implements PersistentStopSellingCommandListEntryProxi {

  long entryId;

  public StopSellingCommandListEntryProxi(long objectId, long entryId) {
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