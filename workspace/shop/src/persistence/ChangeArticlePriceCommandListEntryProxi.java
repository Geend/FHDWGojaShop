package persistence;

public class ChangeArticlePriceCommandListEntryProxi extends ChangeArticlePriceCommandProxi implements PersistentChangeArticlePriceCommandListEntryProxi {

  long entryId;

  public ChangeArticlePriceCommandListEntryProxi(long objectId, long entryId) {
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