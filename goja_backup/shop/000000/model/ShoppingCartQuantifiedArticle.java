
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ShoppingCartQuantifiedArticle extends model.QuantifiedArticle implements PersistentShoppingCartQuantifiedArticle{
    
    
    public static PersistentShoppingCartQuantifiedArticle createShoppingCartQuantifiedArticle(long quantity) throws PersistenceException{
        return createShoppingCartQuantifiedArticle(quantity,false);
    }
    
    public static PersistentShoppingCartQuantifiedArticle createShoppingCartQuantifiedArticle(long quantity,boolean delayed$Persistence) throws PersistenceException {
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
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentShoppingCartQuantifiedArticle createShoppingCartQuantifiedArticle(long quantity,boolean delayed$Persistence,PersistentShoppingCartQuantifiedArticle This) throws PersistenceException {
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
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
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
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ShoppingCartQuantifiedArticle provideCopy() throws PersistenceException{
        ShoppingCartQuantifiedArticle result = this;
        result = new ShoppingCartQuantifiedArticle(this.quantity, 
                                                   this.This, 
                                                   this.article, 
                                                   this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentShoppingCartArticleWrapper article;
    
    public ShoppingCartQuantifiedArticle(long quantity,PersistentQuantifiedArticle This,PersistentShoppingCartArticleWrapper article,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((long)quantity,(PersistentQuantifiedArticle)This,id);
        this.article = article;        
    }
    
    static public long getTypeId() {
        return 153;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 153) ConnectionHandler.getTheConnectionHandler().theShoppingCartQuantifiedArticleFacade
            .newShoppingCartQuantifiedArticle(quantity,this.getId());
        super.store();
        if(this.getArticle() != null){
            this.getArticle().store();
            ConnectionHandler.getTheConnectionHandler().theShoppingCartQuantifiedArticleFacade.articleSet(this.getId(), getArticle());
        }
        
    }
    
    public PersistentShoppingCartArticleWrapper getArticle() throws PersistenceException {
        return this.article;
    }
    public void setArticle(PersistentShoppingCartArticleWrapper newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.article)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.article = (PersistentShoppingCartArticleWrapper)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShoppingCartQuantifiedArticleFacade.articleSet(this.getId(), newValue);
        }
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
    public int getLeafInfo() throws PersistenceException{
        if (this.getArticle() != null) return 1;
        return 0;
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentShoppingCartQuantifiedArticle)This);
		if(this.isTheSameAs(This)){
			this.setQuantity((Long)final$$Fields.get("quantity"));
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
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