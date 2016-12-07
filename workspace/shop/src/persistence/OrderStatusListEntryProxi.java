package persistence;

public abstract class OrderStatusListEntryProxi extends OrderStatusProxi implements PersistentOrderStatusListEntryProxi {

  long entryId;

  public OrderStatusListEntryProxi(long objectId, long entryId) {
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