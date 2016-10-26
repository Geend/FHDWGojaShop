package persistence;

public class ShoppingCartQuantifiedArticleListEntryProxi extends ShoppingCartQuantifiedArticleProxi implements PersistentShoppingCartQuantifiedArticleListEntryProxi {

  long entryId;

  public ShoppingCartQuantifiedArticleListEntryProxi(long objectId, long entryId) {
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