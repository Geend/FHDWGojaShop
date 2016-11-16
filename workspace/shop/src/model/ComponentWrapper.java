
package model;

import model.meta.ComponentMssgs;
import persistence.*;


/* Additional import section end */

public abstract class ComponentWrapper extends PersistentObject implements PersistentComponentWrapper{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static ComponentWrapper4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theComponentWrapperFacade.getClass(objectId);
        return (ComponentWrapper4Public)PersistentProxi.createProxi(objectId, classId);
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
    
    public abstract ComponentWrapper provideCopy() throws PersistenceException;
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentComponent component;
    protected SubjInterface subService;
    protected PersistentComponentWrapper This;
    
    public ComponentWrapper(PersistentComponent component,SubjInterface subService,PersistentComponentWrapper This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.component = component;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 287;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        super.store();
        if(this.getComponent() != null){
            this.getComponent().store();
            ConnectionHandler.getTheConnectionHandler().theComponentWrapperFacade.componentSet(this.getId(), getComponent());
        }
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theComponentWrapperFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theComponentWrapperFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public Component4Public getComponent() throws PersistenceException {
        return (Component4Public)this.component;
    }
    public void setComponent(Component4Public newValue) throws PersistenceException , model.CycleException{
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.containsCompHierarchy(getThis())) throw new model.CycleException("Cycle in CompHierarchy detected!");
        if(newValue.isTheSameAs(this.component)) return;
        if(getThis().getComponent() != null)throw new PersistenceException("Final field component in type ComponentWrapper has been set already!",0);
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.component = (PersistentComponent)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theComponentWrapperFacade.componentSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theComponentWrapperFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentComponentWrapper newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentComponentWrapper)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theComponentWrapperFacade.ThisSet(this.getId(), newValue);
        }
    }
    public abstract PersistentComponentWrapper getThis() throws PersistenceException ;
    
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentComponentWrapper)This);
		if(this.isTheSameAs(This)){
			try { this.setComponent((PersistentComponent)final$$Fields.get("component")); } catch (model.CycleException e){throw new persistence.PersistenceExceptionCycleTunnel(e);}
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
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
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */

    public void component_update(ComponentMssgs event) throws PersistenceException {

    }
    /* End of protected part that is not overridden by persistence generator */
    
}
