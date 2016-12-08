package persistence;

public class RemoveArticleCommandListEntryProxi extends RemoveArticleCommandProxi implements PersistentRemoveArticleCommandListEntryProxi {

  long entryId;

  public RemoveArticleCommandListEntryProxi(long objectId, long entryId) {
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