package persistence;

public class CustomerServiceRootProductGroupListEntryProxi extends CustomerServiceRootProductGroupProxi implements PersistentCustomerServiceRootProductGroupListEntryProxi {

  long entryId;

  public CustomerServiceRootProductGroupListEntryProxi(long objectId, long entryId) {
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