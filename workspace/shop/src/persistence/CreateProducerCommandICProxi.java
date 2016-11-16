package persistence;



import model.visitor.*;

public class CreateProducerCommandICProxi extends PersistentInCacheProxi implements PersistentCreateProducerCommand{
    
    public CreateProducerCommandICProxi(long objectId) {
        super(objectId);
    }
    public CreateProducerCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCreateProducerCommandFacade
            .getCreateProducerCommand(this.getId());
    }
    
    public long getClassId() {
        return 209;
    }
    
    public String getName() throws PersistenceException {
        return ((PersistentCreateProducerCommand)this.getTheObject()).getName();
    }
    public void setName(String newValue) throws PersistenceException {
        ((PersistentCreateProducerCommand)this.getTheObject()).setName(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentCreateProducerCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentCreateProducerCommand)this.getTheObject()).setInvoker(newValue);
    }
    public ProducerLst4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentCreateProducerCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(ProducerLst4Public newValue) throws PersistenceException {
        ((PersistentCreateProducerCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public Producer4Public getCommandResult() throws PersistenceException {
        return ((PersistentCreateProducerCommand)this.getTheObject()).getCommandResult();
    }
    public void setCommandResult(Producer4Public newValue) throws PersistenceException {
        ((PersistentCreateProducerCommand)this.getTheObject()).setCommandResult(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentCreateProducerCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentCreateProducerCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentCreateProducerCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentCreateProducerCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentCreateProducerCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentCreateProducerCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleCreateProducerCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCreateProducerCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCreateProducerCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCreateProducerCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCreateProducerCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCreateProducerCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCreateProducerCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCreateProducerCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleCreateProducerCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCreateProducerCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCreateProducerCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCreateProducerCommand(this);
    }
    public void accept(ProducerLstCommandVisitor visitor) throws PersistenceException {
        visitor.handleCreateProducerCommand(this);
    }
    public <R> R accept(ProducerLstCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCreateProducerCommand(this);
    }
    public <E extends model.UserException>  void accept(ProducerLstCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCreateProducerCommand(this);
    }
    public <R, E extends model.UserException> R accept(ProducerLstCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCreateProducerCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentCreateProducerCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentCreateProducerCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentCreateProducerCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentCreateProducerCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentCreateProducerCommand)this.getTheObject()).sendResult();
    }

    
}
