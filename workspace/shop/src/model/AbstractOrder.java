
package model;

import persistence.*;


/* Additional import section end */

public abstract class AbstractOrder extends PersistentObject implements PersistentAbstractOrder{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentAbstractOrder getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theAbstractOrderFacade.getClass(objectId);
        return (PersistentAbstractOrder)PersistentProxi.createProxi(objectId, classId);
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("articles", this.getArticles().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            AbstractPersistentRoot customerDeliveryTime = (AbstractPersistentRoot)this.getCustomerDeliveryTime();
            if (customerDeliveryTime != null) {
                result.put("customerDeliveryTime", customerDeliveryTime.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    customerDeliveryTime.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && customerDeliveryTime.hasEssentialFields())customerDeliveryTime.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public abstract AbstractOrder provideCopy() throws PersistenceException;
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected AbstractOrder_ArticlesProxi articles;
    protected PersistentCustomerDeliveryTime customerDeliveryTime;
    protected SubjInterface subService;
    protected PersistentAbstractOrder This;
    
    public AbstractOrder(PersistentCustomerDeliveryTime customerDeliveryTime,SubjInterface subService,PersistentAbstractOrder This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.articles = new AbstractOrder_ArticlesProxi(this);
        this.customerDeliveryTime = customerDeliveryTime;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 151;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        super.store();
        this.getArticles().store();
        if(this.getCustomerDeliveryTime() != null){
            this.getCustomerDeliveryTime().store();
            ConnectionHandler.getTheConnectionHandler().theAbstractOrderFacade.customerDeliveryTimeSet(this.getId(), getCustomerDeliveryTime());
        }
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theAbstractOrderFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theAbstractOrderFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public AbstractOrder_ArticlesProxi getArticles() throws PersistenceException {
        return this.articles;
    }
    public PersistentCustomerDeliveryTime getCustomerDeliveryTime() throws PersistenceException {
        return this.customerDeliveryTime;
    }
    public void setCustomerDeliveryTime(PersistentCustomerDeliveryTime newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.customerDeliveryTime)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.customerDeliveryTime = (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theAbstractOrderFacade.customerDeliveryTimeSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theAbstractOrderFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentAbstractOrder newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentAbstractOrder)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theAbstractOrderFacade.ThisSet(this.getId(), newValue);
        }
    }
    public abstract PersistentAbstractOrder getThis() throws PersistenceException ;
    
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentAbstractOrder)This);
		if(this.isTheSameAs(This)){
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
    
    /* End of protected part that is not overridden by persistence generator */
    
}
