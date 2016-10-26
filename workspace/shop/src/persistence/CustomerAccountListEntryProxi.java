package persistence;

public class CustomerAccountListEntryProxi extends CustomerAccountProxi implements PersistentCustomerAccountListEntryProxi {

  long entryId;

  public CustomerAccountListEntryProxi(long objectId, long entryId) {
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