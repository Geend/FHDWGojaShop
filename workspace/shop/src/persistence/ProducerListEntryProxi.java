package persistence;

public class ProducerListEntryProxi extends ProducerProxi implements PersistentProducerListEntryProxi {

  long entryId;

  public ProducerListEntryProxi(long objectId, long entryId) {
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