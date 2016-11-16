package persistence;

public class IncreaseStockCommandListEntryProxi extends IncreaseStockCommandProxi implements PersistentIncreaseStockCommandListEntryProxi {

  long entryId;

  public IncreaseStockCommandListEntryProxi(long objectId, long entryId) {
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