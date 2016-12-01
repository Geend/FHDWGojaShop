
package model;

import com.sun.org.apache.xpath.internal.operations.Bool;
import persistence.*;
import model.visitor.*;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Additional import section end */

public class ReOrderManager extends PersistentObject implements PersistentReOrderManager{
    
    private static ReOrderManager4Public theReOrderManager = null;
    private static boolean reset$For$Test = false;
    private static final Object $$lock = new Object();
    public static ReOrderManager4Public getTheReOrderManager() throws PersistenceException{
        if (theReOrderManager == null || reset$For$Test){
            if (reset$For$Test) theReOrderManager = null;
            class Initializer implements Runnable {
                PersistenceException exception = null;
                public void /* internal */ run(){
                    this.produceSingleton();
                }
                void produceSingleton() {
                    synchronized ($$lock){
                        try {
                            ReOrderManager4Public proxi = null;
                            proxi = ConnectionHandler.getTheConnectionHandler().theReOrderManagerFacade.getTheReOrderManager();
                            theReOrderManager = proxi;
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
                ReOrderManager4Public getResult() throws PersistenceException{
                    synchronized ($$lock) {
                        if (exception == null && theReOrderManager== null) try {$$lock.wait();} catch (InterruptedException e) {}
                        if(exception != null) throw exception;
                        return theReOrderManager;
                    }
                }
                
            }
            reset$For$Test = false;
            Initializer initializer = new Initializer();
            new Thread(initializer).start();
            return initializer.getResult();
        }
        return theReOrderManager;
    }
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("reorderArticles", this.getReorderArticles().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ReOrderManager provideCopy() throws PersistenceException{
        ReOrderManager result = this;
        result = new ReOrderManager(this.subService, 
                                    this.This, 
                                    this.getId());
        result.reorderArticles = this.reorderArticles.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected ReOrderManager_ReorderArticlesProxi reorderArticles;
    protected SubjInterface subService;
    protected PersistentReOrderManager This;
    
    public ReOrderManager(SubjInterface subService,PersistentReOrderManager This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.reorderArticles = new ReOrderManager_ReorderArticlesProxi(this);
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 327;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        // Singletons cannot be delayed!
    }
    
    public ReOrderManager_ReorderArticlesProxi getReorderArticles() throws PersistenceException {
        return this.reorderArticles;
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
            ConnectionHandler.getTheConnectionHandler().theReOrderManagerFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentReOrderManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentReOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theReOrderManagerFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentReOrderManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentReOrderManager result = (PersistentReOrderManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentReOrderManager)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleReOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleReOrderManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderManager(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getReorderArticles().getLength() > 0) return 1;
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
										.inverseGetReOrderManager(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentReOrderManager)This);
		if(this.isTheSameAs(This)){
		}
    }
    public void reOrder(final ArticleWrapper4Public article, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		ReOrderCommand4Public command = model.meta.ReOrderCommand.createReOrderCommand(now, now);
		command.setArticle(article);
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
    public void startOrdering(final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		StartOrderingCommand4Public command = model.meta.StartOrderingCommand.createStartOrderingCommand(now, now);
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
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void initializeOnCreation() 
				throws PersistenceException{
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{

    }
    public void reOrder(final ArticleWrapper4Public article) 
				throws PersistenceException{

        long quantity = article.getArticle().getMaxStock() - article.getArticle().getCurrentStock();

        ReOrderQuantifiedArticle4Public reOrderQuantifiedArticle = ReOrderQuantifiedArticle.createReOrderQuantifiedArticle(quantity, article);

        getThis().getReorderArticles().add(reOrderQuantifiedArticle);

    }
    public void startOrdering() 
				throws PersistenceException{
        continueOrdering = true;

        Thread reOrderThread = new Thread(() -> {
            try {
                while (continueOrdering) {
                    System.out.println(MessageFormat.format("Reorder Tick. Currently {0} articles are getting reorderd", getThis().getReorderArticles().getLength()));


                    getThis().getReorderArticles().applyToAll(orderArticle -> {
                        orderArticle.setCountdown(orderArticle.getCountdown() - 1);
                        if (orderArticle.getCountdown() == 0) {
                            Article4Public article = orderArticle.getArticle().getArticle();
                            article.setCurrentStock(article.getCurrentStock() + orderArticle.getQuantity());
                        }
                    });

                    getThis().getReorderArticles().filter(orderArticle -> orderArticle.getCountdown() != 0);


                    getThis().getMyServer().signalChanged(true);
                    Thread.sleep(5000);
                }

            } catch (PersistenceException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        reOrderThread.start();
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    private Boolean continueOrdering = false;
    /* End of protected part that is not overridden by persistence generator */
    
}
