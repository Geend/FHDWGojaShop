package persistence;

public class ChangeCustomerDeliveryTimeTimeCommandListEntryProxi extends ChangeCustomerDeliveryTimeTimeCommandProxi implements PersistentChangeCustomerDeliveryTimeTimeCommandListEntryProxi {

  long entryId;

  public ChangeCustomerDeliveryTimeTimeCommandListEntryProxi(long objectId, long entryId) {
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