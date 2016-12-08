package persistence;

public class ReturnManagerListEntryProxi extends ReturnManagerProxi implements PersistentReturnManagerListEntryProxi {

  long entryId;

  public ReturnManagerListEntryProxi(long objectId, long entryId) {
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