package persistence;

public class OrderQuantifiedArticleMarkedForReturnStateListEntryProxi extends OrderQuantifiedArticleMarkedForReturnStateProxi implements PersistentOrderQuantifiedArticleMarkedForReturnStateListEntryProxi {

  long entryId;

  public OrderQuantifiedArticleMarkedForReturnStateListEntryProxi(long objectId, long entryId) {
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