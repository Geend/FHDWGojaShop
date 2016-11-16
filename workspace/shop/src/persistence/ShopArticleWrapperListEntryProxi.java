package persistence;

public class ShopArticleWrapperListEntryProxi extends ShopArticleWrapperProxi implements PersistentShopArticleWrapperListEntryProxi {

  long entryId;

  public ShopArticleWrapperListEntryProxi(long objectId, long entryId) {
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