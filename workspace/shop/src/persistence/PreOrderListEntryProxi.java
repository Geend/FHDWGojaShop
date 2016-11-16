package persistence;

public class PreOrderListEntryProxi extends PreOrderProxi implements PersistentPreOrderListEntryProxi {

  long entryId;

  public PreOrderListEntryProxi(long objectId, long entryId) {
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