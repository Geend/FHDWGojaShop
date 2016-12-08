package persistence;

public abstract class QuantifiedArticleListEntryProxi extends QuantifiedArticleProxi implements PersistentQuantifiedArticleListEntryProxi {

  long entryId;

  public QuantifiedArticleListEntryProxi(long objectId, long entryId) {
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