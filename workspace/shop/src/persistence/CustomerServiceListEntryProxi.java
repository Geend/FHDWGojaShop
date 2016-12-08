package persistence;

public class CustomerServiceListEntryProxi extends CustomerServiceProxi implements PersistentCustomerServiceListEntryProxi {

  long entryId;

  public CustomerServiceListEntryProxi(long objectId, long entryId) {
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