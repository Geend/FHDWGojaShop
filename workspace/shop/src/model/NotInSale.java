
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class NotInSale extends model.ArticleState implements PersistentNotInSale{
    
    
    public static NotInSale4Public createNotInSale() throws PersistenceException{
        return createNotInSale(false);
    }
    
    public static NotInSale4Public createNotInSale(boolean delayed$Persistence) throws PersistenceException {
        PersistentNotInSale result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theNotInSaleFacade
                .newDelayedNotInSale();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theNotInSaleFacade
                .newNotInSale(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static NotInSale4Public createNotInSale(boolean delayed$Persistence,NotInSale4Public This) throws PersistenceException {
        PersistentNotInSale result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theNotInSaleFacade
                .newDelayedNotInSale();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theNotInSaleFacade
                .newNotInSale(-1);
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
    
    public NotInSale provideCopy() throws PersistenceException{
        NotInSale result = this;
        result = new NotInSale(this.subService, 
                               this.This, 
                               this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    
    public NotInSale(SubjInterface subService,PersistentArticleState This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((SubjInterface)subService,(PersistentArticleState)This,id);        
    }
    
    static public long getTypeId() {
        return 195;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 195) ConnectionHandler.getTheConnectionHandler().theNotInSaleFacade
            .newNotInSale(this.getId());
        super.store();
        
    }
    
    public PersistentNotInSale getThis() throws PersistenceException {
        if(this.This == null){
            PersistentNotInSale result = (PersistentNotInSale)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentNotInSale)this.This;
    }
    
    public void accept(ArticleStateVisitor visitor) throws PersistenceException {
        visitor.handleNotInSale(this);
    }
    public <R> R accept(ArticleStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNotInSale(this);
    }
    public <E extends model.UserException>  void accept(ArticleStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNotInSale(this);
    }
    public <R, E extends model.UserException> R accept(ArticleStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNotInSale(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleNotInSale(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNotInSale(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNotInSale(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNotInSale(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleNotInSale(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNotInSale(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNotInSale(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNotInSale(this);
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
        this.setThis((PersistentNotInSale)This);
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
