package persistence;

import model.*;

public class SettingsFacade{

	static private Long sequencer = new Long(0);

	static protected long getTheNextId(){
		long result = -1;
		synchronized (sequencer) { 
			result = sequencer.longValue() + 1;
			sequencer = new Long(result);
		}
		return result;
	}

	protected long getNextId(){
		return getTheNextId();
	}

	

	public SettingsFacade() {
	}

    public PersistentSettings getTheSettings() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theSettingsFacade.getNextId();
        Settings result = new Settings(common.Fraction.Null, common.Fraction.Null, common.Fraction.Null, null, null, id);
        PersistentInCacheProxi cached = Cache.getTheCache().putSingleton(result);
        return (PersistentSettings)PersistentProxi.createProxi(cached.getId()  * (cached.getTheObject().isTheSameAs(result) ? -1 : 1), 318);
    }
    
    public Settings getSettings(long SettingsId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 318)) return 318;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void newCustomerDefaultBalanceSet(long SettingsId, common.Fraction newCustomerDefaultBalanceVal) throws PersistenceException {
        
    }
    public void newCustomerDefaultLimitSet(long SettingsId, common.Fraction newCustomerDefaultLimitVal) throws PersistenceException {
        
    }
    public void returnPercentageSet(long SettingsId, common.Fraction returnPercentageVal) throws PersistenceException {
        
    }
    public void subServiceSet(long SettingsId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long SettingsId, Settings4Public ThisVal) throws PersistenceException {
        
    }

}

