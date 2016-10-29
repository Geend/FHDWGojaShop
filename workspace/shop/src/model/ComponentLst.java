
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ComponentLst extends PersistentObject implements PersistentComponentLst{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static ComponentLst4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theComponentLstFacade.getClass(objectId);
        return (ComponentLst4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static ComponentLst4Public createComponentLst() throws PersistenceException{
        return createComponentLst(false);
    }
    
    public static ComponentLst4Public createComponentLst(boolean delayed$Persistence) throws PersistenceException {
        PersistentComponentLst result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theComponentLstFacade
                .newDelayedComponentLst();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theComponentLstFacade
                .newComponentLst(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static ComponentLst4Public createComponentLst(boolean delayed$Persistence,ComponentLst4Public This) throws PersistenceException {
        PersistentComponentLst result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theComponentLstFacade
                .newDelayedComponentLst();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theComponentLstFacade
                .newComponentLst(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("currentComponents", this.getCurrentComponents().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ComponentLst provideCopy() throws PersistenceException{
        ComponentLst result = this;
        result = new ComponentLst(this.This, 
                                  this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected ComponentLst_CurrentComponentsProxi currentComponents;
    protected PersistentComponentLst This;
    
    public ComponentLst(PersistentComponentLst This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.currentComponents = new ComponentLst_CurrentComponentsProxi(this);
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 177;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 177) ConnectionHandler.getTheConnectionHandler().theComponentLstFacade
            .newComponentLst(this.getId());
        super.store();
        this.getCurrentComponents().store();
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theComponentLstFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public ComponentLst_CurrentComponentsProxi getCurrentComponents() throws PersistenceException {
        return this.currentComponents;
    }
    protected void setThis(PersistentComponentLst newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentComponentLst)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theComponentLstFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentComponentLst getThis() throws PersistenceException {
        if(this.This == null){
            PersistentComponentLst result = (PersistentComponentLst)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentComponentLst)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleComponentLst(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentLst(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentLst(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentLst(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getCurrentComponents().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void createProductGroup(final String name, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		CreateProductGroupCommand4Public command = model.meta.CreateProductGroupCommand.createCreateProductGroupCommand(name, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public Server4Public getMyServer() 
				throws PersistenceException{
        ServerSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theServerFacade
										.inverseGetManager(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentComponentLst)This);
		if(this.isTheSameAs(This)){
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void createProductGroup(final String name) 
				throws model.DoubleDefinition, PersistenceException{
        getThis().getCurrentComponents().add(ProductGroup.createProductGroup(name));
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
    
    /* End of protected part that is not overridden by persistence generator */
    
}
