package persistence;

public class ShoppingCartArticleWrapperListEntryProxi extends ShoppingCartArticleWrapperProxi implements PersistentShoppingCartArticleWrapperListEntryProxi {

  long entryId;

  public ShoppingCartArticleWrapperListEntryProxi(long objectId, long entryId) {
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