
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ProductGroup extends model.Component implements PersistentProductGroup{
    
    
    public static ProductGroup4Public createProductGroup(String name) throws PersistenceException{
        return createProductGroup(name,false);
    }
    
    public static ProductGroup4Public createProductGroup(String name,boolean delayed$Persistence) throws PersistenceException {
        PersistentProductGroup result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theProductGroupFacade
                .newDelayedProductGroup(name);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theProductGroupFacade
                .newProductGroup(name,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("name", name);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static ProductGroup4Public createProductGroup(String name,boolean delayed$Persistence,ProductGroup4Public This) throws PersistenceException {
        PersistentProductGroup result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theProductGroupFacade
                .newDelayedProductGroup(name);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theProductGroupFacade
                .newProductGroup(name,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("name", name);
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
        result = new ProductGroup(this.name, 
                                  this.This, 
                                  this.getId());
        result.components = this.components.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected ProductGroup_ComponentsProxi components;
    
    public ProductGroup(String name,PersistentComponent This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((String)name,(PersistentComponent)This,id);
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
            .newProductGroup(name,this.getId());
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
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroup(this);
    }
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProductGroup(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getComponents().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void addArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		AddArticleCommand4Public command = model.meta.AddArticleCommand.createAddArticleCommand(name, price, minStock, maxStock, producerDeliveryTime, now, now);
		command.setProducer(producer);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void addSubProductGroup(final String name, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		AddSubProductGroupCommand4Public command = model.meta.AddSubProductGroupCommand.createAddSubProductGroupCommand(name, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
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
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentProductGroup)This);
		if(this.isTheSameAs(This)){
			this.setName((String)final$$Fields.get("name"));
		}
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return getThis().strategyCompHierarchy(strategy, new java.util.HashMap<CompHierarchyHIERARCHY,T>());
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        if (visited.containsKey(getThis())) return visited.get(getThis());
		T result$$components$$ProductGroup = strategy.ProductGroup$$components$$$initialize(getThis());
		java.util.Iterator<?> iterator$$ = getThis().getComponents().iterator();
		while (iterator$$.hasNext()){
			Component4Public current$$Field = (Component4Public)iterator$$.next();
			T current$$ = current$$Field.strategyCompHierarchy(strategy, visited);
			result$$components$$ProductGroup = strategy.ProductGroup$$components$$consolidate(getThis(), result$$components$$ProductGroup, current$$);
		}
		T result = strategy.ProductGroup$$finalize(getThis() ,result$$components$$ProductGroup);
		visited.put(getThis(),result);
		return result;
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void addArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.CycleException, PersistenceException{
        getThis().getComponents().add(Article.createArticle(name, price, minStock, maxStock, producerDeliveryTime, producer));
    }
    public void addSubProductGroup(final String name) 
				throws model.DoubleDefinition, model.CycleException, PersistenceException{
        getThis().getComponents().add(ProductGroup.createProductGroup(name));
    }
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
