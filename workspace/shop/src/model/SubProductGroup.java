
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class SubProductGroup extends model.ProductGroup implements PersistentSubProductGroup{
    
    
    public static SubProductGroup4Public createSubProductGroup(String name,ProductGroup4Public parent) throws PersistenceException{
        return createSubProductGroup(name,parent,false);
    }
    
    public static SubProductGroup4Public createSubProductGroup(String name,ProductGroup4Public parent,boolean delayed$Persistence) throws PersistenceException {
        PersistentSubProductGroup result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theSubProductGroupFacade
                .newDelayedSubProductGroup(name);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theSubProductGroupFacade
                .newSubProductGroup(name,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("name", name);
        final$$Fields.put("parent", parent);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static SubProductGroup4Public createSubProductGroup(String name,ProductGroup4Public parent,boolean delayed$Persistence,SubProductGroup4Public This) throws PersistenceException {
        PersistentSubProductGroup result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theSubProductGroupFacade
                .newDelayedSubProductGroup(name);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theSubProductGroupFacade
                .newSubProductGroup(name,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("name", name);
        final$$Fields.put("parent", parent);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
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
    
    public SubProductGroup provideCopy() throws PersistenceException{
        SubProductGroup result = this;
        result = new SubProductGroup(this.name, 
                                     this.subService, 
                                     this.This, 
                                     this.parent, 
                                     this.getId());
        result.components = this.components.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentProductGroup parent;
    
    public SubProductGroup(String name,SubjInterface subService,PersistentComponent This,PersistentProductGroup parent,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((String)name,(SubjInterface)subService,(PersistentComponent)This,id);
        this.parent = parent;        
    }
    
    static public long getTypeId() {
        return 214;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 214) ConnectionHandler.getTheConnectionHandler().theSubProductGroupFacade
            .newSubProductGroup(name,this.getId());
        super.store();
        if(this.getParent() != null){
            this.getParent().store();
            ConnectionHandler.getTheConnectionHandler().theSubProductGroupFacade.parentSet(this.getId(), getParent());
        }
        
    }
    
    public ProductGroup4Public getParent() throws PersistenceException {
        return this.parent;
    }
    public void setParent(ProductGroup4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.parent)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.parent = (PersistentProductGroup)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theSubProductGroupFacade.parentSet(this.getId(), newValue);
        }
    }
    public PersistentSubProductGroup getThis() throws PersistenceException {
        if(this.This == null){
            PersistentSubProductGroup result = (PersistentSubProductGroup)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentSubProductGroup)this.This;
    }
    
    public void accept(ProductGroupVisitor visitor) throws PersistenceException {
        visitor.handleSubProductGroup(this);
    }
    public <R> R accept(ProductGroupReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSubProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ProductGroupExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSubProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ProductGroupReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSubProductGroup(this);
    }
    public void accept(ComponentVisitor visitor) throws PersistenceException {
        visitor.handleSubProductGroup(this);
    }
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSubProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSubProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSubProductGroup(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleSubProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSubProductGroup(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSubProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSubProductGroup(this);
    }
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleSubProductGroup(this);
    }
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSubProductGroup(this);
    }
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSubProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSubProductGroup(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleSubProductGroup(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSubProductGroup(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSubProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSubProductGroup(this);
    }
    public void accept(SubComponentVisitor visitor) throws PersistenceException {
        visitor.handleSubProductGroup(this);
    }
    public <R> R accept(SubComponentReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSubProductGroup(this);
    }
    public <E extends model.UserException>  void accept(SubComponentExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSubProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(SubComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSubProductGroup(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getComponents().getLength() > 0) return 1;
        return 0;
    }
    
    
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return getThis().containsCompHierarchy(part, new java.util.HashSet<CompHierarchyHIERARCHY>());
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        if(getThis().equals(part)) return true;
		if(visited.contains(getThis())) return false;
		java.util.Iterator<Component4Public> iterator0 = getThis().getComponents().iterator();
		while(iterator0.hasNext())
			if(((CompHierarchyHIERARCHY)iterator0.next()).containsCompHierarchy(part, visited)) return true; 
		visited.add(getThis());
		return false;
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
        this.setThis((PersistentSubProductGroup)This);
		if(this.isTheSameAs(This)){
			this.setName((String)final$$Fields.get("name"));
			this.setParent((PersistentProductGroup)final$$Fields.get("parent"));
		}
    }
    public void moveTo(final ProductGroup4Public productGroup) 
				throws model.CycleException, PersistenceException{
        model.meta.SubComponentMoveToProductGroupMssg event = new model.meta.SubComponentMoveToProductGroupMssg(productGroup, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void moveTo(final ProductGroup4Public productGroup, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		MoveToCommand4Public command = model.meta.MoveToCommand.createMoveToCommand(now, now);
		command.setProductGroup(productGroup);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
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
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return getThis().strategyCompHierarchy(strategy, new java.util.HashMap<CompHierarchyHIERARCHY,T>());
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        if (visited.containsKey(getThis())) return visited.get(getThis());
		T result$$components$$SubProductGroup = strategy.SubProductGroup$$components$$$initialize(getThis());
		java.util.Iterator<?> iterator$$ = getThis().getComponents().iterator();
		while (iterator$$.hasNext()){
			Component4Public current$$Field = (Component4Public)iterator$$.next();
			T current$$ = current$$Field.strategyCompHierarchy(strategy, visited);
			result$$components$$SubProductGroup = strategy.SubProductGroup$$components$$consolidate(getThis(), result$$components$$SubProductGroup, current$$);
		}
		T result = strategy.SubProductGroup$$finalize(getThis() ,result$$components$$SubProductGroup);
		visited.put(getThis(),result);
		return result;
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
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
		//TODO: implement method: initializeOnCreation
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
		//TODO: implement method: initializeOnInstantiation
    }
    public void moveToImplementation(final ProductGroup4Public productGroup) 
				throws model.CycleException, PersistenceException{

        getThis().getParent().removeComponent(getThis());
        productGroup.addComponent(getThis());
        getThis().setParent(productGroup);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
