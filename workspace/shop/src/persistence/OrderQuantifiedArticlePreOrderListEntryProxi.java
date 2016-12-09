package persistence;

public class OrderQuantifiedArticlePreOrderListEntryProxi extends OrderQuantifiedArticlePreOrderProxi implements PersistentOrderQuantifiedArticlePreOrderListEntryProxi {

  long entryId;

  public OrderQuantifiedArticlePreOrderListEntryProxi(long objectId, long entryId) {
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