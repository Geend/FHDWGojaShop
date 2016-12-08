package persistence;

public class WithdrawCommandListEntryProxi extends WithdrawCommandProxi implements PersistentWithdrawCommandListEntryProxi {

  long entryId;

  public WithdrawCommandListEntryProxi(long objectId, long entryId) {
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