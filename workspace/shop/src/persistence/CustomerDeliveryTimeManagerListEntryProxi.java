package persistence;

public class CustomerDeliveryTimeManagerListEntryProxi extends CustomerDeliveryTimeManagerProxi implements PersistentCustomerDeliveryTimeManagerListEntryProxi {

  long entryId;

  public CustomerDeliveryTimeManagerListEntryProxi(long objectId, long entryId) {
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