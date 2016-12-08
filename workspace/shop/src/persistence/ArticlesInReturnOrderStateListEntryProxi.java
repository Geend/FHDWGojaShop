package persistence;

public class ArticlesInReturnOrderStateListEntryProxi extends ArticlesInReturnOrderStateProxi implements PersistentArticlesInReturnOrderStateListEntryProxi {

  long entryId;

  public ArticlesInReturnOrderStateListEntryProxi(long objectId, long entryId) {
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