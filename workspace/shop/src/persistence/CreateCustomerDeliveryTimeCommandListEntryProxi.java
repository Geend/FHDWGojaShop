package persistence;

public class CreateCustomerDeliveryTimeCommandListEntryProxi extends CreateCustomerDeliveryTimeCommandProxi implements PersistentCreateCustomerDeliveryTimeCommandListEntryProxi {

  long entryId;

  public CreateCustomerDeliveryTimeCommandListEntryProxi(long objectId, long entryId) {
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