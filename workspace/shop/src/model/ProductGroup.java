
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ProductGroup extends model.Component implements PersistentProductGroup{
    
    
    public static PersistentProductGroup createProductGroup() throws PersistenceException{
        return createProductGroup(false);
    }
    
    public static PersistentProductGroup createProductGroup(boolean delayed$Persistence) throws PersistenceException {
        PersistentProductGroup result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theProductGroupFacade
                .newDelayedProductGroup();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theProductGroupFacade
                .newProductGroup(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentProductGroup createProductGroup(boolean delayed$Persistence,PersistentProductGroup This) throws PersistenceException {
        PersistentProductGroup result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theProductGroupFacade
                .newDelayedProductGroup();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theProductGroupFacade
                .newProductGroup(-1);
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
            result.put("components", this.getComponents().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ProductGroup provideCopy() throws PersistenceException{
        ProductGroup result = this;
        result = new ProductGroup(this.This, 
                                  this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected ProductGroup_ComponentsProxi components;
    
    public ProductGroup(PersistentComponent This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((PersistentComponent)This,id);
        this.components = new ProductGroup_ComponentsProxi(this);        
    }
    
    static public long getTypeId() {
        return 121;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 121) ConnectionHandler.getTheConnectionHandler().theProductGroupFacade
            .newProductGroup(this.getId());
        super.store();
        this.getComponents().store();
        
    }
    
    public ProductGroup_ComponentsProxi getComponents() throws PersistenceException {
        return this.components;
    }
    public PersistentProductGroup getThis() throws PersistenceException {
        if(this.This == null){
            PersistentProductGroup result = (PersistentProductGroup)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentProductGroup)this.This;
    }
    
    public void accept(ComponentVisitor visitor) throws PersistenceException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProductGroup(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroup(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProductGroup(this);
    }
    public void accept(PartsHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(PartsHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroup(this);
    }
    public <E extends model.UserException>  void accept(PartsHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(PartsHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProductGroup(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getComponents().getLength() > 0) return 1;
        return 0;
    }
    
    
    public boolean containsParts(final PartsHIERARCHY part) 
				throws PersistenceException{
        return getThis().containsParts(part, new java.util.HashSet<PartsHIERARCHY>());
    }
    public boolean containsParts(final PartsHIERARCHY part, final java.util.HashSet<PartsHIERARCHY> visited) 
				throws PersistenceException{
        if(getThis().equals(part)) return true;
		if(visited.contains(getThis())) return false;
		java.util.Iterator<PersistentComponent> iterator0 = getThis().getComponents().iterator();
		while(iterator0.hasNext())
			if(((PartsHIERARCHY)iterator0.next()).containsParts(part, visited)) return true; 
		visited.add(getThis());
		return false;
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentProductGroup)This);
		if(this.isTheSameAs(This)){
		}
    }
    public <T> T strategyParts(final PartsHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return getThis().strategyParts(strategy, new java.util.HashMap<PartsHIERARCHY,T>());
    }
    public <T> T strategyParts(final PartsHIERARCHYStrategy<T> strategy, final java.util.HashMap<PartsHIERARCHY,T> visited) 
				throws PersistenceException{
        if (visited.containsKey(getThis())) return visited.get(getThis());
		T result$$components$$ProductGroup = strategy.ProductGroup$$components$$$initialize(getThis());
		java.util.Iterator<?> iterator$$ = getThis().getComponents().iterator();
		while (iterator$$.hasNext()){
			PersistentComponent current$$Field = (PersistentComponent)iterator$$.next();
			T current$$ = current$$Field.strategyParts(strategy, visited);
			result$$components$$ProductGroup = strategy.ProductGroup$$components$$consolidate(getThis(), result$$components$$ProductGroup, current$$);
		}
		T result = strategy.ProductGroup$$finalize(getThis() ,result$$components$$ProductGroup);
		visited.put(getThis(),result);
		return result;
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
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
