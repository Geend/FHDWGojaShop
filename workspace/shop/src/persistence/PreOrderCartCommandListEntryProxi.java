package persistence;

public class PreOrderCartCommandListEntryProxi extends PreOrderCartCommandProxi implements PersistentPreOrderCartCommandListEntryProxi {

  long entryId;

  public PreOrderCartCommandListEntryProxi(long objectId, long entryId) {
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