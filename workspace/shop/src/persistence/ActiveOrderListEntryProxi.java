package persistence;

public class ActiveOrderListEntryProxi extends ActiveOrderProxi implements PersistentActiveOrderListEntryProxi {

  long entryId;

  public ActiveOrderListEntryProxi(long objectId, long entryId) {
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