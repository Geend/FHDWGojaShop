
package model;

import common.Fraction;
import constants.ShopConstants;
import model.meta.OrderMssgs;
import persistence.*;
import model.visitor.*;

import java.text.MessageFormat;
import java.util.Iterator;

/* Additional import section end */

public class GlobalOrderManager extends model.OrderManager implements PersistentGlobalOrderManager{
    
    private static GlobalOrderManager4Public theGlobalOrderManager = null;
    public static boolean reset$For$Test = false;
    private static final Object $$lock = new Object();
    public static GlobalOrderManager4Public getTheGlobalOrderManager() throws PersistenceException{
        if (theGlobalOrderManager == null || reset$For$Test){
            if (reset$For$Test) theGlobalOrderManager = null;
            class Initializer implements Runnable {
                PersistenceException exception = null;
                public void /* internal */ run(){
                    this.produceSingleton();
                }
                void produceSingleton() {
                    synchronized ($$lock){
                        try {
                            GlobalOrderManager4Public proxi = null;
                            proxi = ConnectionHandler.getTheConnectionHandler().theGlobalOrderManagerFacade.getTheGlobalOrderManager();
                            theGlobalOrderManager = proxi;
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
                GlobalOrderManager4Public getResult() throws PersistenceException{
                    synchronized ($$lock) {
                        if (exception == null && theGlobalOrderManager== null) try {$$lock.wait();} catch (InterruptedException e) {}
                        if(exception != null) throw exception;
                        return theGlobalOrderManager;
                    }
                }
                
            }
            reset$For$Test = false;
            Initializer initializer = new Initializer();
            new Thread(initializer).start();
            return initializer.getResult();
        }
        return theGlobalOrderManager;
    }
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            AbstractPersistentRoot myCONCBackgroundTask = (AbstractPersistentRoot)this.getMyCONCBackgroundTask();
            if (myCONCBackgroundTask != null) {
                result.put("myCONCBackgroundTask", myCONCBackgroundTask.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    myCONCBackgroundTask.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    myCONCBackgroundTask.toHashtable(allResults, depth, essentialLevel + 1, forGUI, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public GlobalOrderManager provideCopy() throws PersistenceException{
        GlobalOrderManager result = this;
        result = new GlobalOrderManager(this.subService, 
                                        this.This, 
                                        this.myCONCBackgroundTask, 
                                        this.getId());
        result.orders = this.orders.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return true;
    }
    protected PersistentBackgroundTask myCONCBackgroundTask;
    
    public GlobalOrderManager(SubjInterface subService,PersistentOrderManager This,PersistentBackgroundTask myCONCBackgroundTask,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((SubjInterface)subService,(PersistentOrderManager)This,id);
        this.myCONCBackgroundTask = myCONCBackgroundTask;        
    }
    
    static public long getTypeId() {
        return 343;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        // Singletons cannot be delayed!
    }
    
    public BackgroundTask4Public getMyCONCBackgroundTask() throws PersistenceException {
        return this.myCONCBackgroundTask;
    }
    public void setMyCONCBackgroundTask(BackgroundTask4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.myCONCBackgroundTask)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.myCONCBackgroundTask = (PersistentBackgroundTask)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theGlobalOrderManagerFacade.myCONCBackgroundTaskSet(this.getId(), newValue);
        }
    }
    public PersistentGlobalOrderManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentGlobalOrderManager result = (PersistentGlobalOrderManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentGlobalOrderManager)this.This;
    }
    public void delete$Me() throws PersistenceException{
        super.delete$Me();
        this.getMyCONCBackgroundTask().delete$Me();
    }
    
    public void accept(OrderManagerVisitor visitor) throws PersistenceException {
        visitor.handleGlobalOrderManager(this);
    }
    public <R> R accept(OrderManagerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleGlobalOrderManager(this);
    }
    public <E extends model.UserException>  void accept(OrderManagerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleGlobalOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(OrderManagerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleGlobalOrderManager(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleGlobalOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleGlobalOrderManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleGlobalOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleGlobalOrderManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleGlobalOrderManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleGlobalOrderManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleGlobalOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleGlobalOrderManager(this);
    }
    public void accept(BackgroundTaskVisitor visitor) throws PersistenceException {
        visitor.handleGlobalOrderManager(this);
    }
    public <R> R accept(BackgroundTaskReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleGlobalOrderManager(this);
    }
    public <E extends model.UserException>  void accept(BackgroundTaskExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleGlobalOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(BackgroundTaskReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleGlobalOrderManager(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getOrders().getLength() > 0) return 1;
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
    public void handleOrderArticlesInReturnOrderState(final Order4Public order, final ArticlesInReturnOrderState4Public articlesInReturnOrderState) 
				throws PersistenceException{
        model.meta.GlobalOrderManagerHandleOrderArticlesInReturnOrderStateOrderArticlesInReturnOrderStateMssg event = new model.meta.GlobalOrderManagerHandleOrderArticlesInReturnOrderStateOrderArticlesInReturnOrderStateMssg(order, articlesInReturnOrderState, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void handleOrderInTransitOrderState(final Order4Public order, final InTransitOrderState4Public inTransitOrderState) 
				throws PersistenceException{
        model.meta.GlobalOrderManagerHandleOrderInTransitOrderStateOrderInTransitOrderStateMssg event = new model.meta.GlobalOrderManagerHandleOrderInTransitOrderStateOrderInTransitOrderStateMssg(order, inTransitOrderState, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void handleOrderPreOrderState(final Order4Public order, final PreOrderState4Public preOrderState) 
				throws PersistenceException{
        model.meta.GlobalOrderManagerHandleOrderPreOrderStateOrderPreOrderStateMssg event = new model.meta.GlobalOrderManagerHandleOrderPreOrderStateOrderPreOrderStateMssg(order, preOrderState, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void handleOrderWaitingForAcceptOrderState(final Order4Public order, final WaitingForAcceptOrderState4Public waitingForAcceptOrderState) 
				throws PersistenceException{
        model.meta.GlobalOrderManagerHandleOrderWaitingForAcceptOrderStateOrderWaitingForAcceptOrderStateMssg event = new model.meta.GlobalOrderManagerHandleOrderWaitingForAcceptOrderStateOrderWaitingForAcceptOrderStateMssg(order, waitingForAcceptOrderState, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentGlobalOrderManager)This);
		if(this.isTheSameAs(This)){
			PersistentCONCBackgroundTask myCONCBackgroundTask = (PersistentCONCBackgroundTask) model.CONCBackgroundTask.createCONCBackgroundTask(this.isDelayed$Persistence(), (PersistentGlobalOrderManager)This);
			this.setMyCONCBackgroundTask(myCONCBackgroundTask);
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
    
    public void addOrder(final Order4Public order) 
				throws PersistenceException{
        getThis().getOrders().add(order);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        // TODO: implement method: copyingPrivateUserAttributes

    }
    public void finishOrder(final Order4Public order) 
				throws PersistenceException{
        order.setState(FinishedOrderState.createFinishedOrderState());
        getThis().getOrders().filter(x -> !x.equals(order));
        GlobalOrderArchive.getTheGlobalOrderArchive().addOrder(order);
    }
    public void handleOrderArticlesInReturnOrderStateImplementation(final Order4Public order, final ArticlesInReturnOrderState4Public articlesInReturnOrderState) 
				throws PersistenceException{
        if (articlesInReturnOrderState.getTicksLeft() == 1) {

            articlesInReturnOrderState.getArticleReturn().getReturnArticles().applyToAll(article -> {
                article.getArticle().getArticle().increaseStock(article.getQuantity());
            });
            ReturnManager.getTheReturnManager().removeArticleReturn(articlesInReturnOrderState.getArticleReturn());
            order.setState(FinishedOrderState.createFinishedOrderState());

        } else {
            articlesInReturnOrderState.setTicksLeft(articlesInReturnOrderState.getTicksLeft() - 1);
        }
    }
    public void handleOrderInTransitOrderStateImplementation(final Order4Public order, final InTransitOrderState4Public inTransitOrderState) 
				throws PersistenceException{
        if (inTransitOrderState.getTicksLeft() == 1) {
            order.setState(WaitingForAcceptOrderState.createWaitingForAcceptOrderState(ShopConstants.CUSTOMER_DELIVERY_ACCEPT_TIME));
        } else {
            inTransitOrderState.setTicksLeft(inTransitOrderState.getTicksLeft() - 1);
        }
    }
    public void handleOrderPreOrderStateImplementation(final Order4Public order, final PreOrderState4Public preOrderState) 
				throws PersistenceException{

        Iterator<OrderQuantifiedArticle4Public> iterator = order.getArticles().iterator();
        Boolean allPreOrdersFinished = true;
        while(iterator.hasNext())
        {
            OrderQuantifiedArticle4Public article = iterator.next();

            Boolean thisArticleIsFinished = article.getState().accept(new OrderQuantifiedArticleStateReturnVisitor<Boolean>() {
                @Override
                public Boolean handleOrderQuantifiedArticleMarkedForReturnState(OrderQuantifiedArticleMarkedForReturnState4Public orderQuantifiedArticleMarkedForReturnState)
                        throws PersistenceException {
                    return true;
                }

                @Override
                public Boolean handleOrderQuantifiedArticleNormalState(OrderQuantifiedArticleNormalState4Public orderQuantifiedArticleNormalState) throws PersistenceException {
                    return true;
                }

                @Override
                public Boolean handleOrderQuantifiedArticlePreOrder(OrderQuantifiedArticlePreOrder4Public orderQuantifiedArticlePreOrder) throws PersistenceException {
                    if (orderQuantifiedArticlePreOrder.getLeftQuantity() < article.getArticle().getArticle().getCurrentStock()) {
                        try {
                            article.getArticle().getArticle().reduceStock(orderQuantifiedArticlePreOrder.getLeftQuantity());
                        } catch (NotEnoughStockException e) {
                            // This shouldn't happen, because we just checked if we have enough stock
                            throw new Error(e);
                        }

                        orderQuantifiedArticlePreOrder.setLeftQuantity(0);
                        article.setState(OrderQuantifiedArticleNormalState.createOrderQuantifiedArticleNormalState());
                        return true;
                    } else {
                        return false;
                    }
                }
            });
            if(!thisArticleIsFinished) {
                allPreOrdersFinished = false;
            }
        }
        if(allPreOrdersFinished)
            order.setState(InTransitOrderState.createInTransitOrderState(order.getCustomerDeliveryTime().getDeliveryTime()));
    }
    public void handleOrderWaitingForAcceptOrderStateImplementation(final Order4Public order, final WaitingForAcceptOrderState4Public waitingForAcceptOrderState) 
				throws PersistenceException{
        // Wait for the client to accept the order
        if (waitingForAcceptOrderState.getTicksLeft() == 1) {
            // Return the entire order if the acceptTime elapsed

            ArticleReturn4Public articleReturn = ArticleReturn.createArticleReturn(order);

            order.getArticles().applyToAll(article -> {
                article.markForReturn();
                ReturnQuantifiedArticle4Public returnQuantifiedArticle4Public = ReturnQuantifiedArticle.createReturnQuantifiedArticle(article.getQuantity(), article.getArticle());

                articleReturn.addArticle(returnQuantifiedArticle4Public);

                Fraction newTotalPrice = order.getTotalPrice();
                newTotalPrice = newTotalPrice.sub(article.getArticlePriceAtOrderTime().mul(article.getQuantity()));
                newTotalPrice = newTotalPrice.add(article.getArticlePriceAtOrderTime().mul(article.getQuantity()).mul(order.getReturnPercentageAtOrderTime()));
                order.setTotalPrice(newTotalPrice);
            });


            order.getCustomerAccount().debitIgnoreLimit(order.getTotalPrice());
            order.setState(ArticlesInReturnOrderState.createArticlesInReturnOrderState(articleReturn, ShopConstants.DEFAULT_RETURN_TIME));
            ReturnManager.getTheReturnManager().addArticleReturn(articleReturn);

        } else {
            waitingForAcceptOrderState.setTicksLeft(waitingForAcceptOrderState.getTicksLeft() - 1);
        }
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
        BackgroundTaskManager.getTheBackgroundTaskManager().addTask(getThis());
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
    }
    public void startTask(final long tickTime) 
				throws PersistenceException{
        this.getMyCONCBackgroundTask().startTask(tickTime);
    }
    public void step() 
				throws PersistenceException{
        System.out.println(MessageFormat.format("Order Processing Tick. Currently {0} are being processed", getThis().getOrders().getLength()));

        getThis().getOrders().applyToAll(order -> {
            order.getState().accept(new OrderStatusVisitor() {
                @Override
                public void handleArticlesInReturnOrderState(ArticlesInReturnOrderState4Public articlesInReturnOrderState) throws PersistenceException {
                    handleOrderArticlesInReturnOrderState(order, articlesInReturnOrderState);
                }

                @Override
                public void handleCanceledOrderState(CanceledOrderState4Public canceledOrderState) throws PersistenceException {
                }

                @Override
                public void handleFinishedOrderState(FinishedOrderState4Public finishedOrderState) throws PersistenceException {
                }

                @Override
                public void handleInTransitOrderState(InTransitOrderState4Public inTransitOrderState) throws PersistenceException {
                    handleOrderInTransitOrderState(order, inTransitOrderState);
                }

                @Override
                public void handlePreOrderState(PreOrderState4Public preOrderState) throws PersistenceException {
                    handleOrderPreOrderState(order, preOrderState);
                }

                @Override
                public void handleProcessingOrderState(ProcessingOrderState4Public processingOrderState) throws PersistenceException {
                    // Nothing to do here
                }

                @Override
                public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderState4Public waitingForAcceptOrderState) throws PersistenceException {
                    handleOrderWaitingForAcceptOrderState(order, waitingForAcceptOrderState);
                }
            });
        });

        getThis().getOrders().filter(order ->
                order.getState().accept(new OrderStatusReturnVisitor<Boolean>() {
                    @Override
                    public Boolean handleArticlesInReturnOrderState(ArticlesInReturnOrderState4Public articlesInReturnOrderState) throws PersistenceException {
                        return true;
                    }

                    @Override
                    public Boolean handleCanceledOrderState(CanceledOrderState4Public canceledOrderState) throws PersistenceException {
                        GlobalOrderArchive.getTheGlobalOrderArchive().addOrder(order);
                        return false;
                    }

                    @Override
                    public Boolean handleFinishedOrderState(FinishedOrderState4Public finishedOrderState) throws PersistenceException {
                        GlobalOrderArchive.getTheGlobalOrderArchive().addOrder(order);
                        return false;
                    }

                    @Override
                    public Boolean handleInTransitOrderState(InTransitOrderState4Public inTransitOrderState) throws PersistenceException {
                        return true;
                    }

                    @Override
                    public Boolean handlePreOrderState(PreOrderState4Public preOrderState) throws PersistenceException {
                        return true;
                    }

                    @Override
                    public Boolean handleProcessingOrderState(ProcessingOrderState4Public processingOrderState) throws PersistenceException {
                        return true;
                    }

                    @Override
                    public Boolean handleWaitingForAcceptOrderState(WaitingForAcceptOrderState4Public waitingForAcceptOrderState) throws PersistenceException {
                        return true;
                    }
                }));
    }
    public void stopTask() 
				throws PersistenceException{
        this.getMyCONCBackgroundTask().stopTask();
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */

    /* End of protected part that is not overridden by persistence generator */
    
}
