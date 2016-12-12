package persistence;

public class CanceledOrderStateListEntryProxi extends CanceledOrderStateProxi implements PersistentCanceledOrderStateListEntryProxi {

  long entryId;

  public CanceledOrderStateListEntryProxi(long objectId, long entryId) {
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