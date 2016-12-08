package persistence;

public class ArticleReturnListEntryProxi extends ArticleReturnProxi implements PersistentArticleReturnListEntryProxi {

  long entryId;

  public ArticleReturnListEntryProxi(long objectId, long entryId) {
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