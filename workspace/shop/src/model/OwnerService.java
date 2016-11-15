
package model;

import common.Fraction;
import persistence.*;
import model.visitor.*;


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
            AbstractPersistentRoot prmanager = (AbstractPersistentRoot)this.getPrmanager();
            if (prmanager != null) {
                result.put("prmanager", prmanager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    prmanager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && prmanager.hasEssentialFields())prmanager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public OwnerService provideCopy() throws PersistenceException{
        OwnerService result = this;
        result = new OwnerService(this.rootProductGroup, 
                                  this.subService, 
                                  this.This, 
                                  this.prmanager, 
                                  this.getId());
        result.errors = this.errors.copy(result);
        result.errors = this.errors.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentProducerLst prmanager;
    
    public OwnerService(PersistentServiceRootProductGroup rootProductGroup,SubjInterface subService,PersistentService This,PersistentProducerLst prmanager,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((PersistentServiceRootProductGroup)rootProductGroup,(SubjInterface)subService,(PersistentService)This,id);
        this.prmanager = prmanager;        
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
        if(this.getPrmanager() != null){
            this.getPrmanager().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade.prmanagerSet(this.getId(), getPrmanager());
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
        if (this.getPrmanager() != null) return 1;
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
		if(anything instanceof Article4Public) {
			if(this.filter_startSelling((Article4Public)anything)) result = result + "startSellingPRMTRArticlePRMTR+++";
			if(this.filter_stopSelling((Article4Public)anything)) result = result + "stopSellingPRMTRArticlePRMTR+++";
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
    
    public void changeArticleMaxStock(final Article4Public article, final long newArticleMaxStock) 
				throws PersistenceException{
        article.setMaxStock(newArticleMaxStock);
        getThis().signalChanged(true);
    }
    public void changeArticleMinStock(final Article4Public article, final long newArticleMinStock) 
				throws PersistenceException{
        article.setMinStock(newArticleMinStock);
        getThis().signalChanged(true);

    }
    public void changeArticleName(final Article4Public article, final String newName) 
				throws PersistenceException{
        article.setName(newName);
        getThis().signalChanged(true);

    }
    public void changeArticlePrice(final Article4Public article, final common.Fraction newPrice) 
				throws PersistenceException{
        article.setPrice(newPrice);
        getThis().signalChanged(true);

    }
    public void connected(final String user) 
				throws PersistenceException{
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void createProducer(final String name) 
				throws model.DoubleDefinitionException, PersistenceException{
        getThis().getPrmanager().createProducer(name, getThis());
    }
    public void disconnected() 
				throws PersistenceException{
    }
    public void increaseArticleStock(final Article4Public article, final long quantity) 
				throws PersistenceException{
        article.increaseStock(quantity, getThis());
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();

        getThis().setPrmanager(ProducerLst.getTheProducerLst());
        getThis().setRootProductGroup(RootProductGroup.getTheRootProductGroup());


        try {


            Producer4Public producer4PublicHermann = getThis().getPrmanager().createProducer("Obstbauer Hermann");
            Producer4Public producer4PublicPeter = getThis().getPrmanager().createProducer("Obstbauer Peter");

            getRootProductGroup().setName("Obst");
            SubProductGroup4Public groupKernobst = SubProductGroup.createSubProductGroup("Kernobst", getRootProductGroup());
            try {
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
    public void reduceArticleStock(final Article4Public article, final long quantity) 
				throws PersistenceException{
        article.reduceStock(quantity, getThis());
    }
    public void startSelling(final Article4Public article) 
				throws PersistenceException{
        article.startSelling(getThis());
    }
    public void stopSelling(final Article4Public article) 
				throws PersistenceException{
        article.stopSelling(getThis());
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    private boolean filter_startSelling(Article4Public anything) throws PersistenceException {
        return anything.getState().accept(new ArticleStateReturnVisitor<Boolean>() {
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

    private boolean filter_stopSelling(Article4Public anything) throws PersistenceException {
        return anything.getState().accept(new ArticleStateReturnVisitor<Boolean>() {
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
