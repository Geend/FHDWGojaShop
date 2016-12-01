package persistence;

public class OwnerOrderManagerListEntryProxi extends OwnerOrderManagerProxi implements PersistentOwnerOrderManagerListEntryProxi {

  long entryId;

  public OwnerOrderManagerListEntryProxi(long objectId, long entryId) {
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