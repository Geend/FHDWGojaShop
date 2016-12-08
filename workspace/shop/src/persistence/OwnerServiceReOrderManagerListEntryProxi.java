package persistence;

public class OwnerServiceReOrderManagerListEntryProxi extends OwnerServiceReOrderManagerProxi implements PersistentOwnerServiceReOrderManagerListEntryProxi {

  long entryId;

  public OwnerServiceReOrderManagerListEntryProxi(long objectId, long entryId) {
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