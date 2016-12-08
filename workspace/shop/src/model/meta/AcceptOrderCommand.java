
package model.meta;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class AcceptOrderCommand extends PersistentObject implements PersistentAcceptOrderCommand{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static AcceptOrderCommand4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade.getClass(objectId);
        return (AcceptOrderCommand4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static AcceptOrderCommand4Public createAcceptOrderCommand(java.sql.Date createDate,java.sql.Date commitDate) throws PersistenceException{
        return createAcceptOrderCommand(createDate,commitDate,false);
    }
    
    public static AcceptOrderCommand4Public createAcceptOrderCommand(java.sql.Date createDate,java.sql.Date commitDate,boolean delayed$Persistence) throws PersistenceException {
        PersistentAcceptOrderCommand result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade
                .newDelayedAcceptOrderCommand();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade
                .newAcceptOrderCommand(-1);
        }
        ((PersistentAcceptOrderCommand)result).setMyCommonDate(CommonDate.createCommonDate(createDate, createDate));
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return true;
    }
    protected PersistentCustomerOrderManager manager;
    protected PersistentOrder order;
    protected Invoker invoker;
    protected PersistentShop commandReceiver;
    protected PersistentCommonDate myCommonDate;
    
    private model.UserException commandException = null;
    
    public AcceptOrderCommand(PersistentCustomerOrderManager manager,PersistentOrder order,Invoker invoker,PersistentShop commandReceiver,PersistentCommonDate myCommonDate,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.manager = manager;
        this.order = order;
        this.invoker = invoker;
        this.commandReceiver = commandReceiver;
        this.myCommonDate = myCommonDate;        
    }
    
    static public long getTypeId() {
        return 360;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 360) ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade
            .newAcceptOrderCommand(this.getId());
        super.store();
        if(this.getManager() != null){
            this.getManager().store();
            ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade.managerSet(this.getId(), getManager());
        }
        if(this.getOrder() != null){
            this.getOrder().store();
            ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade.orderSet(this.getId(), getOrder());
        }
        if(this.getInvoker() != null){
            this.getInvoker().store();
            ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade.invokerSet(this.getId(), getInvoker());
        }
        if(this.getCommandReceiver() != null){
            this.getCommandReceiver().store();
            ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade.commandReceiverSet(this.getId(), getCommandReceiver());
        }
        if(this.getMyCommonDate() != null){
            this.getMyCommonDate().store();
            ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade.myCommonDateSet(this.getId(), getMyCommonDate());
        }
        
    }
    
    public CustomerOrderManager4Public getManager() throws PersistenceException {
        return this.manager;
    }
    public void setManager(CustomerOrderManager4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.manager)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.manager = (PersistentCustomerOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade.managerSet(this.getId(), newValue);
        }
    }
    public Order4Public getOrder() throws PersistenceException {
        return this.order;
    }
    public void setOrder(Order4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.order)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.order = (PersistentOrder)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade.orderSet(this.getId(), newValue);
        }
    }
    public Invoker getInvoker() throws PersistenceException {
        return this.invoker;
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.invoker)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.invoker = (Invoker)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade.invokerSet(this.getId(), newValue);
        }
    }
    public Shop4Public getCommandReceiver() throws PersistenceException {
        return this.commandReceiver;
    }
    public void setCommandReceiver(Shop4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.commandReceiver)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.commandReceiver = (PersistentShop)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade.commandReceiverSet(this.getId(), newValue);
        }
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return this.myCommonDate;
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.myCommonDate)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.myCommonDate = (PersistentCommonDate)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade.myCommonDateSet(this.getId(), newValue);
        }
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentCommonDate)this.getMyCommonDate()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentCommonDate)this.getMyCommonDate()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentCommonDate)this.getMyCommonDate()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentCommonDate)this.getMyCommonDate()).setCommitDate(newValue);
    }
    public void delete$Me() throws PersistenceException{
        super.delete$Me();
        this.getMyCommonDate().delete$Me();
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleAcceptOrderCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAcceptOrderCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAcceptOrderCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAcceptOrderCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleAcceptOrderCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAcceptOrderCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAcceptOrderCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAcceptOrderCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleAcceptOrderCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAcceptOrderCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAcceptOrderCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAcceptOrderCommand(this);
    }
    public void accept(ShopCommandVisitor visitor) throws PersistenceException {
        visitor.handleAcceptOrderCommand(this);
    }
    public <R> R accept(ShopCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAcceptOrderCommand(this);
    }
    public <E extends model.UserException>  void accept(ShopCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAcceptOrderCommand(this);
    }
    public <R, E extends model.UserException> R accept(ShopCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAcceptOrderCommand(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getManager() != null) return 1;
        if (this.getOrder() != null) return 1;
        if (this.getCommandReceiver() != null) return 1;
        return 0;
    }
    
    
    
    
    // Start of section that contains operations that must be implemented.
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        if (this.commandException != null) throw this.commandException;
    }
    public void execute() 
				throws PersistenceException{
        try{
			this.commandReceiver.acceptOrder(this.getManager(), this.getOrder());
		}
		catch(model.OrderNotAcceptableException e){
			this.commandException = e;
		}
		catch(model.NotEnoughMoneyException e){
			this.commandException = e;
		}
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return this.getInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        this.invoker.handleException(this, exception);
    }
    public void sendResult() 
				throws PersistenceException{
        this.invoker.handleResult(this);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
