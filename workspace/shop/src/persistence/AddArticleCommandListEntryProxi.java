package persistence;

public class AddArticleCommandListEntryProxi extends AddArticleCommandProxi implements PersistentAddArticleCommandListEntryProxi {

  long entryId;

  public AddArticleCommandListEntryProxi(long objectId, long entryId) {
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