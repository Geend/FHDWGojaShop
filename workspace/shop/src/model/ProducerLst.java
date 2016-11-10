
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ProducerLst extends PersistentObject implements PersistentProducerLst{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static ProducerLst4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theProducerLstFacade.getClass(objectId);
        return (ProducerLst4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static ProducerLst4Public createProducerLst() throws PersistenceException{
        return createProducerLst(false);
    }
    
    public static ProducerLst4Public createProducerLst(boolean delayed$Persistence) throws PersistenceException {
        PersistentProducerLst result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theProducerLstFacade
                .newDelayedProducerLst();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theProducerLstFacade
                .newProducerLst(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static ProducerLst4Public createProducerLst(boolean delayed$Persistence,ProducerLst4Public This) throws PersistenceException {
        PersistentProducerLst result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theProducerLstFacade
                .newDelayedProducerLst();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theProducerLstFacade
                .newProducerLst(-1);
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
            result.put("currentProducer", this.getCurrentProducer().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ProducerLst provideCopy() throws PersistenceException{
        ProducerLst result = this;
        result = new ProducerLst(this.This, 
                                 this.getId());
        result.currentProducer = this.currentProducer.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected ProducerLst_CurrentProducerProxi currentProducer;
    protected PersistentProducerLst This;
    
    public ProducerLst(PersistentProducerLst This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.currentProducer = new ProducerLst_CurrentProducerProxi(this);
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 210;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 210) ConnectionHandler.getTheConnectionHandler().theProducerLstFacade
            .newProducerLst(this.getId());
        super.store();
        this.getCurrentProducer().store();
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theProducerLstFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public ProducerLst_CurrentProducerProxi getCurrentProducer() throws PersistenceException {
        return this.currentProducer;
    }
    protected void setThis(PersistentProducerLst newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentProducerLst)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theProducerLstFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentProducerLst getThis() throws PersistenceException {
        if(this.This == null){
            PersistentProducerLst result = (PersistentProducerLst)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentProducerLst)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleProducerLst(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProducerLst(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProducerLst(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProducerLst(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getCurrentProducer().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void createProducer(final String name, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		CreateProducerCommand4Public command = model.meta.CreateProducerCommand.createCreateProducerCommand(name, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentProducerLst)This);
		if(this.isTheSameAs(This)){
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public Producer4Public createProducer(final String name) 
				throws model.DoubleDefinition, PersistenceException{
        Producer4Public producer4Public = Producer.createProducer(name);
        getThis().getCurrentProducer().add(producer4Public);
        return producer4Public;
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
