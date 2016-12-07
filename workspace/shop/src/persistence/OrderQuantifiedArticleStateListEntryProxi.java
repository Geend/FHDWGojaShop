package persistence;

public abstract class OrderQuantifiedArticleStateListEntryProxi extends OrderQuantifiedArticleStateProxi implements PersistentOrderQuantifiedArticleStateListEntryProxi {

  long entryId;

  public OrderQuantifiedArticleStateListEntryProxi(long objectId, long entryId) {
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