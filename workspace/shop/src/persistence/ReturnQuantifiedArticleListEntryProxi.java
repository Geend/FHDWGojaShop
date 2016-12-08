package persistence;

public class ReturnQuantifiedArticleListEntryProxi extends ReturnQuantifiedArticleProxi implements PersistentReturnQuantifiedArticleListEntryProxi {

  long entryId;

  public ReturnQuantifiedArticleListEntryProxi(long objectId, long entryId) {
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