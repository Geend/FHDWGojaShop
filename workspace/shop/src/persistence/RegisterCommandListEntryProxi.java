package persistence;

public class RegisterCommandListEntryProxi extends RegisterCommandProxi implements PersistentRegisterCommandListEntryProxi {

  long entryId;

  public RegisterCommandListEntryProxi(long objectId, long entryId) {
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