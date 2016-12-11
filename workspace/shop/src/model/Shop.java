
package model;

import common.Fraction;
import constants.StringConstants;
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
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public Shop provideCopy() throws PersistenceException{
        Shop result = this;
        result = new Shop(this.subService, 
                          this.This, 
                          this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected SubjInterface subService;
    protected PersistentShop This;
    
    public Shop(SubjInterface subService,PersistentShop This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
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
        return 0;
    }
    
    
    public void acceptOrder(final CustomerOrderManager4Public manager, final Order4Public order) 
				throws model.OrderNotAcceptableException, model.NotEnoughMoneyException, PersistenceException{
        model.meta.ShopAcceptOrderCustomerOrderManagerOrderMssg event = new model.meta.ShopAcceptOrderCustomerOrderManagerOrderMssg(manager, order, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void acceptOrder(final CustomerOrderManager4Public manager, final Order4Public order, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		AcceptOrderCommand4Public command = model.meta.AcceptOrderCommand.createAcceptOrderCommand(now, now);
		command.setManager(manager);
		command.setOrder(order);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void changeArticleName(final ArticleWrapper4Public article, final String newName) 
				throws model.InvalidInputException, PersistenceException{
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
				throws model.InvalidInputException, PersistenceException{
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
				throws model.InvalidInputException, PersistenceException{
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
				throws model.InvalidInputException, PersistenceException{
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
				throws model.DoubleDefinitionException, model.InvalidInputException, PersistenceException{
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
    public Producer4Public createProducer(final String name) 
				throws model.DoubleDefinitionException, model.InvalidInputException, PersistenceException{
        model.meta.ShopCreateProducerStringMssg event = new model.meta.ShopCreateProducerStringMssg(name, getThis());
		event.execute();
		getThis().updateObservers(event);
		return event.getResult();
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
    public ArticleWrapper4Public newArticle(final ComponentContainer parent, final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.DoubleDefinitionException, model.InvalidInputException, model.CycleException, PersistenceException{
        model.meta.ShopNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssg event = new model.meta.ShopNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssg(parent, name, price, minStock, maxStock, producerDeliveryTime, producer, getThis());
		event.execute();
		getThis().updateObservers(event);
		return event.getResult();
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
    public ProductGroup4Public newProductGroup(final ComponentContainer parent, final String name) 
				throws model.DoubleDefinitionException, model.InvalidInputException, model.CycleException, PersistenceException{
        model.meta.ShopNewProductGroupComponentContainerStringMssg event = new model.meta.ShopNewProductGroupComponentContainerStringMssg(parent, name, getThis());
		event.execute();
		getThis().updateObservers(event);
		return event.getResult();
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
    public void orderCart(final CustomerOrderManager4Public manager, final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.ArticleOrderException, model.NotEnoughMoneyException, PersistenceException{
        model.meta.ShopOrderCartCustomerOrderManagerShoppingCartCustomerDeliveryTimeMssg event = new model.meta.ShopOrderCartCustomerOrderManagerShoppingCartCustomerDeliveryTimeMssg(manager, cart, customerDeliveryTime, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void orderCart(final CustomerOrderManager4Public manager, final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		OrderCartCommand4Public command = model.meta.OrderCartCommand.createOrderCartCommand(now, now);
		command.setManager(manager);
		command.setCart(cart);
		command.setCustomerDeliveryTime(customerDeliveryTime);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void preOrderCart(final CustomerOrderManager4Public manager, final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.NotEnoughMoneyException, model.ArticleNotInSaleException, PersistenceException{
        model.meta.ShopPreOrderCartCustomerOrderManagerShoppingCartCustomerDeliveryTimeMssg event = new model.meta.ShopPreOrderCartCustomerOrderManagerShoppingCartCustomerDeliveryTimeMssg(manager, cart, customerDeliveryTime, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void preOrderCart(final CustomerOrderManager4Public manager, final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PreOrderCartCommand4Public command = model.meta.PreOrderCartCommand.createPreOrderCartCommand(now, now);
		command.setManager(manager);
		command.setCart(cart);
		command.setCustomerDeliveryTime(customerDeliveryTime);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
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
    
    public void acceptOrderImplementation(final CustomerOrderManager4Public manager, final Order4Public order) 
				throws model.OrderNotAcceptableException, model.NotEnoughMoneyException, PersistenceException{
        manager.acceptOrder(order);
    }
    public void changeArticleNameImplementation(final ArticleWrapper4Public article, final String newName) 
				throws model.InvalidInputException, PersistenceException{
        if("".equals(newName))
            throw new InvalidInputException(StringConstants.ARTICLE_NAME_EMPTY_DEFINTION_EXCEPTION_TEXT);
        article.getArticle().setName(newName);
    }
    public void changeArticlePriceImplementation(final ArticleWrapper4Public article, final common.Fraction newPrice) 
				throws model.InvalidInputException, PersistenceException{
        article.getArticle().changePrice(newPrice);
    }
    public void changeCustomerDeliveryTimePriceImplementation(final CustomerDeliveryTime4Public customerDeliveryTime, final common.Fraction newValue) 
				throws model.InvalidInputException, PersistenceException{
        customerDeliveryTime.changePrice(newValue);
    }
    public void changeCustomerDeliveryTimeTimeImplementation(final CustomerDeliveryTime4Public customerDeliveryTime, final long newValue) 
				throws model.InvalidInputException, PersistenceException{
        customerDeliveryTime.changeTime(newValue);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        // TODO: implement method: copyingPrivateUserAttributes

    }
    public void createCustomerDeliveryTimeImplementation(final String name, final common.Fraction price, final long time) 
				throws model.DoubleDefinitionException, model.InvalidInputException, PersistenceException{
        CustomerDeliveryTimeManager.getTheCustomerDeliveryTimeManager().createCustomerDeliveryTime(name, price, time);
    }
    public Producer4Public createProducerImplementation(final String name) 
				throws model.DoubleDefinitionException, model.InvalidInputException, PersistenceException{
        return ProducerLst.getTheProducerLst().createProducer(name);
    }
    public void initializeOnCreation() 
				throws PersistenceException{

        makeTestData();
        BackgroundTaskManager.getTheBackgroundTaskManager().startTasks();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        // TODO: implement method: initializeOnInstantiation

    }
    public void moveToImplementation(final Component4Public component, final ComponentContainer newParentGroup) 
				throws model.CycleException, PersistenceException{
        component.moveTo(newParentGroup);
    }
    public ArticleWrapper4Public newArticleImplementation(final ComponentContainer parent, final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.DoubleDefinitionException, model.InvalidInputException, model.CycleException, PersistenceException{

        if(producerDeliveryTime < 1) {
            throw new InvalidInputException(StringConstants.PDT_GREATER_THAN_ZERO_MESSAGE);
        }
        return parent.newArticle(name, price, minStock, maxStock, producerDeliveryTime, producer);

    }
    public ProductGroup4Public newProductGroupImplementation(final ComponentContainer parent, final String name) 
				throws model.DoubleDefinitionException, model.InvalidInputException, model.CycleException, PersistenceException{
        return parent.newProductGroup(name);
    }
    public void orderCartImplementation(final CustomerOrderManager4Public manager, final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.ArticleOrderException, model.NotEnoughMoneyException, PersistenceException{
        manager.newOrder(cart, customerDeliveryTime);
        cart.empty();
    }
    public void preOrderCartImplementation(final CustomerOrderManager4Public manager, final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.NotEnoughMoneyException, model.ArticleNotInSaleException, PersistenceException{
        manager.newPreOrder(cart, customerDeliveryTime);
        cart.empty();
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
    private void makeTestData() throws PersistenceException {
        try {

            ComponentManager4Public componentManager = ComponentManager.getTheComponentManager();

            Producer4Public producer4PublicHermann = getThis().createProducer("Obstbauer Hermann");
            Producer4Public producer4PublicPeter = getThis().createProducer("Obstbauer Peter");


            ArticleWrapper4Public testArt = getThis().newArticle(componentManager, "TestArt", new Fraction(5), 10, 100, 4, producer4PublicHermann);
            testArt.getArticle().startSelling();
            // testArt.getArticle().increaseStock(20);

            ProductGroup4Public groupKernobst = getThis().newProductGroup(componentManager, "Kernobst");
            ProductGroup4Public groupKernobstBirnen = getThis().newProductGroup(groupKernobst, "Birnen");

            getThis().newArticle(groupKernobstBirnen, "Europäische Birne", new Fraction(10), 10, 100, 2, producer4PublicPeter);
            getThis().newArticle(groupKernobstBirnen, "Nashi-Birne", new Fraction(12), 4, 40, 5, producer4PublicHermann);

            ProductGroup4Public groupSteinobst = getThis().newProductGroup(componentManager,"Steinobst");


            CustomerDeliveryTimeManager.getTheCustomerDeliveryTimeManager().createCustomerDeliveryTime("default", new Fraction(4), 3);

        } catch (CycleException | DoubleDefinitionException e) {
            throw new Error(e);
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }


    }

    /* End of protected part that is not overridden by persistence generator */
    
}
