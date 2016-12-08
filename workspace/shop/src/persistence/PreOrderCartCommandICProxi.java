package persistence;



import model.visitor.*;

public class PreOrderCartCommandICProxi extends PersistentInCacheProxi implements PersistentPreOrderCartCommand{
    
    public PreOrderCartCommandICProxi(long objectId) {
        super(objectId);
    }
    public PreOrderCartCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().thePreOrderCartCommandFacade
            .getPreOrderCartCommand(this.getId());
    }
    
    public long getClassId() {
        return 435;
    }
    
    public CustomerOrderManager4Public getManager() throws PersistenceException {
        return ((PersistentPreOrderCartCommand)this.getTheObject()).getManager();
    }
    public void setManager(CustomerOrderManager4Public newValue) throws PersistenceException {
        ((PersistentPreOrderCartCommand)this.getTheObject()).setManager(newValue);
    }
    public ShoppingCart4Public getCart() throws PersistenceException {
        return ((PersistentPreOrderCartCommand)this.getTheObject()).getCart();
    }
    public void setCart(ShoppingCart4Public newValue) throws PersistenceException {
        ((PersistentPreOrderCartCommand)this.getTheObject()).setCart(newValue);
    }
    public CustomerDeliveryTime4Public getCustomerDeliveryTime() throws PersistenceException {
        return ((PersistentPreOrderCartCommand)this.getTheObject()).getCustomerDeliveryTime();
    }
    public void setCustomerDeliveryTime(CustomerDeliveryTime4Public newValue) throws PersistenceException {
        ((PersistentPreOrderCartCommand)this.getTheObject()).setCustomerDeliveryTime(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentPreOrderCartCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentPreOrderCartCommand)this.getTheObject()).setInvoker(newValue);
    }
    public Shop4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentPreOrderCartCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(Shop4Public newValue) throws PersistenceException {
        ((PersistentPreOrderCartCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentPreOrderCartCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentPreOrderCartCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentPreOrderCartCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentPreOrderCartCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentPreOrderCartCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentPreOrderCartCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handlePreOrderCartCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrderCartCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrderCartCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrderCartCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handlePreOrderCartCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrderCartCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrderCartCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrderCartCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handlePreOrderCartCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrderCartCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrderCartCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrderCartCommand(this);
    }
    public void accept(ShopCommandVisitor visitor) throws PersistenceException {
        visitor.handlePreOrderCartCommand(this);
    }
    public <R> R accept(ShopCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrderCartCommand(this);
    }
    public <E extends model.UserException>  void accept(ShopCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrderCartCommand(this);
    }
    public <R, E extends model.UserException> R accept(ShopCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrderCartCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentPreOrderCartCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentPreOrderCartCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentPreOrderCartCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentPreOrderCartCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentPreOrderCartCommand)this.getTheObject()).sendResult();
    }

    
}
