package persistence;

public class AcceptOrderCommandListEntryProxi extends AcceptOrderCommandProxi implements PersistentAcceptOrderCommandListEntryProxi {

  long entryId;

  public AcceptOrderCommandListEntryProxi(long objectId, long entryId) {
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