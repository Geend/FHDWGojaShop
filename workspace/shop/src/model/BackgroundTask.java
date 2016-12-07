
package model;

import persistence.*;


/* Additional import section end */

public abstract class BackgroundTask extends PersistentObject implements PersistentBackgroundTask{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static BackgroundTask4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theBackgroundTaskFacade.getClass(objectId);
        return (BackgroundTask4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public abstract BackgroundTask provideCopy() throws PersistenceException;
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected SubjInterface subService;
    protected PersistentBackgroundTask This;
    
    public BackgroundTask(SubjInterface subService,PersistentBackgroundTask This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 364;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        super.store();
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theBackgroundTaskFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theBackgroundTaskFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public SubjInterface getSubService() throws PersistenceException {
        return this.subService;
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.subService)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.subService = (SubjInterface)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theBackgroundTaskFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentBackgroundTask newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentBackgroundTask)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theBackgroundTaskFacade.ThisSet(this.getId(), newValue);
        }
    }
    public abstract PersistentBackgroundTask getThis() throws PersistenceException ;
    
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentBackgroundTask)This);
		if(this.isTheSameAs(This)){
		}
    }
    public void step() 
				throws PersistenceException{
        model.meta.BackgroundTaskStepMssg event = new model.meta.BackgroundTaskStepMssg(getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    
    
    // Start of section that contains overridden operations only.
    
    public void startTask(final long tickTime) 
				throws PersistenceException{
        continueTransits = true;

        Thread backgroundThread = new Thread(() -> {
            try {
                while (continueTransits) {
                    step();
                    Thread.sleep(tickTime);
                }

            } catch (PersistenceException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        backgroundThread.start();
    }
    public void stopTask() 
				throws PersistenceException{
        continueTransits = false;
    }

    /* Start of protected part that is not overridden by persistence generator */
    private Boolean continueTransits;

    /* End of protected part that is not overridden by persistence generator */
    
}
