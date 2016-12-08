package persistence;

public class OwnerServiceOrderManagerListEntryProxi extends OwnerServiceOrderManagerProxi implements PersistentOwnerServiceOrderManagerListEntryProxi {

  long entryId;

  public OwnerServiceOrderManagerListEntryProxi(long objectId, long entryId) {
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