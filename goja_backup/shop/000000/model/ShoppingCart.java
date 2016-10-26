
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ShoppingCart extends PersistentObject implements PersistentShoppingCart{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentShoppingCart getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade.getClass(objectId);
        return (PersistentShoppingCart)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentShoppingCart createShoppingCart() throws PersistenceException{
        return createShoppingCart(false);
    }
    
    public static PersistentShoppingCart createShoppingCart(boolean delayed$Persistence) throws PersistenceException {
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
    
    public static PersistentShoppingCart createShoppingCart(boolean delayed$Persistence,PersistentShoppingCart This) throws PersistenceException {
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
        result = new ShoppingCart(this.This, 
                                  this.getId());
        result.articles = this.articles.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected ShoppingCart_ArticlesProxi articles;
    protected PersistentShoppingCart This;
    
    public ShoppingCart(PersistentShoppingCart This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.articles = new ShoppingCart_ArticlesProxi(this);
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 152;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 152) ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade
            .newShoppingCart(this.getId());
        super.store();
        this.getArticles().store();
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public ShoppingCart_ArticlesProxi getArticles() throws PersistenceException {
        return this.articles;
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
    public int getLeafInfo() throws PersistenceException{
        if (this.getArticles().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentShoppingCart)This);
		if(this.isTheSameAs(This)){
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnCreation
        
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnInstantiation
        
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
