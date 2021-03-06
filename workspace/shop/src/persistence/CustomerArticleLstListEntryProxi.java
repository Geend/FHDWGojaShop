package persistence;

public class CustomerArticleLstListEntryProxi extends CustomerArticleLstProxi implements PersistentCustomerArticleLstListEntryProxi {

  long entryId;

  public CustomerArticleLstListEntryProxi(long objectId, long entryId) {
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