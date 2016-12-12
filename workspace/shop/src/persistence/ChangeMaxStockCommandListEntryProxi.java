package persistence;

public class ChangeMaxStockCommandListEntryProxi extends ChangeMaxStockCommandProxi implements PersistentChangeMaxStockCommandListEntryProxi {

  long entryId;

  public ChangeMaxStockCommandListEntryProxi(long objectId, long entryId) {
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