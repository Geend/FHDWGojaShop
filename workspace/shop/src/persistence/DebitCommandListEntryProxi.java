package persistence;

public class DebitCommandListEntryProxi extends DebitCommandProxi implements PersistentDebitCommandListEntryProxi {

  long entryId;

  public DebitCommandListEntryProxi(long objectId, long entryId) {
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