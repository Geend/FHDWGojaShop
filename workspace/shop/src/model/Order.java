
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class Order extends PersistentObject implements PersistentOrder{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static Order4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theOrderFacade.getClass(objectId);
        return (Order4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static Order4Public createOrder(CustomerDeliveryTime4Public customerDeliveryTime,OrderStatus4Public state) throws PersistenceException{
        return createOrder(customerDeliveryTime,state,false);
    }
    
    public static Order4Public createOrder(CustomerDeliveryTime4Public customerDeliveryTime,OrderStatus4Public state,boolean delayed$Persistence) throws PersistenceException {
        PersistentOrder result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOrderFacade
                .newDelayedOrder(common.Fraction.Null);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOrderFacade
                .newOrder(common.Fraction.Null,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("customerDeliveryTime", customerDeliveryTime);
        final$$Fields.put("state", state);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static Order4Public createOrder(CustomerDeliveryTime4Public customerDeliveryTime,OrderStatus4Public state,boolean delayed$Persistence,Order4Public This) throws PersistenceException {
        PersistentOrder result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOrderFacade
                .newDelayedOrder(common.Fraction.Null);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOrderFacade
                .newOrder(common.Fraction.Null,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("customerDeliveryTime", customerDeliveryTime);
        final$$Fields.put("state", state);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
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
            result.put("totalPrice", this.getTotalPrice().toString());
            AbstractPersistentRoot state = (AbstractPersistentRoot)this.getState();
            if (state != null) {
                result.put("state", state.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    state.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && state.hasEssentialFields())state.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot myOrder = (AbstractPersistentRoot)this.getMyOrder();
            if (myOrder != null) {
                result.put("myOrder", myOrder.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    myOrder.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && myOrder.hasEssentialFields())myOrder.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public Order provideCopy() throws PersistenceException{
        Order result = this;
        result = new Order(this.customerDeliveryTime, 
                           this.totalPrice, 
                           this.state, 
                           this.subService, 
                           this.This, 
                           this.getId());
        result.articles = this.articles.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected Order_ArticlesProxi articles;
    protected PersistentCustomerDeliveryTime customerDeliveryTime;
    protected common.Fraction totalPrice;
    protected PersistentOrderStatus state;
    protected SubjInterface subService;
    protected PersistentOrder This;
    
    public Order(PersistentCustomerDeliveryTime customerDeliveryTime,common.Fraction totalPrice,PersistentOrderStatus state,SubjInterface subService,PersistentOrder This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.articles = new Order_ArticlesProxi(this);
        this.customerDeliveryTime = customerDeliveryTime;
        this.totalPrice = totalPrice;
        this.state = state;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 238;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 238) ConnectionHandler.getTheConnectionHandler().theOrderFacade
            .newOrder(totalPrice,this.getId());
        super.store();
        this.getArticles().store();
        if(this.getCustomerDeliveryTime() != null){
            this.getCustomerDeliveryTime().store();
            ConnectionHandler.getTheConnectionHandler().theOrderFacade.customerDeliveryTimeSet(this.getId(), getCustomerDeliveryTime());
        }
        if(this.getState() != null){
            this.getState().store();
            ConnectionHandler.getTheConnectionHandler().theOrderFacade.stateSet(this.getId(), getState());
        }
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theOrderFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theOrderFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public Order_ArticlesProxi getArticles() throws PersistenceException {
        return this.articles;
    }
    public CustomerDeliveryTime4Public getCustomerDeliveryTime() throws PersistenceException {
        return this.customerDeliveryTime;
    }
    public void setCustomerDeliveryTime(CustomerDeliveryTime4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.customerDeliveryTime)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.customerDeliveryTime = (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOrderFacade.customerDeliveryTimeSet(this.getId(), newValue);
        }
    }
    public common.Fraction getTotalPrice() throws PersistenceException {
        return this.totalPrice;
    }
    public void setTotalPrice(common.Fraction newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theOrderFacade.totalPriceSet(this.getId(), newValue);
        this.totalPrice = newValue;
    }
    public OrderStatus4Public getState() throws PersistenceException {
        return this.state;
    }
    public void setState(OrderStatus4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.state)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.state = (PersistentOrderStatus)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOrderFacade.stateSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theOrderFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentOrder newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentOrder)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOrderFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentOrder getThis() throws PersistenceException {
        if(this.This == null){
            PersistentOrder result = (PersistentOrder)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentOrder)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrder(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrder(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrder(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOrder(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrder(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrder(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrder(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getCustomerDeliveryTime() != null) return 1;
        if (this.getState() != null) return 1;
        if (this.getMyOrder() != null) return 1;
        if (this.getArticles().getLength() > 0) return 1;
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
    public ArticleReturn4Public getMyOrder() 
				throws PersistenceException{
        ArticleReturnSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade
										.inverseGetOrder(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentOrder)This);
		if(this.isTheSameAs(This)){
			this.setCustomerDeliveryTime((PersistentCustomerDeliveryTime)final$$Fields.get("customerDeliveryTime"));
			this.setState((PersistentOrderStatus)final$$Fields.get("state"));
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
    
    public void addArticle(final OrderQuantifiedArticle4Public orderQuantifiedArticle) 
				throws PersistenceException{


        SearchListRoot<OrderQuantifiedArticle4Public> all = getThis().getArticles().findAll(x -> x.getArticle().equals(orderQuantifiedArticle.getArticle()));

        if(all.iterator().hasNext())
            all.iterator().next().increaseQuantity(orderQuantifiedArticle.getQuantity());
        else
            getThis().getArticles().add(orderQuantifiedArticle);

        getThis().setTotalPrice(getThis().getTotalPrice().add(orderQuantifiedArticle.getArticle().getPrice().mul(orderQuantifiedArticle.getQuantity())));
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        getThis().setTotalPrice(getThis().getCustomerDeliveryTime().getPrice());

    }
    public void initializeOnInstantiation() 
				throws PersistenceException{

    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
