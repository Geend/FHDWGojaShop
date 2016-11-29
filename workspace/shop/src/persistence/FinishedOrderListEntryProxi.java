package persistence;

public class FinishedOrderListEntryProxi extends FinishedOrderProxi implements PersistentFinishedOrderListEntryProxi {

  long entryId;

  public FinishedOrderListEntryProxi(long objectId, long entryId) {
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