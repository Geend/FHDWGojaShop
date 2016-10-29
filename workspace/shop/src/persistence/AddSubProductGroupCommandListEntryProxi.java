package persistence;

public class AddSubProductGroupCommandListEntryProxi extends AddSubProductGroupCommandProxi implements PersistentAddSubProductGroupCommandListEntryProxi {

  long entryId;

  public AddSubProductGroupCommandListEntryProxi(long objectId, long entryId) {
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