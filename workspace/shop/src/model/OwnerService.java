
package model;

import common.Fraction;
import model.meta.ReOrderManagerMssgsVisitor;
import model.meta.ShopAcceptOrderCustomerOrderManagerOrderMssg;
import model.meta.ShopChangeArticleNameArticleWrapperStringMssg;
import model.meta.ShopChangeArticlePriceArticleWrapperFractionMssg;
import model.meta.ShopChangeCustomerDeliveryTimePriceCustomerDeliveryTimeFractionMssg;
import model.meta.ShopChangeCustomerDeliveryTimeTimeCustomerDeliveryTimeIntegerMssg;
import model.meta.ShopCreateCustomerDeliveryTimeStringFractionIntegerMssg;
import model.meta.ShopCreateProducerStringMssg;
import model.meta.ShopMoveToComponentComponentContainerMssg;
import model.meta.ShopMssgsVisitor;
import model.meta.ShopNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssg;
import model.meta.ShopNewProductGroupComponentContainerStringMssg;
import model.meta.ShopOrderCartCustomerOrderManagerShoppingCartCustomerDeliveryTimeMssg;
import model.meta.ShopPreOrderCartCustomerOrderManagerShoppingCartCustomerDeliveryTimeMssg;
import model.meta.ShopStartSellingArticleWrapperMssg;
import model.meta.ShopStopSellingArticleWrapperMssg;
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
            AbstractPersistentRoot componentManager = (AbstractPersistentRoot)this.getComponentManager();
            if (componentManager != null) {
                result.put("componentManager", componentManager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    componentManager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && componentManager.hasEssentialFields())componentManager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot prmanager = (AbstractPersistentRoot)this.getPrmanager();
            if (prmanager != null) {
                result.put("prmanager", prmanager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    prmanager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && prmanager.hasEssentialFields())prmanager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
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
            AbstractPersistentRoot orderManager = (AbstractPersistentRoot)this.getOrderManager();
            if (orderManager != null) {
                result.put("orderManager", orderManager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    orderManager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && orderManager.hasEssentialFields())orderManager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
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
            AbstractPersistentRoot orderArchive = (AbstractPersistentRoot)this.getOrderArchive();
            if (orderArchive != null) {
                result.put("orderArchive", orderArchive.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    orderArchive.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && orderArchive.hasEssentialFields())orderArchive.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
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
                                  this.componentManager, 
                                  this.prmanager, 
                                  this.customerDeliveryTimeManager, 
                                  this.settings, 
                                  this.reOrderManager, 
                                  this.orderManager, 
                                  this.returnManager, 
                                  this.orderArchive, 
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
    protected PersistentComponentManager componentManager;
    protected PersistentProducerLst prmanager;
    protected PersistentCustomerDeliveryTimeManager customerDeliveryTimeManager;
    protected PersistentSettings settings;
    protected PersistentOwnerServiceReOrderManager reOrderManager;
    protected PersistentOwnerServiceOrderManager orderManager;
    protected PersistentReturnManager returnManager;
    protected PersistentGlobalOrderArchive orderArchive;
    
    public OwnerService(SubjInterface subService,PersistentService This,PersistentOwnerServiceShop shop,PersistentComponentManager componentManager,PersistentProducerLst prmanager,PersistentCustomerDeliveryTimeManager customerDeliveryTimeManager,PersistentSettings settings,PersistentOwnerServiceReOrderManager reOrderManager,PersistentOwnerServiceOrderManager orderManager,PersistentReturnManager returnManager,PersistentGlobalOrderArchive orderArchive,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((SubjInterface)subService,(PersistentService)This,id);
        this.shop = shop;
        this.componentManager = componentManager;
        this.prmanager = prmanager;
        this.customerDeliveryTimeManager = customerDeliveryTimeManager;
        this.settings = settings;
        this.reOrderManager = reOrderManager;
        this.orderManager = orderManager;
        this.returnManager = returnManager;
        this.orderArchive = orderArchive;        
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
        if(this.getComponentManager() != null){
            this.getComponentManager().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.componentManagerSet(this.getId(), getComponentManager());
        }
        if(this.getPrmanager() != null){
            this.getPrmanager().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.prmanagerSet(this.getId(), getPrmanager());
        }
        if(this.getCustomerDeliveryTimeManager() != null){
            this.getCustomerDeliveryTimeManager().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.customerDeliveryTimeManagerSet(this.getId(), getCustomerDeliveryTimeManager());
        }
        if(this.getSettings() != null){
            this.getSettings().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.settingsSet(this.getId(), getSettings());
        }
        if(this.reOrderManager != null){
            this.reOrderManager.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.reOrderManagerSet(this.getId(), reOrderManager);
        }
        if(this.orderManager != null){
            this.orderManager.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.orderManagerSet(this.getId(), orderManager);
        }
        if(this.getReturnManager() != null){
            this.getReturnManager().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.returnManagerSet(this.getId(), getReturnManager());
        }
        if(this.getOrderArchive() != null){
            this.getOrderArchive().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.orderArchiveSet(this.getId(), getOrderArchive());
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
    public ComponentManager4Public getComponentManager() throws PersistenceException {
        return this.componentManager;
    }
    public void setComponentManager(ComponentManager4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.componentManager)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.componentManager = (PersistentComponentManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.componentManagerSet(this.getId(), newValue);
        }
    }
    public ProducerLst4Public getPrmanager() throws PersistenceException {
        return this.prmanager;
    }
    public void setPrmanager(ProducerLst4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.prmanager)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.prmanager = (PersistentProducerLst)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.prmanagerSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.customerDeliveryTimeManagerSet(this.getId(), newValue);
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
    public void setReOrderManager(OwnerServiceReOrderManager4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.reOrderManager)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.reOrderManager = (PersistentOwnerServiceReOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.reOrderManagerSet(this.getId(), newValue);
        }
    }
    public void setOrderManager(OwnerServiceOrderManager4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.orderManager)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.orderManager = (PersistentOwnerServiceOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.orderManagerSet(this.getId(), newValue);
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
    public GlobalOrderArchive4Public getOrderArchive() throws PersistenceException {
        return this.orderArchive;
    }
    public void setOrderArchive(GlobalOrderArchive4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.orderArchive)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.orderArchive = (PersistentGlobalOrderArchive)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.orderArchiveSet(this.getId(), newValue);
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
        if (this.getComponentManager() != null) return 1;
        if (this.getPrmanager() != null) return 1;
        if (this.getCustomerDeliveryTimeManager() != null) return 1;
        if (this.getSettings() != null) return 1;
        if (this.getReOrderManager() != null) return 1;
        if (this.getOrderManager() != null) return 1;
        if (this.getReturnManager() != null) return 1;
        if (this.getOrderArchive() != null) return 1;
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
    public GlobalOrderManager4Public getOrderManager() 
				throws PersistenceException{
        if (this.orderManager== null) return null;
		return this.orderManager.getObservee();
    }
    public ReOrderManager4Public getReOrderManager() 
				throws PersistenceException{
        if (this.reOrderManager== null) return null;
		return this.reOrderManager.getObservee();
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
    public void setOrderManager(final GlobalOrderManager4Public orderManager) 
				throws PersistenceException{
        if (this.orderManager == null) {
			this.setOrderManager(model.OwnerServiceOrderManager.createOwnerServiceOrderManager(this.isDelayed$Persistence()));
			this.orderManager.setObserver(getThis());
		}
		this.orderManager.setObservee(orderManager);
    }
    public void setReOrderManager(final ReOrderManager4Public reOrderManager) 
				throws PersistenceException{
        if (this.reOrderManager == null) {
			this.setReOrderManager(model.OwnerServiceReOrderManager.createOwnerServiceReOrderManager(this.isDelayed$Persistence()));
			this.reOrderManager.setObserver(getThis());
		}
		this.reOrderManager.setObservee(reOrderManager);
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
				throws model.InvalidInputException, PersistenceException{
       getThis().getShop().changeArticlePrice(article, newPrice, getThis());
    }
    public void changeArticleProducerDeliveryTime(final ArticleWrapper4Public article, final long newValue) 
				throws model.InvalidInputException, PersistenceException{
        article.getArticle().changeProducerDeliveryTime(newValue);
        getThis().signalChanged(true);
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
    public void createCustomerDeliveryTime(final CustomerDeliveryTimeManager4Public customerDeliveryTimeManager, final String name, final common.Fraction price, final long time) 
				throws model.DoubleDefinitionException, model.InvalidInputException, PersistenceException{
        getThis().getShop().createCustomerDeliveryTime(name, price, time, getThis());
        
    }
    public void createProducer(final ProducerLst4Public prmanager, final String name) 
				throws model.DoubleDefinitionException, model.InvalidInputException, PersistenceException{
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
        //Method is only for testing
        article.getArticle().increaseStock(quantity);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();

        getThis().setSettings(Settings.getTheSettings());
        getThis().setReOrderManager(ReOrderManager.getTheReOrderManager());
        getThis().setOrderManager(GlobalOrderManager.getTheGlobalOrderManager());
        getThis().setReturnManager(ReturnManager.getTheReturnManager());
        getThis().setShop(Shop.getTheShop());
        getThis().setComponentManager(ComponentManager.getTheComponentManager());
        getThis().setPrmanager(ProducerLst.getTheProducerLst());
        getThis().setCustomerDeliveryTimeManager(CustomerDeliveryTimeManager.getTheCustomerDeliveryTimeManager());

        getThis().setOrderArchive(GlobalOrderArchive.getTheGlobalOrderArchive());
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
    public void orderManager_update(final model.meta.GlobalOrderManagerMssgs event) 
				throws PersistenceException{
        getThis().signalChanged(true);
        
    }
    public void reOrderManager_update(final model.meta.ReOrderManagerMssgs event) 
				throws PersistenceException{

        getThis().signalChanged(true);
    }
    public void reduceArticleStock(final ArticleWrapper4Public article, final long quantity) 
				throws model.NotEnoughStockException, PersistenceException{
        //Only for testing
        article.getArticle().reduceStock(quantity);
    }
    public void shop_update(final model.meta.ShopMssgs event) 
				throws PersistenceException{

        getThis().signalChanged(true);
    }
    /* Start of protected part that is not overridden by persistence generator */

    public void startSelling(ArticleWrapper4Public article) throws PersistenceException {
        getThis().getShop().startSelling(article, getThis());
    }

    public void stopSelling(ArticleWrapper4Public article) throws PersistenceException {
        getThis().getShop().stopSelling(article, getThis());
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
