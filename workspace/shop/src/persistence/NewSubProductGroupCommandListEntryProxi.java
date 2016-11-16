package persistence;

public class NewSubProductGroupCommandListEntryProxi extends NewSubProductGroupCommandProxi implements PersistentNewSubProductGroupCommandListEntryProxi {

  long entryId;

  public NewSubProductGroupCommandListEntryProxi(long objectId, long entryId) {
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