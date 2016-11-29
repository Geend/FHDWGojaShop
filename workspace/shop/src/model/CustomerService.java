
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CustomerService extends model.Service implements PersistentCustomerService{
    
    
    public static CustomerService4Public createCustomerService(CustomerAccount4Public account) throws PersistenceException{
        return createCustomerService(account,false);
    }
    
    public static CustomerService4Public createCustomerService(CustomerAccount4Public account,boolean delayed$Persistence) throws PersistenceException {
        PersistentCustomerService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade
                .newDelayedCustomerService();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade
                .newCustomerService(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("account", account);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static CustomerService4Public createCustomerService(CustomerAccount4Public account,boolean delayed$Persistence,CustomerService4Public This) throws PersistenceException {
        PersistentCustomerService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade
                .newDelayedCustomerService();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade
                .newCustomerService(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("account", account);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            AbstractPersistentRoot articleLst = (AbstractPersistentRoot)this.getArticleLst();
            if (articleLst != null) {
                result.put("articleLst", articleLst.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    articleLst.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && articleLst.hasEssentialFields())articleLst.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot rootProductGroup = (AbstractPersistentRoot)this.getRootProductGroup();
            if (rootProductGroup != null) {
                result.put("rootProductGroup", rootProductGroup.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    rootProductGroup.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && rootProductGroup.hasEssentialFields())rootProductGroup.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot customerDeliveryTimeManager = (AbstractPersistentRoot)this.getCustomerDeliveryTimeManager();
            if (customerDeliveryTimeManager != null) {
                result.put("customerDeliveryTimeManager", customerDeliveryTimeManager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    customerDeliveryTimeManager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && customerDeliveryTimeManager.hasEssentialFields())customerDeliveryTimeManager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot account = (AbstractPersistentRoot)this.getAccount();
            if (account != null) {
                result.put("account", account.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    account.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && account.hasEssentialFields())account.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot cart = (AbstractPersistentRoot)this.getCart();
            if (cart != null) {
                result.put("cart", cart.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    cart.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && cart.hasEssentialFields())cart.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot orderManager = (AbstractPersistentRoot)this.getOrderManager();
            if (orderManager != null) {
                result.put("orderManager", orderManager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    orderManager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && orderManager.hasEssentialFields())orderManager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public CustomerService provideCopy() throws PersistenceException{
        CustomerService result = this;
        result = new CustomerService(this.subService, 
                                     this.This, 
                                     this.articleLst, 
                                     this.rootProductGroup, 
                                     this.customerDeliveryTimeManager, 
                                     this.account, 
                                     this.cart, 
                                     this.orderManager, 
                                     this.getId());
        result.errors = this.errors.copy(result);
        result.errors = this.errors.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentCustomerArticleLst articleLst;
    protected PersistentCustomerServiceRootProductGroup rootProductGroup;
    protected PersistentCustomerDeliveryTimeManager customerDeliveryTimeManager;
    protected PersistentCustomerAccount account;
    protected PersistentShoppingCart cart;
    protected PersistentCustomerOrderManager orderManager;
    
    public CustomerService(SubjInterface subService,PersistentService This,PersistentCustomerArticleLst articleLst,PersistentCustomerServiceRootProductGroup rootProductGroup,PersistentCustomerDeliveryTimeManager customerDeliveryTimeManager,PersistentCustomerAccount account,PersistentShoppingCart cart,PersistentCustomerOrderManager orderManager,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((SubjInterface)subService,(PersistentService)This,id);
        this.articleLst = articleLst;
        this.rootProductGroup = rootProductGroup;
        this.customerDeliveryTimeManager = customerDeliveryTimeManager;
        this.account = account;
        this.cart = cart;
        this.orderManager = orderManager;        
    }
    
    static public long getTypeId() {
        return -278;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == -278) ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade
            .newCustomerService(this.getId());
        super.store();
        if(this.getArticleLst() != null){
            this.getArticleLst().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade.articleLstSet(this.getId(), getArticleLst());
        }
        if(this.rootProductGroup != null){
            this.rootProductGroup.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade.rootProductGroupSet(this.getId(), rootProductGroup);
        }
        if(this.getCustomerDeliveryTimeManager() != null){
            this.getCustomerDeliveryTimeManager().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade.customerDeliveryTimeManagerSet(this.getId(), getCustomerDeliveryTimeManager());
        }
        if(this.getAccount() != null){
            this.getAccount().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade.accountSet(this.getId(), getAccount());
        }
        if(this.getCart() != null){
            this.getCart().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade.cartSet(this.getId(), getCart());
        }
        if(this.getOrderManager() != null){
            this.getOrderManager().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade.orderManagerSet(this.getId(), getOrderManager());
        }
        
    }
    
    public CustomerArticleLst4Public getArticleLst() throws PersistenceException {
        return this.articleLst;
    }
    public void setArticleLst(CustomerArticleLst4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.articleLst)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.articleLst = (PersistentCustomerArticleLst)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade.articleLstSet(this.getId(), newValue);
        }
    }
    public void setRootProductGroup(CustomerServiceRootProductGroup4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.rootProductGroup)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.rootProductGroup = (PersistentCustomerServiceRootProductGroup)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade.rootProductGroupSet(this.getId(), newValue);
        }
    }
    public CustomerDeliveryTimeManager4Public getCustomerDeliveryTimeManager() throws PersistenceException {
        return this.customerDeliveryTimeManager;
    }
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.customerDeliveryTimeManager)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.customerDeliveryTimeManager = (PersistentCustomerDeliveryTimeManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade.customerDeliveryTimeManagerSet(this.getId(), newValue);
        }
    }
    public CustomerAccount4Public getAccount() throws PersistenceException {
        return this.account;
    }
    public void setAccount(CustomerAccount4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.account)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.account = (PersistentCustomerAccount)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade.accountSet(this.getId(), newValue);
        }
    }
    public ShoppingCart4Public getCart() throws PersistenceException {
        return this.cart;
    }
    public void setCart(ShoppingCart4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.cart)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.cart = (PersistentShoppingCart)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade.cartSet(this.getId(), newValue);
        }
    }
    public CustomerOrderManager4Public getOrderManager() throws PersistenceException {
        return this.orderManager;
    }
    public void setOrderManager(CustomerOrderManager4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.orderManager)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.orderManager = (PersistentCustomerOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade.orderManagerSet(this.getId(), newValue);
        }
    }
    public PersistentCustomerService getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomerService result = (PersistentCustomerService)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomerService)this.This;
    }
    
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getArticleLst() != null) return 1;
        if (this.getRootProductGroup() != null) return 1;
        if (this.getCustomerDeliveryTimeManager() != null) return 1;
        if (this.getAccount() != null) return 1;
        if (this.getCart() != null) return 1;
        if (this.getOrderManager() != null) return 1;
        return 0;
    }
    
    
    public String customerService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        String result = "+++";
		if(anything instanceof ArticleWrapper4Public) {
			if(this.filter_addToCart((ArticleWrapper4Public)anything)) result = result + "addToCartPRMTRArticleWrapperPRMTRIntegerPRMTR+++";
		}
		return result;
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
    public RootProductGroup4Public getRootProductGroup() 
				throws PersistenceException{
        if (this.rootProductGroup== null) return null;
		return this.rootProductGroup.getObservee();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentCustomerService)This);
		if(this.isTheSameAs(This)){
			this.setAccount((PersistentCustomerAccount)final$$Fields.get("account"));
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
    public void setRootProductGroup(final RootProductGroup4Public rootProductGroup) 
				throws PersistenceException{
        if (this.rootProductGroup == null) {
			this.setRootProductGroup(model.CustomerServiceRootProductGroup.createCustomerServiceRootProductGroup(this.isDelayed$Persistence()));
			this.rootProductGroup.setObserver(getThis());
		}
		this.rootProductGroup.setObservee(rootProductGroup);
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
    
    public void addToCart(final ArticleWrapper4Public article, final long quantity) 
				throws PersistenceException{
        ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle4Public = ShoppingCartQuantifiedArticle.createShoppingCartQuantifiedArticle(quantity, article);
        getThis().getCart().addArticle(shoppingCartQuantifiedArticle4Public, getThis());
    }
    public void changeArticleQuantity(final ShoppingCartQuantifiedArticle4Public article, final long newQuantity) 
				throws PersistenceException{

        article.changeArticleQuantity(newQuantity, getThis());
    }
    public void clearError(final ErrorDisplay4Public error) 
				throws PersistenceException{
        getThis().getErrors().removeAll(error);
        getThis().signalChanged(true);
    }
    public void clear() 
				throws PersistenceException{
        getThis().getArticleLst().clear();
        getThis().signalChanged(true);
    }
    public void connected(final String user) 
				throws PersistenceException{
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void deposit(final common.Fraction amount) 
				throws PersistenceException{
        getThis().getAccount().deposit(amount, getThis());
    }
    public void disconnected() 
				throws PersistenceException{
    }
    public void findArticle(final String name) 
				throws PersistenceException{
        getThis().getArticleLst().find(name);
        getThis().signalChanged(true);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
        getThis().setCart(ShoppingCart.createShoppingCart());
        getThis().setRootProductGroup( RootProductGroup.getTheRootProductGroup());
        getThis().setCustomerDeliveryTimeManager(CustomerDeliveryTimeManager.getTheCustomerDeliveryTimeManager());
        getThis().setOrderManager(CustomerOrderManager.createCustomerOrderManager(getThis().getAccount()));
        getThis().setArticleLst(CustomerArticleLst.createCustomerArticleLst());
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
    }
    public void order(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.NotEnoughStockException, model.NotEnoughMoneyException, PersistenceException{
        getThis().getOrderManager().newOrder(cart, customerDeliveryTime,getThis());
        getThis().setCart(ShoppingCart.createShoppingCart());
    }
    public void preOrder(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.NotEnoughMoneyException, PersistenceException{
        getThis().getOrderManager().newPreOrder(cart, customerDeliveryTime,getThis());
        getThis().setCart(ShoppingCart.createShoppingCart());
    }
    public void removeFromCart(final ShoppingCartQuantifiedArticle4Public article) 
				throws PersistenceException{
        getThis().getCart().removeArticle(article,getThis());
    }
    public void rootProductGroup_update(final model.meta.RootProductGroupMssgs event) 
				throws PersistenceException{
        getThis().signalChanged(true);
    }
    public void withdraw(final common.Fraction amount) 
				throws model.NotEnoughMoneyException, PersistenceException{
        getThis().getAccount().withdraw(amount, getThis());
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    private boolean filter_addToCart(ArticleWrapper4Public anything) throws PersistenceException {
        return anything.getArticle().getState().accept(new ArticleStateReturnVisitor<Boolean>() {
            @Override
            public Boolean handleInSale(InSale4Public inSale) throws PersistenceException {
                return true;
            }

            @Override
            public Boolean handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
                return false;
            }

            @Override
            public Boolean handleNotInSale(NotInSale4Public notInSale) throws PersistenceException {
                return false;
            }

            @Override
            public Boolean handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
                return true;
            }
        });
    }
    /* End of protected part that is not overridden by persistence generator */
    
}
