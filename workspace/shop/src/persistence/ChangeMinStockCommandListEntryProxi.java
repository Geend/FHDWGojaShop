package persistence;

public class ChangeMinStockCommandListEntryProxi extends ChangeMinStockCommandProxi implements PersistentChangeMinStockCommandListEntryProxi {

  long entryId;

  public ChangeMinStockCommandListEntryProxi(long objectId, long entryId) {
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