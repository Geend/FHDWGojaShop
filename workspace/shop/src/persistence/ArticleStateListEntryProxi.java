package persistence;

public abstract class ArticleStateListEntryProxi extends ArticleStateProxi implements PersistentArticleStateListEntryProxi {

  long entryId;

  public ArticleStateListEntryProxi(long objectId, long entryId) {
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