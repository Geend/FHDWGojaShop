package persistence;

public class CustomerServiceComponentManagerListEntryProxi extends CustomerServiceComponentManagerProxi implements PersistentCustomerServiceComponentManagerListEntryProxi {

  long entryId;

  public CustomerServiceComponentManagerListEntryProxi(long objectId, long entryId) {
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