package persistence;

public class InSaleListEntryProxi extends InSaleProxi implements PersistentInSaleListEntryProxi {

  long entryId;

  public InSaleListEntryProxi(long objectId, long entryId) {
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