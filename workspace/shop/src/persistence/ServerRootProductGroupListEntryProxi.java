package persistence;

public class ServerRootProductGroupListEntryProxi extends ServerRootProductGroupProxi implements PersistentServerRootProductGroupListEntryProxi {

  long entryId;

  public ServerRootProductGroupListEntryProxi(long objectId, long entryId) {
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