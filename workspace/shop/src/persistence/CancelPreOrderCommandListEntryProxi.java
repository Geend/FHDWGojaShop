package persistence;

public class CancelPreOrderCommandListEntryProxi extends CancelPreOrderCommandProxi implements PersistentCancelPreOrderCommandListEntryProxi {

  long entryId;

  public CancelPreOrderCommandListEntryProxi(long objectId, long entryId) {
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