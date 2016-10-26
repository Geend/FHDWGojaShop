
package model;

import persistence.*;
import model.visitor.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;


/* Additional import section end */

public class ShoppingCartArticleWrapper extends model.ArticleWrapper implements PersistentShoppingCartArticleWrapper{
    
    
    public static PersistentShoppingCartArticleWrapper createShoppingCartArticleWrapper() throws PersistenceException{
        return createShoppingCartArticleWrapper(false);
    }
    
    public static PersistentShoppingCartArticleWrapper createShoppingCartArticleWrapper(boolean delayed$Persistence) throws PersistenceException {
        PersistentShoppingCartArticleWrapper result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShoppingCartArticleWrapperFacade
                .newDelayedShoppingCartArticleWrapper();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShoppingCartArticleWrapperFacade
                .newShoppingCartArticleWrapper(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentShoppingCartArticleWrapper createShoppingCartArticleWrapper(boolean delayed$Persistence,PersistentShoppingCartArticleWrapper This) throws PersistenceException {
        PersistentShoppingCartArticleWrapper result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShoppingCartArticleWrapperFacade
                .newDelayedShoppingCartArticleWrapper();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShoppingCartArticleWrapperFacade
                .newShoppingCartArticleWrapper(-1);
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
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ShoppingCartArticleWrapper provideCopy() throws PersistenceException{
        ShoppingCartArticleWrapper result = this;
        result = new ShoppingCartArticleWrapper(this.article, 
                                                this.This, 
                                                this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    
    public ShoppingCartArticleWrapper(PersistentArticle article,PersistentArticleWrapper This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((PersistentArticle)article,(PersistentArticleWrapper)This,id);        
    }
    
    static public long getTypeId() {
        return 163;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 163) ConnectionHandler.getTheConnectionHandler().theShoppingCartArticleWrapperFacade
            .newShoppingCartArticleWrapper(this.getId());
        super.store();
        
    }
    
    public PersistentShoppingCartArticleWrapper getThis() throws PersistenceException {
        if(this.This == null){
            PersistentShoppingCartArticleWrapper result = (PersistentShoppingCartArticleWrapper)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentShoppingCartArticleWrapper)this.This;
    }
    
    public void accept(ArticleWrapperVisitor visitor) throws PersistenceException {
        visitor.handleShoppingCartArticleWrapper(this);
    }
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShoppingCartArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShoppingCartArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShoppingCartArticleWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShoppingCartArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShoppingCartArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShoppingCartArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShoppingCartArticleWrapper(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getArticle() != null) return 1;
        return 0;
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentShoppingCartArticleWrapper)This);
		if(this.isTheSameAs(This)){
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }

    @Override
    public String getName() throws PersistenceException {
        throw new NotImplementedException(); //TODO
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
    public void removeFromCart() 
				throws PersistenceException{
        //TODO: implement method: removeFromCart
        
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
