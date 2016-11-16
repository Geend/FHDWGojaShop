
package model;

import persistence.*;
import model.visitor.*;

import java.text.MessageFormat;


/* Additional import section end */

public class OwnerArticleWrapper extends model.ArticleWrapper implements PersistentOwnerArticleWrapper{
    
    
    public static OwnerArticleWrapper4Public createOwnerArticleWrapper(Article4Public component) throws PersistenceException, CycleException{
        return createOwnerArticleWrapper(component,false);
    }
    
    public static OwnerArticleWrapper4Public createOwnerArticleWrapper(Article4Public component,boolean delayed$Persistence) throws PersistenceException, CycleException {
        PersistentOwnerArticleWrapper result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOwnerArticleWrapperFacade
                .newDelayedOwnerArticleWrapper();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOwnerArticleWrapperFacade
                .newOwnerArticleWrapper(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("component", component);
        try{
            result.initialize(result, final$$Fields);
            result.initializeOnCreation();            
        }catch(persistence.PersistenceExceptionCycleTunnel ce){
            throw ce.cycleException;
        }
        if(result.getThis().getComponent() == null)throw new PersistenceException("Field component in type OwnerArticleWrapper has not been initialized!",0);
        return result;
    }
    
    public static OwnerArticleWrapper4Public createOwnerArticleWrapper(Article4Public component,boolean delayed$Persistence,OwnerArticleWrapper4Public This) throws PersistenceException, CycleException {
        PersistentOwnerArticleWrapper result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOwnerArticleWrapperFacade
                .newDelayedOwnerArticleWrapper();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOwnerArticleWrapperFacade
                .newOwnerArticleWrapper(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("component", component);
        try{
            result.initialize(This, final$$Fields);
            result.initializeOnCreation();            
        }catch(persistence.PersistenceExceptionCycleTunnel ce){
            throw ce.cycleException;
        }
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            AbstractPersistentRoot article = (AbstractPersistentRoot)this.getArticle();
            if (article != null) {
                result.put("article", article.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    article.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && article.hasEssentialFields())article.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            result.put("name", this.getName());
            result.put("price", this.getPrice().toString());
            result.put("minStock", new Long(this.getMinStock()).toString());
            result.put("maxStock", new Long(this.getMaxStock()).toString());
            result.put("currentStock", new Long(this.getCurrentStock()).toString());
            result.put("producerDeliveryTime", new Long(this.getProducerDeliveryTime()).toString());
            result.put("currentState", this.getCurrentState());
            result.put("producerName", this.getProducerName());
            AbstractPersistentRoot state = (AbstractPersistentRoot)this.getState();
            if (state != null) {
                result.put("state", state.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    state.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && state.hasEssentialFields())state.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public OwnerArticleWrapper provideCopy() throws PersistenceException{
        OwnerArticleWrapper result = this;
        result = new OwnerArticleWrapper((PersistentArticle)this.component, 
                                         this.subService, 
                                         this.This, 
                                         this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    
    public OwnerArticleWrapper(PersistentArticle component,SubjInterface subService,PersistentComponentWrapper This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((PersistentArticle)component,(SubjInterface)subService,(PersistentComponentWrapper)This,id);        
    }
    
    static public long getTypeId() {
        return 295;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 295) ConnectionHandler.getTheConnectionHandler().theOwnerArticleWrapperFacade
            .newOwnerArticleWrapper(this.getId());
        super.store();
        
    }
    
    public PersistentOwnerArticleWrapper getThis() throws PersistenceException {
        if(this.This == null){
            PersistentOwnerArticleWrapper result = (PersistentOwnerArticleWrapper)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentOwnerArticleWrapper)this.This;
    }
    
    public void accept(ArticleWrapperVisitor visitor) throws PersistenceException {
        visitor.handleOwnerArticleWrapper(this);
    }
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public void accept(ComponentWrapperVisitor visitor) throws PersistenceException {
        visitor.handleOwnerArticleWrapper(this);
    }
    public <R> R accept(ComponentWrapperReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(ComponentWrapperExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(ComponentWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOwnerArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleOwnerArticleWrapper(this);
    }
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOwnerArticleWrapper(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getArticle() != null) return 1;
        return 0;
    }
    
    
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return getThis().containsCompHierarchy(part, new java.util.HashSet<CompHierarchyHIERARCHY>());
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        if(getThis().equals(part)) return true;
		if(visited.contains(getThis())) return false;
		if(getThis().getComponent() != null && getThis().getComponent().containsCompHierarchy(part, visited)) return true;
		visited.add(getThis());
		return false;
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
    public void increaseStock(final long quantity) 
				throws PersistenceException{
        model.meta.OwnerArticleWrapperIncreaseStockIntegerMssg event = new model.meta.OwnerArticleWrapperIncreaseStockIntegerMssg(quantity, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void increaseStock(final long quantity, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		IncreaseStockCommand4Public command = model.meta.IncreaseStockCommand.createIncreaseStockCommand(quantity, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentOwnerArticleWrapper)This);
		if(this.isTheSameAs(This)){
			try { this.setComponent((PersistentComponent)final$$Fields.get("component")); } catch (model.CycleException e){throw new persistence.PersistenceExceptionCycleTunnel(e);}
		}
    }
    public void reduceStock(final long quantity) 
				throws model.NotEnoughStockException, PersistenceException{
        model.meta.OwnerArticleWrapperReduceStockIntegerMssg event = new model.meta.OwnerArticleWrapperReduceStockIntegerMssg(quantity, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void reduceStock(final long quantity, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		ReduceStockCommand4Public command = model.meta.ReduceStockCommand.createReduceStockCommand(quantity, now, now);
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
    public void startSelling() 
				throws PersistenceException{
        model.meta.OwnerArticleWrapperStartSellingMssg event = new model.meta.OwnerArticleWrapperStartSellingMssg(getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void startSelling(final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		StartSellingCommand4Public command = model.meta.StartSellingCommand.createStartSellingCommand(now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void stopSelling() 
				throws PersistenceException{
        model.meta.OwnerArticleWrapperStopSellingMssg event = new model.meta.OwnerArticleWrapperStopSellingMssg(getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void stopSelling(final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		StopSellingCommand4Public command = model.meta.StopSellingCommand.createStopSellingCommand(now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return getThis().strategyCompHierarchy(strategy, new java.util.HashMap<CompHierarchyHIERARCHY,T>());
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        if (visited.containsKey(getThis())) return visited.get(getThis());
		T result$$component$$OwnerArticleWrapper = this.getComponent().strategyCompHierarchy(strategy, visited);
		T result = strategy.OwnerArticleWrapper$$finalize(getThis() ,result$$component$$OwnerArticleWrapper);
		visited.put(getThis(),result);
		return result;
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
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public Article4Public getArticle() 
				throws PersistenceException{
     return getComponent();
    }
    public String getCurrentState() 
				throws PersistenceException{
      return getComponent().getState().toString();
    }
    public long getCurrentStock() 
				throws PersistenceException{
        return getComponent().getCurrentStock();
    }
    public long getMaxStock() 
				throws PersistenceException{
      return getComponent().getMaxStock();
    }
    public long getMinStock() 
				throws PersistenceException{
      return getComponent().getMinStock();
    }
    public String getName() 
				throws PersistenceException{
      return getComponent().getName();
    }
    public common.Fraction getPrice() 
				throws PersistenceException{
      return getComponent().getPrice();
    }
    public long getProducerDeliveryTime() 
				throws PersistenceException{
      return getComponent().getProducerDeliveryTime();
    }
    public String getProducerName() 
				throws PersistenceException{
      return getComponent().getProducer().getName();
    }
    public ArticleState4Public getState() 
				throws PersistenceException{
       return getComponent().getState();
    }
    public void increaseStockImplementation(final long quantity) 
				throws PersistenceException{
        getThis().getComponent().setCurrentStock(getThis().getCurrentStock() + quantity);

        getThis().getComponent().getState().accept(new ArticleStateVisitor() {
            @Override
            public void handleInSale(InSale4Public inSale) throws PersistenceException {
                // Nothing special
            }

            @Override
            public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
                // Should not happen
            }

            @Override
            public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException {
                getThis().getComponent().setState(RemainingStock.createRemainingStock());
            }

            @Override
            public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
                // Should not happen
            }
        });
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
        getThis().getComponent().setState(NewCreated.createNewCreated());
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
        getThis().getComponent().setState(NewCreated.createNewCreated());

    }
    public void reduceStockImplementation(final long quantity) 
				throws model.NotEnoughStockException, PersistenceException{

        if (getThis().getComponent().getCurrentStock() >= quantity) {
            getThis().getComponent().setCurrentStock(getThis().getComponent().getCurrentStock() - quantity);

            if (getThis().getComponent().getCurrentStock() < getThis().getComponent().getMinStock()) {

                getThis().getComponent().getState().accept(new ArticleStateVisitor() {
                    @Override
                    public void handleInSale(InSale4Public inSale) throws PersistenceException {
                        // TODO! Nachbestellen
                    }

                    @Override
                    public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
                        // TODO! Call not possible
                    }

                    @Override
                    public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException {
                        // TODO! Call not possible
                    }

                    @Override
                    public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
                        if (getThis().getCurrentStock() == 0) {
                            getThis().getComponent().setState(NotInSale.createNotInSale());
                        }
                    }
                });

            }
        } else {
            throw new NotEnoughStockException(MessageFormat.format("Tried to reduce stock by {0}, but only {1} in stock", quantity, getThis().getCurrentStock()));
        }

    }
    public void startSellingImplementation() 
				throws PersistenceException{
        getThis().getComponent().setState(getThis().getComponent().getState().accept(new ArticleStateReturnVisitor<ArticleState4Public>() {
            @Override
            public ArticleState4Public handleInSale(InSale4Public inSale) throws PersistenceException {
                return null;
                // Should not happen
                // TODO! Throw a "ArticleAlreadyInSaleException"?
            }

            @Override
            public ArticleState4Public handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
                return InSale.createInSale();
            }

            @Override
            public ArticleState4Public handleNotInSale(NotInSale4Public notInSale) throws PersistenceException {
                return InSale.createInSale();
            }

            @Override
            public ArticleState4Public handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
                return InSale.createInSale();
            }
        }));
        
    }
    public void stopSellingImplementation() 
				throws PersistenceException{
        getThis().getComponent().setState(getThis().getComponent().getState().accept(new ArticleStateReturnVisitor<ArticleState4Public>() {
            @Override
            public ArticleState4Public handleInSale(InSale4Public inSale) throws PersistenceException {
                if(getThis().getCurrentStock() == 0)
                    return NotInSale.createNotInSale();
                else
                    return RemainingStock.createRemainingStock();
            }

            @Override
            public ArticleState4Public handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
                // Should not happen
                // TODO! Throw a "ArticleNotInSaleException"?
                return null;
            }

            @Override
            public ArticleState4Public handleNotInSale(NotInSale4Public notInSale) throws PersistenceException {
                // Should not happen
                // TODO! Throw a "ArticleNotInSaleException"?
                return null;
            }

            @Override
            public ArticleState4Public handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
                // Should not happen
                // TODO! Throw a "ArticleNotInSaleException"?
                return null;
            }
        }));
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
