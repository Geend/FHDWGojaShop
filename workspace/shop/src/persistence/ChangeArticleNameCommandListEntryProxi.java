package persistence;

public class ChangeArticleNameCommandListEntryProxi extends ChangeArticleNameCommandProxi implements PersistentChangeArticleNameCommandListEntryProxi {

  long entryId;

  public ChangeArticleNameCommandListEntryProxi(long objectId, long entryId) {
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