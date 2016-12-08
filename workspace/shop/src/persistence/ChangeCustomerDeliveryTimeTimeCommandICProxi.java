package persistence;



import model.visitor.*;

public class ChangeCustomerDeliveryTimeTimeCommandICProxi extends PersistentInCacheProxi implements PersistentChangeCustomerDeliveryTimeTimeCommand{
    
    public ChangeCustomerDeliveryTimeTimeCommandICProxi(long objectId) {
        super(objectId);
    }
    public ChangeCustomerDeliveryTimeTimeCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimeTimeCommandFacade
            .getChangeCustomerDeliveryTimeTimeCommand(this.getId());
    }
    
    public long getClassId() {
        return 410;
    }
    
    public CustomerDeliveryTime4Public getCustomerDeliveryTime() throws PersistenceException {
        return ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).getCustomerDeliveryTime();
    }
    public void setCustomerDeliveryTime(CustomerDeliveryTime4Public newValue) throws PersistenceException {
        ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).setCustomerDeliveryTime(newValue);
    }
    public long getNewValue() throws PersistenceException {
        return ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).getNewValue();
    }
    public void setNewValue(long newValue) throws PersistenceException {
        ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).setNewValue(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).setInvoker(newValue);
    }
    public Shop4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(Shop4Public newValue) throws PersistenceException {
        ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).setCommitDate(newValue);
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
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentChangeCustomerDeliveryTimeTimeCommand)this.getTheObject()).sendResult();
    }

    
}
