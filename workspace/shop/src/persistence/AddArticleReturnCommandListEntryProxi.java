package persistence;

public class AddArticleReturnCommandListEntryProxi extends AddArticleReturnCommandProxi implements PersistentAddArticleReturnCommandListEntryProxi {

  long entryId;

  public AddArticleReturnCommandListEntryProxi(long objectId, long entryId) {
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