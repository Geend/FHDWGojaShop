package persistence;

public class CustomerOrderManagerListEntryProxi extends CustomerOrderManagerProxi implements PersistentCustomerOrderManagerListEntryProxi {

  long entryId;

  public CustomerOrderManagerListEntryProxi(long objectId, long entryId) {
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