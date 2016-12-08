package persistence;

public class CustomerDeliveryTimeListEntryProxi extends CustomerDeliveryTimeProxi implements PersistentCustomerDeliveryTimeListEntryProxi {

  long entryId;

  public CustomerDeliveryTimeListEntryProxi(long objectId, long entryId) {
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