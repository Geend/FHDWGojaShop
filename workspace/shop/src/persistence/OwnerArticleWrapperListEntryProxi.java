package persistence;

public class OwnerArticleWrapperListEntryProxi extends OwnerArticleWrapperProxi implements PersistentOwnerArticleWrapperListEntryProxi {

  long entryId;

  public OwnerArticleWrapperListEntryProxi(long objectId, long entryId) {
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