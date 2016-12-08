package persistence;

public class SettingsListEntryProxi extends SettingsProxi implements PersistentSettingsListEntryProxi {

  long entryId;

  public SettingsListEntryProxi(long objectId, long entryId) {
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