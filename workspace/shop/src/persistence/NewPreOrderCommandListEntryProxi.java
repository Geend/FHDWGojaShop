package persistence;

public class NewPreOrderCommandListEntryProxi extends NewPreOrderCommandProxi implements PersistentNewPreOrderCommandListEntryProxi {

  long entryId;

  public NewPreOrderCommandListEntryProxi(long objectId, long entryId) {
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