
package model;

import model.meta.RootProductGroupMssgs;
import persistence.*;


/* Additional import section end */

public abstract class Service extends PersistentObject implements PersistentService{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static Service4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getClass(objectId);
        return (Service4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            AbstractPersistentRoot rootProductGroup = (AbstractPersistentRoot)this.getRootProductGroup();
            if (rootProductGroup != null) {
                result.put("rootProductGroup", rootProductGroup.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    rootProductGroup.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && rootProductGroup.hasEssentialFields())rootProductGroup.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            result.put("errors", this.getErrors().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public abstract Service provideCopy() throws PersistenceException;
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistenceException exception = null;
    protected model.UserException userException = null;
    protected boolean changed = false;
    
    protected PersistentServiceRootProductGroup rootProductGroup;
    protected SubjInterface subService;
    protected PersistentService This;
    protected Service_ErrorsProxi errors;
    
    public Service(PersistentServiceRootProductGroup rootProductGroup,SubjInterface subService,PersistentService This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.rootProductGroup = rootProductGroup;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;
        this.errors = new Service_ErrorsProxi(this);        
    }
    
    static public long getTypeId() {
        return -226;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        super.store();
        if(this.rootProductGroup != null){
            this.rootProductGroup.store();
            ConnectionHandler.getTheConnectionHandler().theServiceFacade.rootProductGroupSet(this.getId(), rootProductGroup);
        }
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theServiceFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theServiceFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public void setRootProductGroup(ServiceRootProductGroup4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.rootProductGroup)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.rootProductGroup = (PersistentServiceRootProductGroup)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theServiceFacade.rootProductGroupSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theServiceFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentService newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentService)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theServiceFacade.ThisSet(this.getId(), newValue);
        }
    }
    public Service_ErrorsProxi getErrors() throws PersistenceException {
        return this.errors;
    }
    public abstract PersistentService getThis() throws PersistenceException ;
    
    
    
    public RootProductGroup4Public getRootProductGroup() 
				throws PersistenceException{
        if (this.rootProductGroup== null) return null;
		return this.rootProductGroup.getObservee();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentService)This);
		if(this.isTheSameAs(This)){
		}
    }
    public void setRootProductGroup(final RootProductGroup4Public rootProductGroup) 
				throws PersistenceException{
        if (this.rootProductGroup == null) {
			this.setRootProductGroup(model.ServiceRootProductGroup.createServiceRootProductGroup(this.isDelayed$Persistence()));
			this.rootProductGroup.setObserver(getThis());
		}
		this.rootProductGroup.setObservee(rootProductGroup);
    }
    public void signalChanged(final boolean signal) 
				throws PersistenceException{
        this.changed = signal;
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void initializeOnCreation() 
				throws PersistenceException{
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    
    
    // Start of section that contains overridden operations only.
    
    public void handleException(final Command command, final PersistenceException exception) 
				throws PersistenceException{
        new Thread(new Runnable(){
            public /*INTERNAL*/ void run() {
                //Handle exception!
            }
        }).start();
    }
    public void handleResult(final Command command) 
				throws PersistenceException{
        new Thread(new Runnable(){
            public void  /*INTERNAL*/  run() {
                try {
                    try {
                        command.checkException();
                        //Handle result!
                        signalChanged(true);
                    } catch (model.UserException e) {
                        model.UserExceptionToDisplayVisitor visitor = new model.UserExceptionToDisplayVisitor();
                        e.accept(visitor);
                        getErrors().add(visitor.getResult());
                        signalChanged(true);
                    }
                } catch (PersistenceException e) {
                    //Handle fatal exception!
                }
            }
        }).start();
    }
    public boolean hasChanged() 
				throws PersistenceException{
        boolean result = this.changed;
        this.changed = false;
        return result;
    }

    /* Start of protected part that is not overridden by persistence generator */
    @Override
    public void rootProductGroup_update(RootProductGroupMssgs event) throws PersistenceException {
        getThis().signalChanged(true);
    }
    /* End of protected part that is not overridden by persistence generator */
    
}
