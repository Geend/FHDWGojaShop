
package model;

import constants.ShopConstants;
import persistence.*;
import model.visitor.*;

import java.text.MessageFormat;

/* Additional import section end */

public class OwnerOrderManager extends model.OrderManager implements PersistentOwnerOrderManager{
    
    private static OwnerOrderManager4Public theOwnerOrderManager = null;
    public static boolean reset$For$Test = false;
    private static final Object $$lock = new Object();
    public static OwnerOrderManager4Public getTheOwnerOrderManager() throws PersistenceException{
        if (theOwnerOrderManager == null || reset$For$Test){
            if (reset$For$Test) theOwnerOrderManager = null;
            class Initializer implements Runnable {
                PersistenceException exception = null;
                public void /* internal */ run(){
                    this.produceSingleton();
                }
                void produceSingleton() {
                    synchronized ($$lock){
                        try {
                            OwnerOrderManager4Public proxi = null;
                            proxi = ConnectionHandler.getTheConnectionHandler().theOwnerOrderManagerFacade.getTheOwnerOrderManager();
                            theOwnerOrderManager = proxi;
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
                OwnerOrderManager4Public getResult() throws PersistenceException{
                    synchronized ($$lock) {
                        if (exception == null && theOwnerOrderManager== null) try {$$lock.wait();} catch (InterruptedException e) {}
                        if(exception != null) throw exception;
                        return theOwnerOrderManager;
                    }
                }
                
            }
            reset$For$Test = false;
            Initializer initializer = new Initializer();
            new Thread(initializer).start();
            return initializer.getResult();
        }
        return theOwnerOrderManager;
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
    
    public OwnerOrderManager provideCopy() throws PersistenceException{
        OwnerOrderManager result = this;
        result = new OwnerOrderManager(this.subService, 
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
    
    public OwnerOrderManager(SubjInterface subService,PersistentOrderManager This,PersistentBackgroundTask myCONCBackgroundTask,long id) throws PersistenceException {
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
            ConnectionHandler.getTheConnectionHandler().theOwnerOrderManagerFacade.myCONCBackgroundTaskSet(this.getId(), newValue);
        }
    }
    public PersistentOwnerOrderManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentOwnerOrderManager result = (PersistentOwnerOrderManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentOwnerOrderManager)this.This;
    }
    public void delete$Me() throws PersistenceException{
        super.delete$Me();
        this.getMyCONCBackgroundTask().delete$Me();
    }
    
    public void accept(OrderManagerVisitor visitor) throws PersistenceException {
        visitor.handleOwnerOrderManager(this);
    }
    public <R> R accept(OrderManagerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerOrderManager(this);
    }
    public <E extends model.UserException>  void accept(OrderManagerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(OrderManagerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerOrderManager(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOwnerOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerOrderManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerOrderManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOwnerOrderManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerOrderManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerOrderManager(this);
    }
    public void accept(BackgroundTaskVisitor visitor) throws PersistenceException {
        visitor.handleOwnerOrderManager(this);
    }
    public <R> R accept(BackgroundTaskReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerOrderManager(this);
    }
    public <E extends model.UserException>  void accept(BackgroundTaskExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(BackgroundTaskReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerOrderManager(this);
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
    public OwnerService4Public getMyServer() 
				throws PersistenceException{
        OwnerServiceSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade
										.inverseGetOwnerOrderManager(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentOwnerOrderManager)This);
		if(this.isTheSameAs(This)){
			PersistentCONCBackgroundTask myCONCBackgroundTask = (PersistentCONCBackgroundTask) model.CONCBackgroundTask.createCONCBackgroundTask(this.isDelayed$Persistence(), (PersistentOwnerOrderManager)This);
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
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
        BackgroundTaskManager.getTheBackgroundTaskManager().addTask(getThis());
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
        // TODO: implement method: initializeOnInstantiation
    }
    public void startTask(final long tickTime) 
				throws PersistenceException{
        //TODO Check delegation to abstract class and overwrite if necessary!
        this.getMyCONCBackgroundTask().startTask(tickTime);
    }
    public void step() 
				throws PersistenceException{
        System.out.println(MessageFormat.format("Order Processing Tick. Currently {0} are being processed", getThis().getOrders().getLength()));

        getThis().getOrders().applyToAll(order -> {

            order.getState().accept(new OrderStateVisitor() {
                @Override
                public void handleArticlesInReturnOrderState(ArticlesInReturnOrderState4Public articlesInReturnOrderState) throws PersistenceException {
                    if(articlesInReturnOrderState.getTicksLeft() == 1){
                        //TODO! put back articles

                        

                        order.setState(FinishedOrderState.createFinishedOrderState());
                    }
                    else
                    {
                        articlesInReturnOrderState.setTicksLeft(articlesInReturnOrderState.getTicksLeft() - 1);
                    }
                }

                @Override
                public void handleFinishedOrderState(FinishedOrderState4Public finishedOrderState) throws PersistenceException {
                }

                @Override
                public void handleInTransitOrderState(InTransitOrderState4Public inTransitOrderState) throws PersistenceException {
                    if (inTransitOrderState.getTicksLeft() == 1) {
                        order.setState(WaitingForAcceptOrderState.createWaitingForAcceptOrderState(ShopConstants.CUSTOMER_DELIVERY_ACCEPT_TIME));
                    } else {
                        inTransitOrderState.setTicksLeft(inTransitOrderState.getTicksLeft() - 1);
                    }
                }

                @Override
                public void handlePreOrderState(PreOrderState4Public preOrderState) throws PersistenceException {
                    // TODO! Check if articles are available

                }

                @Override
                public void handleProcessingOrderState(ProcessingOrderState4Public processingOrderState) throws PersistenceException {
                    // Nothing to do here
                }

                @Override
                public void handleWaitingForAcceptOrderState(WaitingForAcceptOrderState4Public waitingForAcceptOrderState) throws PersistenceException {
                    // Wait for the client to accept the order
                    if (waitingForAcceptOrderState.getTicksLeft() == 1) {
                        //Return the entire order if the acceptTime elapsed
                        order.setState(FinishedOrderState.createFinishedOrderState());

                        ArticleReturn4Public articleReturn = ArticleReturn.createArticleReturn(order);

                        order.getArticles().applyToAll(article -> {
                            ReturnQuantifiedArticle4Public returnQuantifiedArticle4Public = ReturnQuantifiedArticle.createReturnQuantifiedArticle(article.getQuantity(),
                                    article.getArticle());

                            articleReturn.addArticle(returnQuantifiedArticle4Public);
                        });

                        ReturnManager.getTheReturnManager().addArticleReturn(articleReturn);

                    } else {
                        waitingForAcceptOrderState.setTicksLeft(waitingForAcceptOrderState.getTicksLeft() - 1);
                    }
                }
            });



        });
        getThis().getOrders().filter(order -> order.getState().accept(new OrderStateReturnVisitor<Boolean>() {
            @Override
            public Boolean handleArticlesInReturnOrderState(ArticlesInReturnOrderState4Public articlesInReturnOrderState) throws PersistenceException {
                return true;
            }

            @Override
            public Boolean handleFinishedOrderState(FinishedOrderState4Public finishedOrderState) throws PersistenceException {
                //TODO! Add to archive
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
        getThis().getMyServer().signalChanged(true);
    }
    public void stopTask() 
				throws PersistenceException{
        //TODO Check delegation to abstract class and overwrite if necessary!
        this.getMyCONCBackgroundTask().stopTask();
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    /* End of protected part that is not overridden by persistence generator */
    
}
