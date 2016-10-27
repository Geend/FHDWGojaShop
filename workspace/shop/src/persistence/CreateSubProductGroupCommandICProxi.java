package persistence;



import model.visitor.*;

public class CreateSubProductGroupCommandICProxi extends PersistentInCacheProxi implements PersistentCreateSubProductGroupCommand{
    
    public CreateSubProductGroupCommandICProxi(long objectId) {
        super(objectId);
    }
    public CreateSubProductGroupCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCreateSubProductGroupCommandFacade
            .getCreateSubProductGroupCommand(this.getId());
    }
    
    public long getClassId() {
        return 173;
    }
    
    public String getName() throws PersistenceException {
        return ((PersistentCreateSubProductGroupCommand)this.getTheObject()).getName();
    }
    public void setName(String newValue) throws PersistenceException {
        ((PersistentCreateSubProductGroupCommand)this.getTheObject()).setName(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentCreateSubProductGroupCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentCreateSubProductGroupCommand)this.getTheObject()).setInvoker(newValue);
    }
    public PersistentProductGroup getCommandReceiver() throws PersistenceException {
        return ((PersistentCreateSubProductGroupCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(PersistentProductGroup newValue) throws PersistenceException {
        ((PersistentCreateSubProductGroupCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public PersistentProductGroup getCommandResult() throws PersistenceException {
        return ((PersistentCreateSubProductGroupCommand)this.getTheObject()).getCommandResult();
    }
    public void setCommandResult(PersistentProductGroup newValue) throws PersistenceException {
        ((PersistentCreateSubProductGroupCommand)this.getTheObject()).setCommandResult(newValue);
    }
    public PersistentCommonDate getMyCommonDate() throws PersistenceException {
        return ((PersistentCreateSubProductGroupCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException {
        ((PersistentCreateSubProductGroupCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentCreateSubProductGroupCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentCreateSubProductGroupCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentCreateSubProductGroupCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentCreateSubProductGroupCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleCreateSubProductGroupCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCreateSubProductGroupCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCreateSubProductGroupCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCreateSubProductGroupCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCreateSubProductGroupCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCreateSubProductGroupCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCreateSubProductGroupCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCreateSubProductGroupCommand(this);
    }
    public void accept(ProductGroupCommandVisitor visitor) throws PersistenceException {
        visitor.handleCreateSubProductGroupCommand(this);
    }
    public <R> R accept(ProductGroupCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCreateSubProductGroupCommand(this);
    }
    public <E extends model.UserException>  void accept(ProductGroupCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCreateSubProductGroupCommand(this);
    }
    public <R, E extends model.UserException> R accept(ProductGroupCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCreateSubProductGroupCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleCreateSubProductGroupCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCreateSubProductGroupCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCreateSubProductGroupCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCreateSubProductGroupCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentCreateSubProductGroupCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentCreateSubProductGroupCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentCreateSubProductGroupCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentCreateSubProductGroupCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentCreateSubProductGroupCommand)this.getTheObject()).sendResult();
    }

    
}
