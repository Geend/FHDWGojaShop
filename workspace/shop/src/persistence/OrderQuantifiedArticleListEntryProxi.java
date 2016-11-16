package persistence;

public class OrderQuantifiedArticleListEntryProxi extends OrderQuantifiedArticleProxi implements PersistentOrderQuantifiedArticleListEntryProxi {

  long entryId;

  public OrderQuantifiedArticleListEntryProxi(long objectId, long entryId) {
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