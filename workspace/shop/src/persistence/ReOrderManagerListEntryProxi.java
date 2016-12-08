package persistence;

public class ReOrderManagerListEntryProxi extends ReOrderManagerProxi implements PersistentReOrderManagerListEntryProxi {

  long entryId;

  public ReOrderManagerListEntryProxi(long objectId, long entryId) {
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