package persistence;

public class CustomerServiceShopListEntryProxi extends CustomerServiceShopProxi implements PersistentCustomerServiceShopListEntryProxi {

  long entryId;

  public CustomerServiceShopListEntryProxi(long objectId, long entryId) {
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