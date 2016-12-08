package persistence;

public class NewCreatedListEntryProxi extends NewCreatedProxi implements PersistentNewCreatedListEntryProxi {

  long entryId;

  public NewCreatedListEntryProxi(long objectId, long entryId) {
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