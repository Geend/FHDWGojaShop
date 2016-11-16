package persistence;

public class DefaultProductGroupWrapperListEntryProxi extends DefaultProductGroupWrapperProxi implements PersistentDefaultProductGroupWrapperListEntryProxi {

  long entryId;

  public DefaultProductGroupWrapperListEntryProxi(long objectId, long entryId) {
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