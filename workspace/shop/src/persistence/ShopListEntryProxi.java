package persistence;

public class ShopListEntryProxi extends ShopProxi implements PersistentShopListEntryProxi {

  long entryId;

  public ShopListEntryProxi(long objectId, long entryId) {
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