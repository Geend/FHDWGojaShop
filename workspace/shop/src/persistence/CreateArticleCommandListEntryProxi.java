package persistence;

public class CreateArticleCommandListEntryProxi extends CreateArticleCommandProxi implements PersistentCreateArticleCommandListEntryProxi {

  long entryId;

  public CreateArticleCommandListEntryProxi(long objectId, long entryId) {
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