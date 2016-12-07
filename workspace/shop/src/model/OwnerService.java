
package model;

import common.Fraction;
import persistence.*;
import model.visitor.*;

import java.security.acl.Owner;
import java.text.MessageFormat;


/* Additional import section end */

public class OwnerService extends model.Service implements PersistentOwnerService{
    
    
    public static OwnerService4Public createOwnerService() throws PersistenceException{
        return createOwnerService(false);
    }
    
    public static OwnerService4Public createOwnerService(boolean delayed$Persistence) throws PersistenceException {
        PersistentOwnerService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade
                .newDelayedOwnerService();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade
                .newOwnerService(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static OwnerService4Public createOwnerService(boolean delayed$Persistence,OwnerService4Public This) throws PersistenceException {
        PersistentOwnerService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade
                .newDelayedOwnerService();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade
                .newOwnerService(-1);
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
            AbstractPersistentRoot shop = (AbstractPersistentRoot)this.getShop();
            if (shop != null) {
                result.put("shop", shop.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    shop.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && shop.hasEssentialFields())shop.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot settings = (AbstractPersistentRoot)this.getSettings();
            if (settings != null) {
                result.put("settings", settings.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    settings.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && settings.hasEssentialFields())settings.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot reOrderManager = (AbstractPersistentRoot)this.getReOrderManager();
            if (reOrderManager != null) {
                result.put("reOrderManager", reOrderManager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    reOrderManager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && reOrderManager.hasEssentialFields())reOrderManager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot ownerOrderManager = (AbstractPersistentRoot)this.getOwnerOrderManager();
            if (ownerOrderManager != null) {
                result.put("ownerOrderManager", ownerOrderManager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    ownerOrderManager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && ownerOrderManager.hasEssentialFields())ownerOrderManager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot returnManager = (AbstractPersistentRoot)this.getReturnManager();
            if (returnManager != null) {
                result.put("returnManager", returnManager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    returnManager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && returnManager.hasEssentialFields())returnManager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public OwnerService provideCopy() throws PersistenceException{
        OwnerService result = this;
        result = new OwnerService(this.subService, 
                                  this.This, 
                                  this.shop, 
                                  this.settings, 
                                  this.reOrderManager, 
                                  this.ownerOrderManager, 
                                  this.returnManager, 
                                  this.getId());
        result.errors = this.errors.copy(result);
        result.errors = this.errors.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentOwnerServiceShop shop;
    protected PersistentSettings settings;
    protected PersistentReOrderManager reOrderManager;
    protected PersistentOwnerOrderManager ownerOrderManager;
    protected PersistentReturnManager returnManager;
    
    public OwnerService(SubjInterface subService,PersistentService This,PersistentOwnerServiceShop shop,PersistentSettings settings,PersistentReOrderManager reOrderManager,PersistentOwnerOrderManager ownerOrderManager,PersistentReturnManager returnManager,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((SubjInterface)subService,(PersistentService)This,id);
        this.shop = shop;
        this.settings = settings;
        this.reOrderManager = reOrderManager;
        this.ownerOrderManager = ownerOrderManager;
        this.returnManager = returnManager;        
    }
    
    static public long getTypeId() {
        return -276;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == -276) ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade
            .newOwnerService(this.getId());
        super.store();
        if(this.shop != null){
            this.shop.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.shopSet(this.getId(), shop);
        }
        if(this.getSettings() != null){
            this.getSettings().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.settingsSet(this.getId(), getSettings());
        }
        if(this.getReOrderManager() != null){
            this.getReOrderManager().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.reOrderManagerSet(this.getId(), getReOrderManager());
        }
        if(this.getOwnerOrderManager() != null){
            this.getOwnerOrderManager().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.ownerOrderManagerSet(this.getId(), getOwnerOrderManager());
        }
        if(this.getReturnManager() != null){
            this.getReturnManager().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.returnManagerSet(this.getId(), getReturnManager());
        }
        
    }
    
    public void setShop(OwnerServiceShop4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.shop)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.shop = (PersistentOwnerServiceShop)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.shopSet(this.getId(), newValue);
        }
    }
    public Settings4Public getSettings() throws PersistenceException {
        return this.settings;
    }
    public void setSettings(Settings4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.settings)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.settings = (PersistentSettings)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.settingsSet(this.getId(), newValue);
        }
    }
    public ReOrderManager4Public getReOrderManager() throws PersistenceException {
        return this.reOrderManager;
    }
    public void setReOrderManager(ReOrderManager4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.reOrderManager)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.reOrderManager = (PersistentReOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.reOrderManagerSet(this.getId(), newValue);
        }
    }
    public OwnerOrderManager4Public getOwnerOrderManager() throws PersistenceException {
        return this.ownerOrderManager;
    }
    public void setOwnerOrderManager(OwnerOrderManager4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.ownerOrderManager)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.ownerOrderManager = (PersistentOwnerOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.ownerOrderManagerSet(this.getId(), newValue);
        }
    }
    public ReturnManager4Public getReturnManager() throws PersistenceException {
        return this.returnManager;
    }
    public void setReturnManager(ReturnManager4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.returnManager)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.returnManager = (PersistentReturnManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.returnManagerSet(this.getId(), newValue);
        }
    }
    public PersistentOwnerService getThis() throws PersistenceException {
        if(this.This == null){
            PersistentOwnerService result = (PersistentOwnerService)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentOwnerService)this.This;
    }
    
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleOwnerService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleOwnerService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOwnerService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerService(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOwnerService(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerService(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerService(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleOwnerService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerService(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getSettings() != null) return 1;
        if (this.getReOrderManager() != null) return 1;
        if (this.getOwnerOrderManager() != null) return 1;
        if (this.getReturnManager() != null) return 1;
        if (this.getShop() != null && this.getShop().getTheObject().getLeafInfo() != 0) return 1;
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
    public Shop4Public getShop() 
				throws PersistenceException{
        if (this.shop== null) return null;
		return this.shop.getObservee();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentOwnerService)This);
		if(this.isTheSameAs(This)){
		}
    }
    public String ownerService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        String result = "+++";
		if(anything instanceof ArticleWrapper4Public) {
			if(this.filter_stopSelling((ArticleWrapper4Public)anything)) result = result + "stopSellingPRMTRArticleWrapperPRMTR+++";
			if(this.filter_startSelling((ArticleWrapper4Public)anything)) result = result + "startSellingPRMTRArticleWrapperPRMTR+++";
		}
		return result;
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
    public void setShop(final Shop4Public shop) 
				throws PersistenceException{
        if (this.shop == null) {
			this.setShop(model.OwnerServiceShop.createOwnerServiceShop(this.isDelayed$Persistence()));
			this.shop.setObserver(getThis());
		}
		this.shop.setObservee(shop);
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
    
    public void changeArticleName(final ArticleWrapper4Public article, final String newName) 
				throws PersistenceException{
       getThis().getShop().changeArticleName(article, newName, getThis());
    }
    public void changeArticlePrice(final ArticleWrapper4Public article, final common.Fraction newPrice) 
				throws PersistenceException{
       getThis().getShop().changeArticlePrice(article, newPrice, getThis());
    }
    public void changeCustomerDeliveryTimePrice(final CustomerDeliveryTime4Public customerDeliveryTime, final common.Fraction newValue) 
				throws PersistenceException{
        customerDeliveryTime.setPrice(newValue);
        getThis().signalChanged(true);

    }
    public void changeCustomerDeliveryTimeTime(final CustomerDeliveryTime4Public customerDeliveryTime, final long newValue) 
				throws PersistenceException{
        customerDeliveryTime.setDeliveryTime(newValue);
        getThis().signalChanged(true);

    }
    public void changeNewCustomerDefaultBalance(final common.Fraction newValue) 
				throws PersistenceException{
        getSettings().setNewCustomerDefaultBalance(newValue);
        getThis().signalChanged(true);

    }
    public void changeNewCustomerDefaultLimit(final common.Fraction newValue) 
				throws PersistenceException{
        getSettings().setNewCustomerDefaultLimit(newValue);
        getThis().signalChanged(true);

    }
    public void changeReturnPercentage(final common.Fraction newValue) 
				throws PersistenceException{
        getSettings().setReturnPercentage(newValue);
        getThis().signalChanged(true);

    }
    public void connected(final String user) 
				throws PersistenceException{
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void createCustomerDeliveryTime(final String name, final common.Fraction price, final long time) 
				throws model.DoubleDefinitionException, PersistenceException{

        getThis().getShop().createCustomerDeliveryTime(name, price, time, getThis());
    }
    public void createProducer(final String name) 
				throws model.DoubleDefinitionException, PersistenceException{
        getThis().getShop().createProducer(name);

    }
    public void disconnected() 
				throws PersistenceException{
    }
    public Article4Public getArticle(final ArticleWrapper4Public wrapper) 
				throws PersistenceException{
        return wrapper.getArticle();
    }
    public void increaseArticleStock(final ArticleWrapper4Public article, final long quantity) 
				throws PersistenceException{
        article.getArticle().increaseStock(quantity,getThis());
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();

        getThis().setSettings(Settings.getTheSettings());
        getThis().setReOrderManager(ReOrderManager.getTheReOrderManager());
        getThis().setOwnerOrderManager(OwnerOrderManager.getTheOwnerOrderManager());
        getThis().setReturnManager(ReturnManager.getTheReturnManager());
        getThis().setShop(Shop.getTheShop());
        BackgroundTaskManager.getTheBackgroundTaskManager().startTasks();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
    }
    public void moveTo(final Component4Public component, final ComponentContainer newParentGroup) 
				throws model.CycleException, PersistenceException{
        getThis().getShop().moveTo(component, newParentGroup, getThis());

    }
    public void newArticle(final ComponentContainer parent, final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        getThis().getShop().newArticle(parent, name, price, minStock, maxStock, producerDeliveryTime, producer, getThis());
    }
    public void newProductGroup(final ComponentContainer parent, final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        getThis().getShop().newProductGroup(parent, name, getThis());

    }
    public void newProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        getThis().getShop().newProductGroup(name);
    }
    public void reduceArticleStock(final ArticleWrapper4Public article, final long quantity) 
				throws model.NotEnoughStockException, PersistenceException{
        //TODO: implement method: reduceArticleStock
        
    }

    public void startSelling(final ArticleWrapper4Public article) 
				throws PersistenceException{
        getThis().getShop().startSelling(article, getThis());
    }
    public void stopSelling(final ArticleWrapper4Public article) 
				throws PersistenceException{
        getThis().getShop().stopSelling(article, getThis());
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    public void shop_update(final model.meta.ShopMssgs event)
            throws PersistenceException{
        getThis().signalChanged(true);
    }

    private boolean filter_startSelling(ArticleWrapper4Public anything) throws PersistenceException {
        return anything.getArticle().getState().accept(new ArticleStateReturnVisitor<Boolean>() {
            @Override
            public Boolean handleInSale(InSale4Public inSale) throws PersistenceException {
                return Boolean.FALSE;
            }

            @Override
            public Boolean handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
                return Boolean.TRUE;
            }

            @Override
            public Boolean handleNotInSale(NotInSale4Public notInSale) throws PersistenceException {
                return Boolean.TRUE;
            }

            @Override
            public Boolean handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
                return Boolean.TRUE;
            }
        });
    }

    private boolean filter_stopSelling(ArticleWrapper4Public anything) throws PersistenceException {
        return anything.getArticle().getState().accept(new ArticleStateReturnVisitor<Boolean>() {
            @Override
            public Boolean handleInSale(InSale4Public inSale) throws PersistenceException {
                return Boolean.TRUE;
            }

            @Override
            public Boolean handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
                return Boolean.FALSE;
            }

            @Override
            public Boolean handleNotInSale(NotInSale4Public notInSale) throws PersistenceException {
                return Boolean.FALSE;
            }

            @Override
            public Boolean handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
                return Boolean.FALSE;
            }
        });
    }


    /* End of protected part that is not overridden by persistence generator */
    
}