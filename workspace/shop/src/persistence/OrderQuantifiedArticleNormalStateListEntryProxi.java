package persistence;

public class OrderQuantifiedArticleNormalStateListEntryProxi extends OrderQuantifiedArticleNormalStateProxi implements PersistentOrderQuantifiedArticleNormalStateListEntryProxi {

  long entryId;

  public OrderQuantifiedArticleNormalStateListEntryProxi(long objectId, long entryId) {
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