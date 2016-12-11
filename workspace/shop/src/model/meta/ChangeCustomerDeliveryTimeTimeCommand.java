
package model.meta;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ChangeCustomerDeliveryTimeTimeCommand extends PersistentObject implements PersistentChangeCustomerDeliveryTimeTimeCommand{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static ChangeCustomerDeliveryTimeTimeCommand4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimeTimeCommandFacade.getClass(objectId);
        return (ChangeCustomerDeliveryTimeTimeCommand4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static ChangeCustomerDeliveryTimeTimeCommand4Public createChangeCustomerDeliveryTimeTimeCommand(long newValue,java.sql.Date createDate,java.sql.Date commitDate) throws PersistenceException{
        return createChangeCustomerDeliveryTimeTimeCommand(newValue,createDate,commitDate,false);
    }
    
    public static ChangeCustomerDeliveryTimeTimeCommand4Public createChangeCustomerDeliveryTimeTimeCommand(long newValue,java.sql.Date createDate,java.sql.Date commitDate,boolean delayed$Persistence) throws PersistenceException {
        PersistentChangeCustomerDeliveryTimeTimeCommand result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimeTimeCommandFacade
                .newDelayedChangeCustomerDeliveryTimeTimeCommand(newValue);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimeTimeCommandFacade
                .newChangeCustomerDeliveryTimeTimeCommand(newValue,-1);
        }
        ((PersistentChangeCustomerDeliveryTimeTimeCommand)result).setMyCommonDate(CommonDate.createCommonDate(createDate, createDate));
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return true;
    }
    protected PersistentCustomerDeliveryTime customerDeliveryTime;
    protected long newValue;
    protected Invoker invoker;
    protected PersistentShop commandReceiver;
    protected PersistentCommonDate myCommonDate;
    
    private model.UserException commandException = null;
    
    public ChangeCustomerDeliveryTimeTimeCommand(PersistentCustomerDeliveryTime customerDeliveryTime,long newValue,Invoker invoker,PersistentShop commandReceiver,PersistentCommonDate myCommonDate,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.customerDeliveryTime = customerDeliveryTime;
        this.newValue = newValue;
        this.invoker = invoker;
        this.commandReceiver = commandReceiver;
        this.myCommonDate = myCommonDate;        
    }
    
    static public long getTypeId() {
        return 410;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 410) ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimeTimeCommandFacade
            .newChangeCustomerDeliveryTimeTimeCommand(newValue,this.getId());
        super.store();
        if(this.getCustomerDeliveryTime() != null){
            this.getCustomerDeliveryTime().store();
            ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimeTimeCommandFacade.customerDeliveryTimeSet(this.getId(), getCustomerDeliveryTime());
        }
        if(this.getInvoker() != null){
            this.getInvoker().store();
            ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimeTimeCommandFacade.invokerSet(this.getId(), getInvoker());
        }
        if(this.getCommandReceiver() != null){
            this.getCommandReceiver().store();
            ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimeTimeCommandFacade.commandReceiverSet(this.getId(), getCommandReceiver());
        }
        if(this.getMyCommonDate() != null){
            this.getMyCommonDate().store();
            ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimeTimeCommandFacade.myCommonDateSet(this.getId(), getMyCommonDate());
        }
        
    }
    
    public CustomerDeliveryTime4Public getCustomerDeliveryTime() throws PersistenceException {
        return this.customerDeliveryTime;
    }
    public void setCustomerDeliveryTime(CustomerDeliveryTime4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.customerDeliveryTime)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.customerDeliveryTime = (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimeTimeCommandFacade.customerDeliveryTimeSet(this.getId(), newValue);
        }
    }
    public long getNewValue() throws PersistenceException {
        return this.newValue;
    }
    public void setNewValue(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimeTimeCommandFacade.newValueSet(this.getId(), newValue);
        this.newValue = newValue;
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
            ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimeTimeCommandFacade.invokerSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimeTimeCommandFacade.commandReceiverSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimeTimeCommandFacade.myCommonDateSet(this.getId(), newValue);
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
        visitor.handleChangeCustomerDeliveryTimeTimeCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeCustomerDeliveryTimeTimeCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeCustomerDeliveryTimeTimeCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeCustomerDeliveryTimeTimeCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleChangeCustomerDeliveryTimeTimeCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeCustomerDeliveryTimeTimeCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeCustomerDeliveryTimeTimeCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeCustomerDeliveryTimeTimeCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleChangeCustomerDeliveryTimeTimeCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeCustomerDeliveryTimeTimeCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeCustomerDeliveryTimeTimeCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeCustomerDeliveryTimeTimeCommand(this);
    }
    public void accept(ShopCommandVisitor visitor) throws PersistenceException {
        visitor.handleChangeCustomerDeliveryTimeTimeCommand(this);
    }
    public <R> R accept(ShopCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeCustomerDeliveryTimeTimeCommand(this);
    }
    public <E extends model.UserException>  void accept(ShopCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeCustomerDeliveryTimeTimeCommand(this);
    }
    public <R, E extends model.UserException> R accept(ShopCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeCustomerDeliveryTimeTimeCommand(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getCustomerDeliveryTime() != null) return 1;
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
			this.commandReceiver.changeCustomerDeliveryTimeTime(this.getCustomerDeliveryTime(), this.getNewValue());
		}
		catch(model.InvalidInputException e){
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
