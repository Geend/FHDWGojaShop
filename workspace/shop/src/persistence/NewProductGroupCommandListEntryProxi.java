package persistence;

public class NewProductGroupCommandListEntryProxi extends NewProductGroupCommandProxi implements PersistentNewProductGroupCommandListEntryProxi {

  long entryId;

  public NewProductGroupCommandListEntryProxi(long objectId, long entryId) {
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