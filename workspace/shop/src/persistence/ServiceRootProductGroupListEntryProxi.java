package persistence;

public class ServiceRootProductGroupListEntryProxi extends ServiceRootProductGroupProxi implements PersistentServiceRootProductGroupListEntryProxi {

  long entryId;

  public ServiceRootProductGroupListEntryProxi(long objectId, long entryId) {
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