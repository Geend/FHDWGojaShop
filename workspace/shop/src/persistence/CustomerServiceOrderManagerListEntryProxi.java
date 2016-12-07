package persistence;

public class CustomerServiceOrderManagerListEntryProxi extends CustomerServiceOrderManagerProxi implements PersistentCustomerServiceOrderManagerListEntryProxi {

  long entryId;

  public CustomerServiceOrderManagerListEntryProxi(long objectId, long entryId) {
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