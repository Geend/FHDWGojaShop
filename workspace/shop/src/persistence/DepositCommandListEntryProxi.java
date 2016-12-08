package persistence;

public class DepositCommandListEntryProxi extends DepositCommandProxi implements PersistentDepositCommandListEntryProxi {

  long entryId;

  public DepositCommandListEntryProxi(long objectId, long entryId) {
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