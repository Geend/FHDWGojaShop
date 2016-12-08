package persistence;

public class ArticleListEntryProxi extends ArticleProxi implements PersistentArticleListEntryProxi {

  long entryId;

  public ArticleListEntryProxi(long objectId, long entryId) {
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