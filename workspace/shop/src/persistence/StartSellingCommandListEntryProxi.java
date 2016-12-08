package persistence;

public class StartSellingCommandListEntryProxi extends StartSellingCommandProxi implements PersistentStartSellingCommandListEntryProxi {

  long entryId;

  public StartSellingCommandListEntryProxi(long objectId, long entryId) {
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