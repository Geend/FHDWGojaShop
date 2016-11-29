package persistence;



import model.visitor.*;

public class CreateCustomerDeliveryTimeCommandICProxi extends PersistentInCacheProxi implements PersistentCreateCustomerDeliveryTimeCommand{
    
    public CreateCustomerDeliveryTimeCommandICProxi(long objectId) {
        super(objectId);
    }
    public CreateCustomerDeliveryTimeCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCreateCustomerDeliveryTimeCommandFacade
            .getCreateCustomerDeliveryTimeCommand(this.getId());
    }
    
    public long getClassId() {
        return 295;
    }
    
    public String getName() throws PersistenceException {
        return ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).getName();
    }
    public void setName(String newValue) throws PersistenceException {
        ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).setName(newValue);
    }
    public common.Fraction getPrice() throws PersistenceException {
        return ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).getPrice();
    }
    public void setPrice(common.Fraction newValue) throws PersistenceException {
        ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).setPrice(newValue);
    }
    public long getTime() throws PersistenceException {
        return ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).getTime();
    }
    public void setTime(long newValue) throws PersistenceException {
        ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).setTime(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).setInvoker(newValue);
    }
    public CustomerDeliveryTimeManager4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(CustomerDeliveryTimeManager4Public newValue) throws PersistenceException {
        ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CustomerDeliveryTime4Public getCommandResult() throws PersistenceException {
        return ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).getCommandResult();
    }
    public void setCommandResult(CustomerDeliveryTime4Public newValue) throws PersistenceException {
        ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).setCommandResult(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleCreateCustomerDeliveryTimeCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCreateCustomerDeliveryTimeCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCreateCustomerDeliveryTimeCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCreateCustomerDeliveryTimeCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCreateCustomerDeliveryTimeCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCreateCustomerDeliveryTimeCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCreateCustomerDeliveryTimeCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCreateCustomerDeliveryTimeCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleCreateCustomerDeliveryTimeCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCreateCustomerDeliveryTimeCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCreateCustomerDeliveryTimeCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCreateCustomerDeliveryTimeCommand(this);
    }
    public void accept(CustomerDeliveryTimeManagerCommandVisitor visitor) throws PersistenceException {
        visitor.handleCreateCustomerDeliveryTimeCommand(this);
    }
    public <R> R accept(CustomerDeliveryTimeManagerCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCreateCustomerDeliveryTimeCommand(this);
    }
    public <E extends model.UserException>  void accept(CustomerDeliveryTimeManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCreateCustomerDeliveryTimeCommand(this);
    }
    public <R, E extends model.UserException> R accept(CustomerDeliveryTimeManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCreateCustomerDeliveryTimeCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentCreateCustomerDeliveryTimeCommand)this.getTheObject()).sendResult();
    }

    
}
