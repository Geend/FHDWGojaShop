
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ShoppingCartQuantifiedArticle extends model.QuantifiedArticle implements PersistentShoppingCartQuantifiedArticle{
    
    
    public static ShoppingCartQuantifiedArticle4Public createShoppingCartQuantifiedArticle(long quantity,ArticleWrapper4Public article) throws PersistenceException{
        return createShoppingCartQuantifiedArticle(quantity,article,false);
    }
    
    public static ShoppingCartQuantifiedArticle4Public createShoppingCartQuantifiedArticle(long quantity,ArticleWrapper4Public article,boolean delayed$Persistence) throws PersistenceException {
        PersistentShoppingCartQuantifiedArticle result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShoppingCartQuantifiedArticleFacade
                .newDelayedShoppingCartQuantifiedArticle(quantity);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShoppingCartQuantifiedArticleFacade
                .newShoppingCartQuantifiedArticle(quantity,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("quantity", quantity);
        final$$Fields.put("article", article);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static ShoppingCartQuantifiedArticle4Public createShoppingCartQuantifiedArticle(long quantity,ArticleWrapper4Public article,boolean delayed$Persistence,ShoppingCartQuantifiedArticle4Public This) throws PersistenceException {
        PersistentShoppingCartQuantifiedArticle result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShoppingCartQuantifiedArticleFacade
                .newDelayedShoppingCartQuantifiedArticle(quantity);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShoppingCartQuantifiedArticleFacade
                .newShoppingCartQuantifiedArticle(quantity,-1);
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
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ShoppingCartQuantifiedArticle provideCopy() throws PersistenceException{
        ShoppingCartQuantifiedArticle result = this;
        result = new ShoppingCartQuantifiedArticle(this.quantity, 
                                                   this.article, 
                                                   this.subService, 
                                                   this.This, 
                                                   this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    
    public ShoppingCartQuantifiedArticle(long quantity,PersistentArticleWrapper article,SubjInterface subService,PersistentQuantifiedArticle This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((long)quantity,(PersistentArticleWrapper)article,(SubjInterface)subService,(PersistentQuantifiedArticle)This,id);        
    }
    
    static public long getTypeId() {
        return 236;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 236) ConnectionHandler.getTheConnectionHandler().theShoppingCartQuantifiedArticleFacade
            .newShoppingCartQuantifiedArticle(quantity,this.getId());
        super.store();
        
    }
    
    public PersistentShoppingCartQuantifiedArticle getThis() throws PersistenceException {
        if(this.This == null){
            PersistentShoppingCartQuantifiedArticle result = (PersistentShoppingCartQuantifiedArticle)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentShoppingCartQuantifiedArticle)this.This;
    }
    
    public void accept(QuantifiedArticleVisitor visitor) throws PersistenceException {
        visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <R> R accept(QuantifiedArticleReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(QuantifiedArticleExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(QuantifiedArticleReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public int getLeafInfo() throws PersistenceException{
        return 0;
    }
    
    
    public void changeArticleQuantity(final long newQuantity, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		ChangeArticleQuantityCommand4Public command = model.meta.ChangeArticleQuantityCommand.createChangeArticleQuantityCommand(newQuantity, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
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
        this.setThis((PersistentShoppingCartQuantifiedArticle)This);
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
    
    public void changeArticleQuantity(final long newQuantity) 
				throws PersistenceException{
        //TODO! check if user input is valid
        getThis().setQuantity(newQuantity);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
		//TODO: implement method: initializeOnCreation
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
