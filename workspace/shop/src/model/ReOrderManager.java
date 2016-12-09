
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
    public static boolean reset$For$Test = false;
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
            result.put("reorderArticles", this.getReorderArticles().getObservee().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
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
    
    public ReOrderManager provideCopy() throws PersistenceException{
        ReOrderManager result = this;
        result = new ReOrderManager(this.reorderArticles, 
                                    this.This, 
                                    this.myCONCBackgroundTask, 
                                    this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return true;
    }
    protected PersistentReOrderManagerReorderArticles reorderArticles;
    protected PersistentReOrderManager This;
    protected PersistentBackgroundTask myCONCBackgroundTask;
    
    public ReOrderManager(PersistentReOrderManagerReorderArticles reorderArticles,PersistentReOrderManager This,PersistentBackgroundTask myCONCBackgroundTask,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.reorderArticles = reorderArticles;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;
        this.myCONCBackgroundTask = myCONCBackgroundTask;        
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
    
    public void setReorderArticles(ReOrderManagerReorderArticles4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.reorderArticles)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.reorderArticles = (PersistentReOrderManagerReorderArticles)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theReOrderManagerFacade.reorderArticlesSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theReOrderManagerFacade.myCONCBackgroundTaskSet(this.getId(), newValue);
        }
    }
    public PersistentReOrderManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentReOrderManager result = (PersistentReOrderManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentReOrderManager)this.This;
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentBackgroundTask)this.getMyCONCBackgroundTask()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentBackgroundTask)this.getMyCONCBackgroundTask()).setSubService(newValue);
    }
    public void delete$Me() throws PersistenceException{
        super.delete$Me();
        this.getMyCONCBackgroundTask().delete$Me();
    }
    
    public void accept(BackgroundTaskVisitor visitor) throws PersistenceException {
        visitor.handleReOrderManager(this);
    }
    public <R> R accept(BackgroundTaskReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderManager(this);
    }
    public <E extends model.UserException>  void accept(BackgroundTaskExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(BackgroundTaskReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderManager(this);
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
        if (this.getReorderArticles().getObservee().getLength() > 0) return 1;
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
    public void fireChange(final model.meta.ReOrderQuantifiedArticleMssgs evnt) 
				throws PersistenceException{
        model.meta.ReOrderManagerFireChangeReOrderQuantifiedArticleMssgsMssg event = new model.meta.ReOrderManagerFireChangeReOrderQuantifiedArticleMssgsMssg(evnt, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public ReOrderManagerReorderArticles4Public getReorderArticles() 
				throws PersistenceException{
        if (this.reorderArticles == null) {
			this.setReorderArticles(model.ReOrderManagerReorderArticles.createReOrderManagerReorderArticles(this.isDelayed$Persistence()));
			this.reorderArticles.setObserver(this);
		}
		return this.reorderArticles;
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentReOrderManager)This);
		if(this.isTheSameAs(This)){
			PersistentCONCBackgroundTask myCONCBackgroundTask = (PersistentCONCBackgroundTask) model.CONCBackgroundTask.createCONCBackgroundTask(this.isDelayed$Persistence(), (PersistentReOrderManager)This);
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
    public void step() 
				throws PersistenceException{
        this.getMyCONCBackgroundTask().step();
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
    public void fireChangeImplementation(final model.meta.ReOrderQuantifiedArticleMssgs evnt) 
				throws PersistenceException{
        //TODO: implement method: fireChangeImplementation
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        BackgroundTaskManager.getTheBackgroundTaskManager().addTask(getThis());

    }
    public void initializeOnInstantiation() 
				throws PersistenceException{

    }
    public void reOrderForPreorder(final ArticleWrapper4Public article, final long quantity) 
				throws PersistenceException{
        doReorder(article, quantity);
    }
    public void reOrderIfNecessary(final ArticleWrapper4Public article) 
				throws PersistenceException{
        if(article.getArticle().getCurrentStock() < article.getArticle().getMinStock()){
            article.getArticle().getState().accept(new ArticleStateVisitor() {
                @Override
                public void handleInSale(InSale4Public inSale) throws PersistenceException {
                    doReorder(article);
                }

                @Override
                public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
                    doReorder(article);
                }

                @Override
                public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException {
                    //Don't reorder articles that aren't in sale (this should actually never be called)
                }

                @Override
                public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
                    if(article.getArticle().getCurrentStock() == 0)
                        article.getArticle().setState(NotInSale.createNotInSale());
                }
            });
        }
    }
    public void reorderArticles_update(final model.meta.ReOrderQuantifiedArticleMssgs event) 
				throws PersistenceException{
        fireChange(event);
        System.out.println("reorderArticles_update");
    }
    public void startTask(final long tickTime) 
				throws PersistenceException{
        //TODO Check delegation to abstract class and overwrite if necessary!
        this.getMyCONCBackgroundTask().startTask(tickTime);
    }
    public void stepImplementation() 
				throws PersistenceException{
        System.out.println(MessageFormat.format("Reorder Tick. Currently {0} articles are getting reorderd", getThis().getReorderArticles().getLength()));


        getThis().getReorderArticles().applyToAll(orderArticle -> {
            orderArticle.setCountdown(orderArticle.getCountdown() - 1);
            if (orderArticle.getCountdown() == 0) {
                Article4Public article = orderArticle.getArticle().getArticle();
                article.setCurrentStock(article.getCurrentStock() + orderArticle.getQuantity());
            }
        });

        getThis().getReorderArticles().filter(orderArticle -> orderArticle.getCountdown() != 0);

    }
    public void stopTask() 
				throws PersistenceException{
        //TODO Check delegation to abstract class and overwrite if necessary!
        this.getMyCONCBackgroundTask().stopTask();
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */

    private void doReorder(ArticleWrapper4Public article) throws PersistenceException {
        long quantity = article.getArticle().getMaxStock() - article.getArticle().getCurrentStock();
        doReorder(article, quantity);
    }

    private void doReorder(ArticleWrapper4Public article, Long quantity) throws PersistenceException {
        ReOrderQuantifiedArticle4Public reOrderQuantifiedArticle = ReOrderQuantifiedArticle.createReOrderQuantifiedArticle(quantity, article);
        getThis().getReorderArticles().add(reOrderQuantifiedArticle);
    }
    /* End of protected part that is not overridden by persistence generator */
    
}
