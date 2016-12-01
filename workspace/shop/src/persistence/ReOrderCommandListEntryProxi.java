package persistence;

public class ReOrderCommandListEntryProxi extends ReOrderCommandProxi implements PersistentReOrderCommandListEntryProxi {

  long entryId;

  public ReOrderCommandListEntryProxi(long objectId, long entryId) {
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