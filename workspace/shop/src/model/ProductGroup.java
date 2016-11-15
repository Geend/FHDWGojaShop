
package model;

import common.Fraction;
import model.meta.ComponentMssgs;
import model.meta.ComponentMssgsVisitor;
import model.meta.SubComponentMoveToProductGroupMssg;
import persistence.*;


/* Additional import section end */

public abstract class ProductGroup extends model.Component implements PersistentProductGroup{
    
    
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
    
    public abstract ProductGroup provideCopy() throws PersistenceException;
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected ProductGroup_ComponentsProxi components;
    
    public ProductGroup(String name,SubjInterface subService,PersistentComponent This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((String)name,(SubjInterface)subService,(PersistentComponent)This,id);
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
        super.store();
        this.getComponents().store();
        
    }
    
    public ProductGroup_ComponentsProxi getComponents() throws PersistenceException {
        return this.components;
    }
    public abstract PersistentProductGroup getThis() throws PersistenceException ;
    
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentProductGroup)This);
		if(this.isTheSameAs(This)){
			this.setName((String)final$$Fields.get("name"));
		}
    }
    public void newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		NewArticleCommand4Public command = model.meta.NewArticleCommand.createNewArticleCommand(name, price, minStock, maxStock, producerDeliveryTime, now, now);
		command.setProducer(producer);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void newSubProductGroup(final String name, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		NewSubProductGroupCommand4Public command = model.meta.NewSubProductGroupCommand.createNewSubProductGroupCommand(name, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
    }
    
    
    // Start of section that contains overridden operations only.
    
    /* Start of protected part that is not overridden by persistence generator */
    public void addComponent(final Component4Public component)
            throws model.CycleException, PersistenceException{
        getThis().getComponents().add(component);
    }
    public void newSubProductGroup(final String name)
            throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        SubProductGroup4Public subProductGroup4Public = SubProductGroup.createSubProductGroup(name, getThis());
        getThis().addComponent(subProductGroup4Public);
    }
    public void removeComponent(final Component4Public component)
            throws PersistenceException{
        //getThis().getComponents().removeAll(component);
        getThis().getComponents().filter(x -> !x.equals(component));
    }


    public void newArticle(String name, Fraction price, long minStock, long maxStock, long producerDeliveryTime, Producer4Public producer) throws CycleException, PersistenceException {
        Article4Public article4Public = Article.createArticle(name, price, minStock, maxStock, producerDeliveryTime, producer, getThis());
        getThis().addComponent(article4Public);
    }


    /* End of protected part that is not overridden by persistence generator */
    
}
