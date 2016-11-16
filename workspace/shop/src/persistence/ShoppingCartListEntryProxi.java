package persistence;

public class ShoppingCartListEntryProxi extends ShoppingCartProxi implements PersistentShoppingCartListEntryProxi {

  long entryId;

  public ShoppingCartListEntryProxi(long objectId, long entryId) {
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