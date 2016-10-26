
package model;

import persistence.*;
import model.visitor.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;


/* Additional import section end */

public class OrderArticleWrapper extends model.ArticleWrapper implements PersistentOrderArticleWrapper{
    
    
    public static PersistentOrderArticleWrapper createOrderArticleWrapper() throws PersistenceException{
        return createOrderArticleWrapper(false);
    }
    
    public static PersistentOrderArticleWrapper createOrderArticleWrapper(boolean delayed$Persistence) throws PersistenceException {
        PersistentOrderArticleWrapper result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOrderArticleWrapperFacade
                .newDelayedOrderArticleWrapper(common.Fraction.Null);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOrderArticleWrapperFacade
                .newOrderArticleWrapper(common.Fraction.Null,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentOrderArticleWrapper createOrderArticleWrapper(boolean delayed$Persistence,PersistentOrderArticleWrapper This) throws PersistenceException {
        PersistentOrderArticleWrapper result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOrderArticleWrapperFacade
                .newDelayedOrderArticleWrapper(common.Fraction.Null);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOrderArticleWrapperFacade
                .newOrderArticleWrapper(common.Fraction.Null,-1);
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
            result.put("priceAtOrder", this.getPriceAtOrder().toString());
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public OrderArticleWrapper provideCopy() throws PersistenceException{
        OrderArticleWrapper result = this;
        result = new OrderArticleWrapper(this.article, 
                                         this.This, 
                                         this.priceAtOrder, 
                                         this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected common.Fraction priceAtOrder;
    
    public OrderArticleWrapper(PersistentArticle article,PersistentArticleWrapper This,common.Fraction priceAtOrder,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((PersistentArticle)article,(PersistentArticleWrapper)This,id);
        this.priceAtOrder = priceAtOrder;        
    }
    
    static public long getTypeId() {
        return 167;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 167) ConnectionHandler.getTheConnectionHandler().theOrderArticleWrapperFacade
            .newOrderArticleWrapper(priceAtOrder,this.getId());
        super.store();
        
    }
    
    public common.Fraction getPriceAtOrder() throws PersistenceException {
        return this.priceAtOrder;
    }
    public void setPriceAtOrder(common.Fraction newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theOrderArticleWrapperFacade.priceAtOrderSet(this.getId(), newValue);
        this.priceAtOrder = newValue;
    }
    public PersistentOrderArticleWrapper getThis() throws PersistenceException {
        if(this.This == null){
            PersistentOrderArticleWrapper result = (PersistentOrderArticleWrapper)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentOrderArticleWrapper)this.This;
    }
    
    public void accept(ArticleWrapperVisitor visitor) throws PersistenceException {
        visitor.handleOrderArticleWrapper(this);
    }
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderArticleWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrderArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderArticleWrapper(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getArticle() != null) return 1;
        return 0;
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentOrderArticleWrapper)This);
		if(this.isTheSameAs(This)){
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void accept() 
				throws PersistenceException{
        //TODO: implement method: accept
        
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
    public void sendBack() 
				throws PersistenceException{
        //TODO: implement method: sendBack
        
    }
    
    
    // Start of section that contains overridden operations only.
    
    public String getName() 
				throws PersistenceException{
        throw new NotImplementedException(); //TODO
    }

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
