package persistence;

public abstract class OrderManagerListEntryProxi extends OrderManagerProxi implements PersistentOrderManagerListEntryProxi {

  long entryId;

  public OrderManagerListEntryProxi(long objectId, long entryId) {
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