package persistence;

public class ChangePriceCommandListEntryProxi extends ChangePriceCommandProxi implements PersistentChangePriceCommandListEntryProxi {

  long entryId;

  public ChangePriceCommandListEntryProxi(long objectId, long entryId) {
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