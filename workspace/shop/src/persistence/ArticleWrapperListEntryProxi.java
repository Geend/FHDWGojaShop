package persistence;

public class ArticleWrapperListEntryProxi extends ArticleWrapperProxi implements PersistentArticleWrapperListEntryProxi {

  long entryId;

  public ArticleWrapperListEntryProxi(long objectId, long entryId) {
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