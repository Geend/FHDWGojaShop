package persistence;

public abstract class OrderStateListEntryProxi extends OrderStateProxi implements PersistentOrderStateListEntryProxi {

  long entryId;

  public OrderStateListEntryProxi(long objectId, long entryId) {
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