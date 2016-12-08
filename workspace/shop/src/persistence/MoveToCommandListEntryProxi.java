package persistence;

public class MoveToCommandListEntryProxi extends MoveToCommandProxi implements PersistentMoveToCommandListEntryProxi {

  long entryId;

  public MoveToCommandListEntryProxi(long objectId, long entryId) {
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