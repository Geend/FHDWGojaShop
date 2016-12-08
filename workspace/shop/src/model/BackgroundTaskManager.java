
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class BackgroundTaskManager extends PersistentObject implements PersistentBackgroundTaskManager{
    
    private static BackgroundTaskManager4Public theBackgroundTaskManager = null;
    public static boolean reset$For$Test = false;
    private static final Object $$lock = new Object();
    public static BackgroundTaskManager4Public getTheBackgroundTaskManager() throws PersistenceException{
        if (theBackgroundTaskManager == null || reset$For$Test){
            if (reset$For$Test) theBackgroundTaskManager = null;
            class Initializer implements Runnable {
                PersistenceException exception = null;
                public void /* internal */ run(){
                    this.produceSingleton();
                }
                void produceSingleton() {
                    synchronized ($$lock){
                        try {
                            BackgroundTaskManager4Public proxi = null;
                            proxi = ConnectionHandler.getTheConnectionHandler().theBackgroundTaskManagerFacade.getTheBackgroundTaskManager();
                            theBackgroundTaskManager = proxi;
                            if(proxi.getId() < 0) {
                                ((AbstractPersistentRoot)proxi).setId(proxi.getId() * -1);
                                proxi.initialize(proxi, new java.util.HashMap<String,Object>());
                                proxi.initializeOnCreation();
                            }
                        } catch (PersistenceException e){
                            exception = e;
                        } finally {
                            $$lock.notify();
                        }
                        
                    }
                }
                BackgroundTaskManager4Public getResult() throws PersistenceException{
                    synchronized ($$lock) {
                        if (exception == null && theBackgroundTaskManager== null) try {$$lock.wait();} catch (InterruptedException e) {}
                        if(exception != null) throw exception;
                        return theBackgroundTaskManager;
                    }
                }
                
            }
            reset$For$Test = false;
            Initializer initializer = new Initializer();
            new Thread(initializer).start();
            return initializer.getResult();
        }
        return theBackgroundTaskManager;
    }
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("tasks", this.getTasks().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public BackgroundTaskManager provideCopy() throws PersistenceException{
        BackgroundTaskManager result = this;
        result = new BackgroundTaskManager(this.subService, 
                                           this.This, 
                                           this.getId());
        result.tasks = this.tasks.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected BackgroundTaskManager_TasksProxi tasks;
    protected SubjInterface subService;
    protected PersistentBackgroundTaskManager This;
    
    public BackgroundTaskManager(SubjInterface subService,PersistentBackgroundTaskManager This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.tasks = new BackgroundTaskManager_TasksProxi(this);
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 363;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        // Singletons cannot be delayed!
    }
    
    public BackgroundTaskManager_TasksProxi getTasks() throws PersistenceException {
        return this.tasks;
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
            ConnectionHandler.getTheConnectionHandler().theBackgroundTaskManagerFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentBackgroundTaskManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentBackgroundTaskManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theBackgroundTaskManagerFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentBackgroundTaskManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentBackgroundTaskManager result = (PersistentBackgroundTaskManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentBackgroundTaskManager)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleBackgroundTaskManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleBackgroundTaskManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleBackgroundTaskManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleBackgroundTaskManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleBackgroundTaskManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleBackgroundTaskManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleBackgroundTaskManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleBackgroundTaskManager(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getTasks().getLength() > 0) return 1;
        return 0;
    }
    
    
    public synchronized void deregister(final ObsInterface observee) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentBackgroundTaskManager)This);
		if(this.isTheSameAs(This)){
		}
    }
    public synchronized void register(final ObsInterface observee) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.register(observee);
    }
    public void step() 
				throws PersistenceException{
        model.meta.BackgroundTaskManagerStepMssg event = new model.meta.BackgroundTaskManagerStepMssg(getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public synchronized void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.updateObservers(event);
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void addTask(final BackgroundTask4Public task) 
				throws PersistenceException{
        getThis().getTasks().add(task);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnCreation
        
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnInstantiation
        
    }
    public void startTasks() 
				throws PersistenceException{
        getThis().getTasks().applyToAll(task -> task.startTask(5000));
    }
    public void stepImplementation() 
				throws PersistenceException{
        getThis().getTasks().applyToAll(BackgroundTask4Public::step);
    }
    public void stopTasks() 
				throws PersistenceException{
        getThis().getTasks().applyToAll(BackgroundTask4Public::stopTask);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
