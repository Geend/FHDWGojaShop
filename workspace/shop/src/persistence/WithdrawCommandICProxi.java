package persistence;



import model.visitor.*;

public class WithdrawCommandICProxi extends PersistentInCacheProxi implements PersistentWithdrawCommand{
    
    public WithdrawCommandICProxi(long objectId) {
        super(objectId);
    }
    public WithdrawCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theWithdrawCommandFacade
            .getWithdrawCommand(this.getId());
    }
    
    public long getClassId() {
        return 301;
    }
    
    public common.Fraction getAmount() throws PersistenceException {
        return ((PersistentWithdrawCommand)this.getTheObject()).getAmount();
    }
    public void setAmount(common.Fraction newValue) throws PersistenceException {
        ((PersistentWithdrawCommand)this.getTheObject()).setAmount(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentWithdrawCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentWithdrawCommand)this.getTheObject()).setInvoker(newValue);
    }
    public CustomerAccount4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentWithdrawCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(CustomerAccount4Public newValue) throws PersistenceException {
        ((PersistentWithdrawCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentWithdrawCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentWithdrawCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentWithdrawCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentWithdrawCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentWithdrawCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentWithdrawCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleWithdrawCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleWithdrawCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleWithdrawCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleWithdrawCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleWithdrawCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleWithdrawCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleWithdrawCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleWithdrawCommand(this);
    }
    public void accept(CustomerAccountCommandVisitor visitor) throws PersistenceException {
        visitor.handleWithdrawCommand(this);
    }
    public <R> R accept(CustomerAccountCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleWithdrawCommand(this);
    }
    public <E extends model.UserException>  void accept(CustomerAccountCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleWithdrawCommand(this);
    }
    public <R, E extends model.UserException> R accept(CustomerAccountCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleWithdrawCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleWithdrawCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleWithdrawCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleWithdrawCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleWithdrawCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentWithdrawCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentWithdrawCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentWithdrawCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentWithdrawCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentWithdrawCommand)this.getTheObject()).sendResult();
    }

    
}
