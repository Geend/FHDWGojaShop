package persistence;

public class CustomerRegisterServiceListEntryProxi extends CustomerRegisterServiceProxi implements PersistentCustomerRegisterServiceListEntryProxi {

  long entryId;

  public CustomerRegisterServiceListEntryProxi(long objectId, long entryId) {
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