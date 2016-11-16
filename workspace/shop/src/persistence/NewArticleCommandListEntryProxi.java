package persistence;

public class NewArticleCommandListEntryProxi extends NewArticleCommandProxi implements PersistentNewArticleCommandListEntryProxi {

  long entryId;

  public NewArticleCommandListEntryProxi(long objectId, long entryId) {
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