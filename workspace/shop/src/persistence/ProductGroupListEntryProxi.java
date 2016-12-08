package persistence;

public class ProductGroupListEntryProxi extends ProductGroupProxi implements PersistentProductGroupListEntryProxi {

  long entryId;

  public ProductGroupListEntryProxi(long objectId, long entryId) {
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