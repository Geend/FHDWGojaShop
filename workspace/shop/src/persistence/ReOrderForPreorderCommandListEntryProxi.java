package persistence;

public class ReOrderForPreorderCommandListEntryProxi extends ReOrderForPreorderCommandProxi implements PersistentReOrderForPreorderCommandListEntryProxi {

  long entryId;

  public ReOrderForPreorderCommandListEntryProxi(long objectId, long entryId) {
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