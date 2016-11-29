package persistence;



import model.visitor.*;

public class NewPreOrderCommandProxi extends PersistentProxi implements PersistentNewPreOrderCommand{
    
    public NewPreOrderCommandProxi(long objectId) {
        super(objectId);
    }
    public NewPreOrderCommandProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 316;
    }
    
    public ShoppingCart4Public getCart() throws PersistenceException {
        return ((PersistentNewPreOrderCommand)this.getTheObject()).getCart();
    }
    public void setCart(ShoppingCart4Public newValue) throws PersistenceException {
        ((PersistentNewPreOrderCommand)this.getTheObject()).setCart(newValue);
    }
    public CustomerDeliveryTime4Public getCustomerDeliveryTime() throws PersistenceException {
        return ((PersistentNewPreOrderCommand)this.getTheObject()).getCustomerDeliveryTime();
    }
    public void setCustomerDeliveryTime(CustomerDeliveryTime4Public newValue) throws PersistenceException {
        ((PersistentNewPreOrderCommand)this.getTheObject()).setCustomerDeliveryTime(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentNewPreOrderCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentNewPreOrderCommand)this.getTheObject()).setInvoker(newValue);
    }
    public CustomerOrderManager4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentNewPreOrderCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(CustomerOrderManager4Public newValue) throws PersistenceException {
        ((PersistentNewPreOrderCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentNewPreOrderCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentNewPreOrderCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentNewPreOrderCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentNewPreOrderCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentNewPreOrderCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentNewPreOrderCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleNewPreOrderCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewPreOrderCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewPreOrderCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewPreOrderCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleNewPreOrderCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewPreOrderCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewPreOrderCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewPreOrderCommand(this);
    }
    public void accept(CustomerOrderManagerCommandVisitor visitor) throws PersistenceException {
        visitor.handleNewPreOrderCommand(this);
    }
    public <R> R accept(CustomerOrderManagerCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewPreOrderCommand(this);
    }
    public <E extends model.UserException>  void accept(CustomerOrderManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewPreOrderCommand(this);
    }
    public <R, E extends model.UserException> R accept(CustomerOrderManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewPreOrderCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleNewPreOrderCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewPreOrderCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewPreOrderCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewPreOrderCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentNewPreOrderCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentNewPreOrderCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentNewPreOrderCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentNewPreOrderCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentNewPreOrderCommand)this.getTheObject()).sendResult();
    }

    
}
