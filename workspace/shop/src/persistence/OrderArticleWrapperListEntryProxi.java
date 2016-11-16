package persistence;

public class OrderArticleWrapperListEntryProxi extends OrderArticleWrapperProxi implements PersistentOrderArticleWrapperListEntryProxi {

  long entryId;

  public OrderArticleWrapperListEntryProxi(long objectId, long entryId) {
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