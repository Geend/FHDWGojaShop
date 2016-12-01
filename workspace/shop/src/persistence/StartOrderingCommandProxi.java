package persistence;



import model.visitor.*;

public class StartOrderingCommandProxi extends PersistentProxi implements PersistentStartOrderingCommand{
    
    public StartOrderingCommandProxi(long objectId) {
        super(objectId);
    }
    public StartOrderingCommandProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 331;
    }
    
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentStartOrderingCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentStartOrderingCommand)this.getTheObject()).setInvoker(newValue);
    }
    public ReOrderManager4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentStartOrderingCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(ReOrderManager4Public newValue) throws PersistenceException {
        ((PersistentStartOrderingCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentStartOrderingCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentStartOrderingCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentStartOrderingCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentStartOrderingCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentStartOrderingCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentStartOrderingCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleStartOrderingCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStartOrderingCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStartOrderingCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStartOrderingCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleStartOrderingCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStartOrderingCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStartOrderingCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStartOrderingCommand(this);
    }
    public void accept(ReOrderManagerCommandVisitor visitor) throws PersistenceException {
        visitor.handleStartOrderingCommand(this);
    }
    public <R> R accept(ReOrderManagerCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStartOrderingCommand(this);
    }
    public <E extends model.UserException>  void accept(ReOrderManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStartOrderingCommand(this);
    }
    public <R, E extends model.UserException> R accept(ReOrderManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStartOrderingCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleStartOrderingCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStartOrderingCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStartOrderingCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStartOrderingCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentStartOrderingCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentStartOrderingCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentStartOrderingCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentStartOrderingCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentStartOrderingCommand)this.getTheObject()).sendResult();
    }

    
}
