package persistence;

public class FinishedOrderStateListEntryProxi extends FinishedOrderStateProxi implements PersistentFinishedOrderStateListEntryProxi {

  long entryId;

  public FinishedOrderStateListEntryProxi(long objectId, long entryId) {
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