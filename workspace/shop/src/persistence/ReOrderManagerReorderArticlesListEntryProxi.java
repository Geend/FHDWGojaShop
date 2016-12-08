package persistence;

public class ReOrderManagerReorderArticlesListEntryProxi extends ReOrderManagerReorderArticlesProxi implements PersistentReOrderManagerReorderArticlesListEntryProxi {

  long entryId;

  public ReOrderManagerReorderArticlesListEntryProxi(long objectId, long entryId) {
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