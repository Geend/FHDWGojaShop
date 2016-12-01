
package model;

import common.Fraction;
import persistence.*;
import model.visitor.*;

import java.security.acl.Owner;


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
            AbstractPersistentRoot prmanager = (AbstractPersistentRoot)this.getPrmanager();
            if (prmanager != null) {
                result.put("prmanager", prmanager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    prmanager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && prmanager.hasEssentialFields())prmanager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
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
                                  this.rootProductGroup, 
                                  this.customerDeliveryTimeManager, 
                                  this.prmanager, 
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
    protected PersistentRootProductGroup rootProductGroup;
    protected PersistentCustomerDeliveryTimeManager customerDeliveryTimeManager;
    protected PersistentProducerLst prmanager;
    protected PersistentSettings settings;
    protected PersistentReOrderManager reOrderManager;
    protected PersistentOwnerOrderManager ownerOrderManager;
    protected PersistentReturnManager returnManager;
    
    public OwnerService(SubjInterface subService,PersistentService This,PersistentRootProductGroup rootProductGroup,PersistentCustomerDeliveryTimeManager customerDeliveryTimeManager,PersistentProducerLst prmanager,PersistentSettings settings,PersistentReOrderManager reOrderManager,PersistentOwnerOrderManager ownerOrderManager,PersistentReturnManager returnManager,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((SubjInterface)subService,(PersistentService)This,id);
        this.rootProductGroup = rootProductGroup;
        this.customerDeliveryTimeManager = customerDeliveryTimeManager;
        this.prmanager = prmanager;
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
        if(this.getRootProductGroup() != null){
            this.getRootProductGroup().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.rootProductGroupSet(this.getId(), getRootProductGroup());
        }
        if(this.getCustomerDeliveryTimeManager() != null){
            this.getCustomerDeliveryTimeManager().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.customerDeliveryTimeManagerSet(this.getId(), getCustomerDeliveryTimeManager());
        }
        if(this.getPrmanager() != null){
            this.getPrmanager().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.prmanagerSet(this.getId(), getPrmanager());
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
    
    public RootProductGroup4Public getRootProductGroup() throws PersistenceException {
        return this.rootProductGroup;
    }
    public void setRootProductGroup(RootProductGroup4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.rootProductGroup)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.rootProductGroup = (PersistentRootProductGroup)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.rootProductGroupSet(this.getId(), newValue);
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
        if (this.getRootProductGroup() != null) return 1;
        if (this.getCustomerDeliveryTimeManager() != null) return 1;
        if (this.getPrmanager() != null) return 1;
        if (this.getSettings() != null) return 1;
        if (this.getReOrderManager() != null) return 1;
        if (this.getOwnerOrderManager() != null) return 1;
        if (this.getReturnManager() != null) return 1;
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
        article.changeArticleName(newName, getThis());
        getThis().signalChanged(true);
    }
    public void changeArticlePrice(final ArticleWrapper4Public article, final common.Fraction newPrice) 
				throws PersistenceException{
        article.changePrice(newPrice, getThis());
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
    public void createCustomerDeliveryTime(final String name, final common.Fraction price, final long time) 
				throws model.DoubleDefinitionException, PersistenceException{

        getThis().getCustomerDeliveryTimeManager().createCustomerDeliveryTime(name, price, time, getThis());
    }
    public void createProducer(final String name) 
				throws model.DoubleDefinitionException, PersistenceException{
        getThis().getPrmanager().createProducer(name, getThis());
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

        getThis().setPrmanager(ProducerLst.getTheProducerLst());
        getThis().setRootProductGroup(RootProductGroup.getTheRootProductGroup());
        getThis().setCustomerDeliveryTimeManager(CustomerDeliveryTimeManager.getTheCustomerDeliveryTimeManager());
        getThis().setSettings(Settings.getTheSettings());

        getThis().setReOrderManager(ReOrderManager.getTheReOrderManager());
        getThis().getReOrderManager().startOrdering(getThis());

        getThis().setOwnerOrderManager(OwnerOrderManager.getTheOwnerOrderManager());
        getThis().getOwnerOrderManager().startOrderProcessing();
        getThis().setReturnManager(ReturnManager.getTheReturnManager());

        getThis().getSettings().setNewCustomerDefaultBalance(new Fraction(42));
        getRootProductGroup().setName("Obst");

        try {


            Producer4Public producer4PublicHermann = getThis().getPrmanager().createProducer("Obstbauer Hermann");
            Producer4Public producer4PublicPeter = getThis().getPrmanager().createProducer("Obstbauer Peter");


            Article4Public testArt = Article.createArticle("TestArt", new Fraction(5),10, 100, 4, producer4PublicHermann);
            testArt.startSelling(getThis());
            testArt.increaseStock(20,getThis());

            getThis().getRootProductGroup().addComponent(ArticleWrapper.createArticleWrapper("TestArt", testArt, getThis().getRootProductGroup()));



            try {
                SubProductGroup4Public groupKernobst = SubProductGroup.createSubProductGroup("Kernobst", getRootProductGroup());

                getRootProductGroup().addComponent(groupKernobst);
                SubProductGroup4Public groupKernobstBirnen = SubProductGroup.createSubProductGroup("Birnen", groupKernobst);
                groupKernobst.addComponent(groupKernobstBirnen);

                groupKernobstBirnen.newArticle("Europäische Birne", new Fraction(10), 10, 100, 2,producer4PublicPeter);
                groupKernobstBirnen.newArticle("Nashi-Birne", new Fraction(12), 4, 40, 5, producer4PublicHermann);

                SubProductGroup4Public groupSteinobst = SubProductGroup.createSubProductGroup("Steinobst", getRootProductGroup());
                getRootProductGroup().addComponent(groupSteinobst);
            } catch (CycleException e) {
                e.printStackTrace();
            }
        } catch (DoubleDefinitionException doubleDefinition) {
            doubleDefinition.printStackTrace();
        } catch (CycleException e) {
            e.printStackTrace();
        }

        try {
            getThis().getCustomerDeliveryTimeManager().createCustomerDeliveryTime(
           "default" ,new Fraction(4), 3);
        } catch (DoubleDefinitionException e) {
            e.printStackTrace();
        }

    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
    }
    public void moveTo(final SubComponent component, final ProductGroup4Public newParentGroup) 
				throws model.CycleException, PersistenceException{
        component.moveTo(newParentGroup,getThis());
    }
    public void newArticle(final ProductGroup4Public parent, final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.CycleException, PersistenceException{
        parent.newArticle(name, price, minStock, maxStock, producerDeliveryTime, producer, getThis());
    }
    public void newProductGroup(final ProductGroup4Public parent, final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        parent.newSubProductGroup(name, getThis());

    }
    public void newProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        getThis().getRootProductGroup().newSubProductGroup(name, getThis());
    }
    public void reduceArticleStock(final ArticleWrapper4Public article, final long quantity) 
				throws model.NotEnoughStockException, PersistenceException{
        //TODO: implement method: reduceArticleStock
        
    }
    public void startSelling(final ArticleWrapper4Public article) 
				throws PersistenceException{
        article.getArticle().startSelling(getThis());
    }
    public void stopSelling(final ArticleWrapper4Public article) 
				throws PersistenceException{
        article.getArticle().stopSelling(getThis());
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */


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
