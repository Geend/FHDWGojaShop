package persistence;

public class OwnerServiceShopListEntryProxi extends OwnerServiceShopProxi implements PersistentOwnerServiceShopListEntryProxi {

  long entryId;

  public OwnerServiceShopListEntryProxi(long objectId, long entryId) {
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