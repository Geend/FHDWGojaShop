package persistence;

public class ChangeArticleQuantityCommandListEntryProxi extends ChangeArticleQuantityCommandProxi implements PersistentChangeArticleQuantityCommandListEntryProxi {

  long entryId;

  public ChangeArticleQuantityCommandListEntryProxi(long objectId, long entryId) {
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