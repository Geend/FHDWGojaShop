package persistence;



import model.visitor.*;

public class AcceptOrderCommandICProxi extends PersistentInCacheProxi implements PersistentAcceptOrderCommand{
    
    public AcceptOrderCommandICProxi(long objectId) {
        super(objectId);
    }
    public AcceptOrderCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade
            .getAcceptOrderCommand(this.getId());
    }
    
    public long getClassId() {
        return 360;
    }
    
    public CustomerOrderManager4Public getManager() throws PersistenceException {
        return ((PersistentAcceptOrderCommand)this.getTheObject()).getManager();
    }
    public void setManager(CustomerOrderManager4Public newValue) throws PersistenceException {
        ((PersistentAcceptOrderCommand)this.getTheObject()).setManager(newValue);
    }
    public Order4Public getOrder() throws PersistenceException {
        return ((PersistentAcceptOrderCommand)this.getTheObject()).getOrder();
    }
    public void setOrder(Order4Public newValue) throws PersistenceException {
        ((PersistentAcceptOrderCommand)this.getTheObject()).setOrder(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentAcceptOrderCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentAcceptOrderCommand)this.getTheObject()).setInvoker(newValue);
    }
    public Shop4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentAcceptOrderCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(Shop4Public newValue) throws PersistenceException {
        ((PersistentAcceptOrderCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentAcceptOrderCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentAcceptOrderCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentAcceptOrderCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentAcceptOrderCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentAcceptOrderCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentAcceptOrderCommand)this.getTheObject()).setCommitDate(newValue);
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
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentAcceptOrderCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentAcceptOrderCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentAcceptOrderCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentAcceptOrderCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentAcceptOrderCommand)this.getTheObject()).sendResult();
    }

    
}
