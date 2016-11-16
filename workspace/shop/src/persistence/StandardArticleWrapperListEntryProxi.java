package persistence;

public class StandardArticleWrapperListEntryProxi extends StandardArticleWrapperProxi implements PersistentStandardArticleWrapperListEntryProxi {

  long entryId;

  public StandardArticleWrapperListEntryProxi(long objectId, long entryId) {
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