package persistence;

public class PreOrderStateListEntryProxi extends PreOrderStateProxi implements PersistentPreOrderStateListEntryProxi {

  long entryId;

  public PreOrderStateListEntryProxi(long objectId, long entryId) {
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