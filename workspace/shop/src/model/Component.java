
package model;

import persistence.*;


/* Additional import section end */

public abstract class Component extends PersistentObject implements PersistentComponent{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static Component4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theComponentFacade.getClass(objectId);
        return (Component4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            AbstractPersistentRoot parent = (AbstractPersistentRoot)this.getParent();
            if (parent != null) {
                result.put("parent", parent.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    parent.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && parent.hasEssentialFields())parent.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public abstract Component provideCopy() throws PersistenceException;
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected ComponentContainer parent;
    protected SubjInterface subService;
    protected PersistentComponent This;
    
    public Component(ComponentContainer parent,SubjInterface subService,PersistentComponent This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.parent = parent;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 131;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        super.store();
        if(this.getParent() != null){
            this.getParent().store();
            ConnectionHandler.getTheConnectionHandler().theComponentFacade.parentSet(this.getId(), getParent());
        }
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theComponentFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theComponentFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public ComponentContainer getParent() throws PersistenceException {
        return this.parent;
    }
    public void setParent(ComponentContainer newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.parent)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.parent = (ComponentContainer)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theComponentFacade.parentSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theComponentFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentComponent newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentComponent)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theComponentFacade.ThisSet(this.getId(), newValue);
        }
    }
    public abstract PersistentComponent getThis() throws PersistenceException ;
    
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentComponent)This);
		if(this.isTheSameAs(This)){
			this.setParent((ComponentContainer)final$$Fields.get("parent"));
		}
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
    
    public void moveTo(final ComponentContainer container) 
				throws model.InvalidMoveException, model.CycleException, PersistenceException{
        if(getThis().equals(container))
            throw new InvalidMoveException("Container kann nicht in sich selbst verschoben werden!");
        getThis().getParent().removeComponent(getThis());
        container.addComponent(getThis());
        getThis().setParent(container);
    }

    /* Start of protected part that is not overridden by persistence generator */

    /* End of protected part that is not overridden by persistence generator */
    
}
