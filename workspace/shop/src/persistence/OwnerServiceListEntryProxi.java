package persistence;

public class OwnerServiceListEntryProxi extends OwnerServiceProxi implements PersistentOwnerServiceListEntryProxi {

  long entryId;

  public OwnerServiceListEntryProxi(long objectId, long entryId) {
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