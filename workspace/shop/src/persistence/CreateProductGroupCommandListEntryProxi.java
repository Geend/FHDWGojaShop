package persistence;

public class CreateProductGroupCommandListEntryProxi extends CreateProductGroupCommandProxi implements PersistentCreateProductGroupCommandListEntryProxi {

  long entryId;

  public CreateProductGroupCommandListEntryProxi(long objectId, long entryId) {
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