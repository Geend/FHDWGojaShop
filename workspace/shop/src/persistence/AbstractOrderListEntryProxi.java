package persistence;

public abstract class AbstractOrderListEntryProxi extends AbstractOrderProxi implements PersistentAbstractOrderListEntryProxi {

  long entryId;

  public AbstractOrderListEntryProxi(long objectId, long entryId) {
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