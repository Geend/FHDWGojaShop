package persistence;

public class RootProductGroupListEntryProxi extends RootProductGroupProxi implements PersistentRootProductGroupListEntryProxi {

  long entryId;

  public RootProductGroupListEntryProxi(long objectId, long entryId) {
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