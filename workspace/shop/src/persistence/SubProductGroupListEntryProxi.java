package persistence;

public class SubProductGroupListEntryProxi extends SubProductGroupProxi implements PersistentSubProductGroupListEntryProxi {

  long entryId;

  public SubProductGroupListEntryProxi(long objectId, long entryId) {
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