package persistence;

public class NewOrderCommandListEntryProxi extends NewOrderCommandProxi implements PersistentNewOrderCommandListEntryProxi {

  long entryId;

  public NewOrderCommandListEntryProxi(long objectId, long entryId) {
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