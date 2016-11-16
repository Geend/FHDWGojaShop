package persistence;

public class ReduceStockCommandListEntryProxi extends ReduceStockCommandProxi implements PersistentReduceStockCommandListEntryProxi {

  long entryId;

  public ReduceStockCommandListEntryProxi(long objectId, long entryId) {
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