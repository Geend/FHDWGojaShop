
package model;

import persistence.*;
import model.visitor.*;

import java.util.Iterator;

/* Additional import section end */

public class ShoppingCart extends PersistentObject implements PersistentShoppingCart{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static ShoppingCart4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade.getClass(objectId);
        return (ShoppingCart4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static ShoppingCart4Public createShoppingCart() throws PersistenceException{
        return createShoppingCart(false);
    }
    
    public static ShoppingCart4Public createShoppingCart(boolean delayed$Persistence) throws PersistenceException {
        PersistentShoppingCart result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade
                .newDelayedShoppingCart();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade
                .newShoppingCart(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static ShoppingCart4Public createShoppingCart(boolean delayed$Persistence,ShoppingCart4Public This) throws PersistenceException {
        PersistentShoppingCart result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade
                .newDelayedShoppingCart();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade
                .newShoppingCart(-1);
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
            result.put("articles", this.getArticles().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ShoppingCart provideCopy() throws PersistenceException{
        ShoppingCart result = this;
        result = new ShoppingCart(this.subService, 
                                  this.This, 
                                  this.getId());
        result.articles = this.articles.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected ShoppingCart_ArticlesProxi articles;
    protected SubjInterface subService;
    protected PersistentShoppingCart This;
    
    public ShoppingCart(SubjInterface subService,PersistentShoppingCart This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.articles = new ShoppingCart_ArticlesProxi(this);
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 241;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 241) ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade
            .newShoppingCart(this.getId());
        super.store();
        this.getArticles().store();
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public ShoppingCart_ArticlesProxi getArticles() throws PersistenceException {
        return this.articles;
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
            ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentShoppingCart newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentShoppingCart)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentShoppingCart getThis() throws PersistenceException {
        if(this.This == null){
            PersistentShoppingCart result = (PersistentShoppingCart)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentShoppingCart)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShoppingCart(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShoppingCart(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShoppingCart(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShoppingCart(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShoppingCart(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShoppingCart(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShoppingCart(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShoppingCart(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getArticles().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void addArticle(final ShoppingCartQuantifiedArticle4Public article, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		AddArticleCommand4Public command = model.meta.AddArticleCommand.createAddArticleCommand(now, now);
		command.setArticle(article);
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
        this.setThis((PersistentShoppingCart)This);
		if(this.isTheSameAs(This)){
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
    public void removeArticle(final ShoppingCartQuantifiedArticle4Public article, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		RemoveArticleCommand4Public command = model.meta.RemoveArticleCommand.createRemoveArticleCommand(now, now);
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
    
    public void addArticle(final ShoppingCartQuantifiedArticle4Public article) 
				throws PersistenceException{
        if (article.getQuantity() > 0) {
            SearchListRoot<ShoppingCartQuantifiedArticle4Public> all = getThis().getArticles().findAll(x -> x.getArticle().equals(article.getArticle()));

            if(all.iterator().hasNext()) {
                all.iterator().next().increaseQuantity(article.getQuantity());
            }
            else {
                getThis().getArticles().add(article);
            }
        }
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void empty() 
				throws PersistenceException{
        getThis().getArticles().filter(x->false);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    public void removeArticle(final ShoppingCartQuantifiedArticle4Public article) 
				throws PersistenceException{
        getThis().getArticles().removeAll(article);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */

    /* End of protected part that is not overridden by persistence generator */
    
}
