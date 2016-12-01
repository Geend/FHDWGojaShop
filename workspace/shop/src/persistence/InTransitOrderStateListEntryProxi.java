package persistence;

public class InTransitOrderStateListEntryProxi extends InTransitOrderStateProxi implements PersistentInTransitOrderStateListEntryProxi {

  long entryId;

  public InTransitOrderStateListEntryProxi(long objectId, long entryId) {
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