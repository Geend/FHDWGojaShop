package persistence;

public class ProcessingOrderStateListEntryProxi extends ProcessingOrderStateProxi implements PersistentProcessingOrderStateListEntryProxi {

  long entryId;

  public ProcessingOrderStateListEntryProxi(long objectId, long entryId) {
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