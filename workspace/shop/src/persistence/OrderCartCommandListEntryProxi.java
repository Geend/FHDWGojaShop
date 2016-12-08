package persistence;

public class OrderCartCommandListEntryProxi extends OrderCartCommandProxi implements PersistentOrderCartCommandListEntryProxi {

  long entryId;

  public OrderCartCommandListEntryProxi(long objectId, long entryId) {
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