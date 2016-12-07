package persistence;

public class OrderManagerOrdersListEntryProxi extends OrderManagerOrdersProxi implements PersistentOrderManagerOrdersListEntryProxi {

  long entryId;

  public OrderManagerOrdersListEntryProxi(long objectId, long entryId) {
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