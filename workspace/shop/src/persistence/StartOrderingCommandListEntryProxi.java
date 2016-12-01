package persistence;

public class StartOrderingCommandListEntryProxi extends StartOrderingCommandProxi implements PersistentStartOrderingCommandListEntryProxi {

  long entryId;

  public StartOrderingCommandListEntryProxi(long objectId, long entryId) {
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