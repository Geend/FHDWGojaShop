package persistence;

public class CreateProducerCommandListEntryProxi extends CreateProducerCommandProxi implements PersistentCreateProducerCommandListEntryProxi {

  long entryId;

  public CreateProducerCommandListEntryProxi(long objectId, long entryId) {
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