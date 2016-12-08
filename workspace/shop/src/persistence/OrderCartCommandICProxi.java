package persistence;



import model.visitor.*;

public class OrderCartCommandICProxi extends PersistentInCacheProxi implements PersistentOrderCartCommand{
    
    public OrderCartCommandICProxi(long objectId) {
        super(objectId);
    }
    public OrderCartCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theOrderCartCommandFacade
            .getOrderCartCommand(this.getId());
    }
    
    public long getClassId() {
        return 434;
    }
    
    public CustomerOrderManager4Public getManager() throws PersistenceException {
        return ((PersistentOrderCartCommand)this.getTheObject()).getManager();
    }
    public void setManager(CustomerOrderManager4Public newValue) throws PersistenceException {
        ((PersistentOrderCartCommand)this.getTheObject()).setManager(newValue);
    }
    public ShoppingCart4Public getCart() throws PersistenceException {
        return ((PersistentOrderCartCommand)this.getTheObject()).getCart();
    }
    public void setCart(ShoppingCart4Public newValue) throws PersistenceException {
        ((PersistentOrderCartCommand)this.getTheObject()).setCart(newValue);
    }
    public CustomerDeliveryTime4Public getCustomerDeliveryTime() throws PersistenceException {
        return ((PersistentOrderCartCommand)this.getTheObject()).getCustomerDeliveryTime();
    }
    public void setCustomerDeliveryTime(CustomerDeliveryTime4Public newValue) throws PersistenceException {
        ((PersistentOrderCartCommand)this.getTheObject()).setCustomerDeliveryTime(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentOrderCartCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentOrderCartCommand)this.getTheObject()).setInvoker(newValue);
    }
    public Shop4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentOrderCartCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(Shop4Public newValue) throws PersistenceException {
        ((PersistentOrderCartCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentOrderCartCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentOrderCartCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentOrderCartCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentOrderCartCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentOrderCartCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentOrderCartCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleOrderCartCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderCartCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderCartCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderCartCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrderCartCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderCartCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderCartCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderCartCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleOrderCartCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderCartCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderCartCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderCartCommand(this);
    }
    public void accept(ShopCommandVisitor visitor) throws PersistenceException {
        visitor.handleOrderCartCommand(this);
    }
    public <R> R accept(ShopCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderCartCommand(this);
    }
    public <E extends model.UserException>  void accept(ShopCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderCartCommand(this);
    }
    public <R, E extends model.UserException> R accept(ShopCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderCartCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentOrderCartCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentOrderCartCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentOrderCartCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentOrderCartCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentOrderCartCommand)this.getTheObject()).sendResult();
    }

    
}
