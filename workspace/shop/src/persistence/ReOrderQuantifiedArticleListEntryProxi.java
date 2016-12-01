package persistence;

public class ReOrderQuantifiedArticleListEntryProxi extends ReOrderQuantifiedArticleProxi implements PersistentReOrderQuantifiedArticleListEntryProxi {

  long entryId;

  public ReOrderQuantifiedArticleListEntryProxi(long objectId, long entryId) {
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