package persistence;

public class ChangeCustomerDeliveryTimePriceCommandListEntryProxi extends ChangeCustomerDeliveryTimePriceCommandProxi implements PersistentChangeCustomerDeliveryTimePriceCommandListEntryProxi {

  long entryId;

  public ChangeCustomerDeliveryTimePriceCommandListEntryProxi(long objectId, long entryId) {
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