package persistence;

public abstract class ProductGroupWrapperListEntryProxi extends ProductGroupWrapperProxi implements PersistentProductGroupWrapperListEntryProxi {

  long entryId;

  public ProductGroupWrapperListEntryProxi(long objectId, long entryId) {
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