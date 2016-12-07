
package model;

import common.Fraction;
import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class Shop extends PersistentObject implements PersistentShop{
    
    private static Shop4Public theShop = null;
    public static boolean reset$For$Test = false;
    private static final Object $$lock = new Object();
    public static Shop4Public getTheShop() throws PersistenceException{
        if (theShop == null || reset$For$Test){
            if (reset$For$Test) theShop = null;
            class Initializer implements Runnable {
                PersistenceException exception = null;
                public void /* internal */ run(){
                    this.produceSingleton();
                }
                void produceSingleton() {
                    synchronized ($$lock){
                        try {
                            Shop4Public proxi = null;
                            proxi = ConnectionHandler.getTheConnectionHandler().theShopFacade.getTheShop();
                            theShop = proxi;
                            if(proxi.getId() < 0) {
                                ((AbstractPersistentRoot)proxi).setId(proxi.getId() * -1);
                                proxi.initialize(proxi, new java.util.HashMap<String,Object>());
                                proxi.initializeOnCreation();
                            }
                        } catch (PersistenceException e){
                            exception = e;
                        } finally {
                            $$lock.notify();
                        }
                        
                    }
                }
                Shop4Public getResult() throws PersistenceException{
                    synchronized ($$lock) {
                        if (exception == null && theShop== null) try {$$lock.wait();} catch (InterruptedException e) {}
                        if(exception != null) throw exception;
                        return theShop;
                    }
                }
                
            }
            reset$For$Test = false;
            Initializer initializer = new Initializer();
            new Thread(initializer).start();
            return initializer.getResult();
        }
        return theShop;
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
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public Shop provideCopy() throws PersistenceException{
        Shop result = this;
        result = new Shop(this.componentManager, 
                          this.prmanager, 
                          this.customerDeliveryTimeManager, 
                          this.subService, 
                          this.This, 
                          this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentComponentManager componentManager;
    protected PersistentProducerLst prmanager;
    protected PersistentCustomerDeliveryTimeManager customerDeliveryTimeManager;
    protected SubjInterface subService;
    protected PersistentShop This;
    
    public Shop(PersistentComponentManager componentManager,PersistentProducerLst prmanager,PersistentCustomerDeliveryTimeManager customerDeliveryTimeManager,SubjInterface subService,PersistentShop This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.componentManager = componentManager;
        this.prmanager = prmanager;
        this.customerDeliveryTimeManager = customerDeliveryTimeManager;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 428;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        // Singletons cannot be delayed!
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
            ConnectionHandler.getTheConnectionHandler().theShopFacade.componentManagerSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theShopFacade.prmanagerSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theShopFacade.customerDeliveryTimeManagerSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theShopFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentShop newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentShop)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentShop getThis() throws PersistenceException {
        if(this.This == null){
            PersistentShop result = (PersistentShop)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentShop)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShop(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShop(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShop(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShop(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShop(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShop(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShop(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShop(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getComponentManager() != null) return 1;
        if (this.getPrmanager() != null) return 1;
        if (this.getCustomerDeliveryTimeManager() != null) return 1;
        return 0;
    }
    
    
    public void changeArticleName(final ArticleWrapper4Public article, final String newName) 
				throws PersistenceException{
        model.meta.ShopChangeArticleNameArticleWrapperStringMssg event = new model.meta.ShopChangeArticleNameArticleWrapperStringMssg(article, newName, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void changeArticleName(final ArticleWrapper4Public article, final String newName, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		ChangeArticleNameCommand4Public command = model.meta.ChangeArticleNameCommand.createChangeArticleNameCommand(newName, now, now);
		command.setArticle(article);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void changeArticlePrice(final ArticleWrapper4Public article, final common.Fraction newPrice) 
				throws PersistenceException{
        model.meta.ShopChangeArticlePriceArticleWrapperFractionMssg event = new model.meta.ShopChangeArticlePriceArticleWrapperFractionMssg(article, newPrice, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void changeArticlePrice(final ArticleWrapper4Public article, final common.Fraction newPrice, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		ChangeArticlePriceCommand4Public command = model.meta.ChangeArticlePriceCommand.createChangeArticlePriceCommand(newPrice, now, now);
		command.setArticle(article);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void changeCustomerDeliveryTimePrice(final CustomerDeliveryTime4Public customerDeliveryTime, final common.Fraction newValue) 
				throws PersistenceException{
        model.meta.ShopChangeCustomerDeliveryTimePriceCustomerDeliveryTimeFractionMssg event = new model.meta.ShopChangeCustomerDeliveryTimePriceCustomerDeliveryTimeFractionMssg(customerDeliveryTime, newValue, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void changeCustomerDeliveryTimePrice(final CustomerDeliveryTime4Public customerDeliveryTime, final common.Fraction newValue, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		ChangeCustomerDeliveryTimePriceCommand4Public command = model.meta.ChangeCustomerDeliveryTimePriceCommand.createChangeCustomerDeliveryTimePriceCommand(newValue, now, now);
		command.setCustomerDeliveryTime(customerDeliveryTime);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void changeCustomerDeliveryTimeTime(final CustomerDeliveryTime4Public customerDeliveryTime, final long newValue) 
				throws PersistenceException{
        model.meta.ShopChangeCustomerDeliveryTimeTimeCustomerDeliveryTimeIntegerMssg event = new model.meta.ShopChangeCustomerDeliveryTimeTimeCustomerDeliveryTimeIntegerMssg(customerDeliveryTime, newValue, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void changeCustomerDeliveryTimeTime(final CustomerDeliveryTime4Public customerDeliveryTime, final long newValue, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		ChangeCustomerDeliveryTimeTimeCommand4Public command = model.meta.ChangeCustomerDeliveryTimeTimeCommand.createChangeCustomerDeliveryTimeTimeCommand(newValue, now, now);
		command.setCustomerDeliveryTime(customerDeliveryTime);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void createCustomerDeliveryTime(final String name, final common.Fraction price, final long time) 
				throws model.DoubleDefinitionException, PersistenceException{
        model.meta.ShopCreateCustomerDeliveryTimeStringFractionIntegerMssg event = new model.meta.ShopCreateCustomerDeliveryTimeStringFractionIntegerMssg(name, price, time, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void createCustomerDeliveryTime(final String name, final common.Fraction price, final long time, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		CreateCustomerDeliveryTimeCommand4Public command = model.meta.CreateCustomerDeliveryTimeCommand.createCreateCustomerDeliveryTimeCommand(name, price, time, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void createProducer(final String name) 
				throws model.DoubleDefinitionException, PersistenceException{
        model.meta.ShopCreateProducerStringMssg event = new model.meta.ShopCreateProducerStringMssg(name, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
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
        this.setThis((PersistentShop)This);
		if(this.isTheSameAs(This)){
		}
    }
    public void moveTo(final Component4Public component, final ComponentContainer newParentGroup) 
				throws model.CycleException, PersistenceException{
        model.meta.ShopMoveToComponentComponentContainerMssg event = new model.meta.ShopMoveToComponentComponentContainerMssg(component, newParentGroup, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void moveTo(final Component4Public component, final ComponentContainer newParentGroup, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		MoveToCommand4Public command = model.meta.MoveToCommand.createMoveToCommand(now, now);
		command.setComponent(component);
		command.setNewParentGroup(newParentGroup);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void newArticle(final ComponentContainer parent, final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        model.meta.ShopNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssg event = new model.meta.ShopNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssg(parent, name, price, minStock, maxStock, producerDeliveryTime, producer, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void newArticle(final ComponentContainer parent, final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		NewArticleCommand4Public command = model.meta.NewArticleCommand.createNewArticleCommand(name, price, minStock, maxStock, producerDeliveryTime, now, now);
		command.setParent(parent);
		command.setProducer(producer);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void newProductGroup(final ComponentContainer parent, final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        model.meta.ShopNewProductGroupComponentContainerStringMssg event = new model.meta.ShopNewProductGroupComponentContainerStringMssg(parent, name, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void newProductGroup(final ComponentContainer parent, final String name, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		NewProductGroupCommand4Public command = model.meta.NewProductGroupCommand.createNewProductGroupCommand(name, now, now);
		command.setParent(parent);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void newProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        model.meta.ShopNewProductGroupStringMssg event = new model.meta.ShopNewProductGroupStringMssg(name, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
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
    public void startSelling(final ArticleWrapper4Public article) 
				throws PersistenceException{
        model.meta.ShopStartSellingArticleWrapperMssg event = new model.meta.ShopStartSellingArticleWrapperMssg(article, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void startSelling(final ArticleWrapper4Public article, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		StartSellingCommand4Public command = model.meta.StartSellingCommand.createStartSellingCommand(now, now);
		command.setArticle(article);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void stopSelling(final ArticleWrapper4Public article) 
				throws PersistenceException{
        model.meta.ShopStopSellingArticleWrapperMssg event = new model.meta.ShopStopSellingArticleWrapperMssg(article, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void stopSelling(final ArticleWrapper4Public article, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		StopSellingCommand4Public command = model.meta.StopSellingCommand.createStopSellingCommand(now, now);
		command.setArticle(article);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
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
    
    public void changeArticleNameImplementation(final ArticleWrapper4Public article, final String newName) 
				throws PersistenceException{
        article.getArticle().setName(newName);
    }
    public void changeArticlePriceImplementation(final ArticleWrapper4Public article, final common.Fraction newPrice) 
				throws PersistenceException{
        article.getArticle().setPrice(newPrice);
    }
    public void changeCustomerDeliveryTimePriceImplementation(final CustomerDeliveryTime4Public customerDeliveryTime, final common.Fraction newValue) 
				throws PersistenceException{
        customerDeliveryTime.setPrice(newValue);
    }
    public void changeCustomerDeliveryTimeTimeImplementation(final CustomerDeliveryTime4Public customerDeliveryTime, final long newValue) 
				throws PersistenceException{
        customerDeliveryTime.setDeliveryTime(newValue);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void createCustomerDeliveryTimeImplementation(final String name, final common.Fraction price, final long time) 
				throws model.DoubleDefinitionException, PersistenceException{
        getThis().getCustomerDeliveryTimeManager().createCustomerDeliveryTime(name, price, time);
    }
    public void createProducerImplementation(final String name) 
				throws model.DoubleDefinitionException, PersistenceException{
        getThis().getPrmanager().createProducer(name);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        getThis().setComponentManager(ComponentManager.getTheComponentManager());
        getThis().setPrmanager(ProducerLst.getTheProducerLst());
        getThis().setCustomerDeliveryTimeManager(CustomerDeliveryTimeManager.getTheCustomerDeliveryTimeManager());


        try {

            Producer4Public producer4PublicHermann = getThis().getPrmanager().createProducer("Obstbauer Hermann");
            Producer4Public producer4PublicPeter = getThis().getPrmanager().createProducer("Obstbauer Peter");
            Article4Public testArt = Article.createArticle("TestArt", new Fraction(5),10, 100, 4, producer4PublicHermann);
            testArt.startSelling();
            testArt.increaseStock(20);


            getThis().getComponentManager().addComponent(ArticleWrapper.createArticleWrapper(getThis().getComponentManager(), testArt));



            try {
                ProductGroup4Public groupKernobst = getComponentManager().newProductGroup("Kernobst");

                ProductGroup4Public groupKernobstBirnen = groupKernobst.newProductGroup("Kernobst");

                groupKernobstBirnen.newArticle("Europäische Birne", new Fraction(10), 10, 100, 2,producer4PublicPeter);
                groupKernobstBirnen.newArticle("Nashi-Birne", new Fraction(12), 4, 40, 5, producer4PublicHermann);

                ProductGroup4Public groupSteinobst = getComponentManager().newProductGroup("Steinobst");

            } catch (CycleException e) {
                e.printStackTrace();
            } catch (DoubleDefinitionException e) {
                e.printStackTrace();
            }
        } catch (CycleException e) {
            e.printStackTrace();
        } catch (DoubleDefinitionException e) {
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
        //TODO: implement method: initializeOnInstantiation
        
    }
    public void moveToImplementation(final Component4Public component, final ComponentContainer newParentGroup) 
				throws model.CycleException, PersistenceException{
        component.moveTo(newParentGroup);
    }
    public void newArticleImplementation(final ComponentContainer parent, final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        parent.newArticle(name, price, minStock, maxStock, producerDeliveryTime, producer);
    }
    public void newProductGroupImplementation(final ComponentContainer parent, final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        parent.newProductGroup(name);
    }
    public void newProductGroupImplementation(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        getThis().getComponentManager().newProductGroup(name);
    }
    public void startSellingImplementation(final ArticleWrapper4Public article) 
				throws PersistenceException{
        article.getArticle().startSelling();
        
    }
    public void stopSellingImplementation(final ArticleWrapper4Public article) 
				throws PersistenceException{
        article.getArticle().stopSelling();
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
