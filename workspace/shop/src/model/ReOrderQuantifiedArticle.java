
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ReOrderQuantifiedArticle extends model.QuantifiedArticle implements PersistentReOrderQuantifiedArticle{
    
    
    public static ReOrderQuantifiedArticle4Public createReOrderQuantifiedArticle(long quantity,ArticleWrapper4Public article) throws PersistenceException{
        return createReOrderQuantifiedArticle(quantity,article,false);
    }
    
    public static ReOrderQuantifiedArticle4Public createReOrderQuantifiedArticle(long quantity,ArticleWrapper4Public article,boolean delayed$Persistence) throws PersistenceException {
        PersistentReOrderQuantifiedArticle result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theReOrderQuantifiedArticleFacade
                .newDelayedReOrderQuantifiedArticle(quantity,0,0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theReOrderQuantifiedArticleFacade
                .newReOrderQuantifiedArticle(quantity,0,0,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("quantity", quantity);
        final$$Fields.put("article", article);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static ReOrderQuantifiedArticle4Public createReOrderQuantifiedArticle(long quantity,ArticleWrapper4Public article,boolean delayed$Persistence,ReOrderQuantifiedArticle4Public This) throws PersistenceException {
        PersistentReOrderQuantifiedArticle result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theReOrderQuantifiedArticleFacade
                .newDelayedReOrderQuantifiedArticle(quantity,0,0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theReOrderQuantifiedArticleFacade
                .newReOrderQuantifiedArticle(quantity,0,0,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("quantity", quantity);
        final$$Fields.put("article", article);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("producerDeliveryTimeAtReorder", new Long(this.getProducerDeliveryTimeAtReorder()).toString());
            result.put("countdown", new Long(this.getCountdown()).toString());
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ReOrderQuantifiedArticle provideCopy() throws PersistenceException{
        ReOrderQuantifiedArticle result = this;
        result = new ReOrderQuantifiedArticle(this.quantity, 
                                              this.article, 
                                              this.subService, 
                                              this.This, 
                                              this.producerDeliveryTimeAtReorder, 
                                              this.countdown, 
                                              this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected long producerDeliveryTimeAtReorder;
    protected long countdown;
    
    public ReOrderQuantifiedArticle(long quantity,PersistentArticleWrapper article,SubjInterface subService,PersistentQuantifiedArticle This,long producerDeliveryTimeAtReorder,long countdown,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((long)quantity,(PersistentArticleWrapper)article,(SubjInterface)subService,(PersistentQuantifiedArticle)This,id);
        this.producerDeliveryTimeAtReorder = producerDeliveryTimeAtReorder;
        this.countdown = countdown;        
    }
    
    static public long getTypeId() {
        return 326;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 326) ConnectionHandler.getTheConnectionHandler().theReOrderQuantifiedArticleFacade
            .newReOrderQuantifiedArticle(quantity,producerDeliveryTimeAtReorder,countdown,this.getId());
        super.store();
        
    }
    
    public long getProducerDeliveryTimeAtReorder() throws PersistenceException {
        return this.producerDeliveryTimeAtReorder;
    }
    public void setProducerDeliveryTimeAtReorder(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theReOrderQuantifiedArticleFacade.producerDeliveryTimeAtReorderSet(this.getId(), newValue);
        this.producerDeliveryTimeAtReorder = newValue;
    }
    public long getCountdown() throws PersistenceException {
        return this.countdown;
    }
    public void setCountdown(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theReOrderQuantifiedArticleFacade.countdownSet(this.getId(), newValue);
        this.countdown = newValue;
    }
    public PersistentReOrderQuantifiedArticle getThis() throws PersistenceException {
        if(this.This == null){
            PersistentReOrderQuantifiedArticle result = (PersistentReOrderQuantifiedArticle)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentReOrderQuantifiedArticle)this.This;
    }
    
    public void accept(QuantifiedArticleVisitor visitor) throws PersistenceException {
        visitor.handleReOrderQuantifiedArticle(this);
    }
    public <R> R accept(QuantifiedArticleReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(QuantifiedArticleExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(QuantifiedArticleReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderQuantifiedArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleReOrderQuantifiedArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderQuantifiedArticle(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleReOrderQuantifiedArticle(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderQuantifiedArticle(this);
    }
    public int getLeafInfo() throws PersistenceException{
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
        this.setThis((PersistentReOrderQuantifiedArticle)This);
		if(this.isTheSameAs(This)){
			this.setQuantity((Long)final$$Fields.get("quantity"));
			this.setArticle((PersistentArticleWrapper)final$$Fields.get("article"));
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
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();

        getThis().setProducerDeliveryTimeAtReorder(getThis().getArticle().getArticle().getProducerDeliveryTime());
        getThis().setCountdown(getThis().getProducerDeliveryTimeAtReorder());
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
		//TODO: implement method: initializeOnInstantiation
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
