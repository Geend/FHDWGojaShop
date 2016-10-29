package persistence;

public class ProducerLstListEntryProxi extends ProducerLstProxi implements PersistentProducerLstListEntryProxi {

  long entryId;

  public ProducerLstListEntryProxi(long objectId, long entryId) {
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