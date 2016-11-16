package persistence;

public class CustomerShopArticleWrapperListEntryProxi extends CustomerShopArticleWrapperProxi implements PersistentCustomerShopArticleWrapperListEntryProxi {

  long entryId;

  public CustomerShopArticleWrapperListEntryProxi(long objectId, long entryId) {
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