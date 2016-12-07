package persistence;



import model.visitor.*;

public class NewProductGroupCommandProxi extends PersistentProxi implements PersistentNewProductGroupCommand{
    
    public NewProductGroupCommandProxi(long objectId) {
        super(objectId);
    }
    public NewProductGroupCommandProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 192;
    }
    
    public String getName() throws PersistenceException {
        return ((PersistentNewProductGroupCommand)this.getTheObject()).getName();
    }
    public void setName(String newValue) throws PersistenceException {
        ((PersistentNewProductGroupCommand)this.getTheObject()).setName(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentNewProductGroupCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentNewProductGroupCommand)this.getTheObject()).setInvoker(newValue);
    }
    public ComponentContainer getCommandReceiver() throws PersistenceException {
        return ((PersistentNewProductGroupCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(ComponentContainer newValue) throws PersistenceException {
        ((PersistentNewProductGroupCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public ProductGroup4Public getCommandResult() throws PersistenceException {
        return ((PersistentNewProductGroupCommand)this.getTheObject()).getCommandResult();
    }
    public void setCommandResult(ProductGroup4Public newValue) throws PersistenceException {
        ((PersistentNewProductGroupCommand)this.getTheObject()).setCommandResult(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentNewProductGroupCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentNewProductGroupCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentNewProductGroupCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentNewProductGroupCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentNewProductGroupCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentNewProductGroupCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleNewProductGroupCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewProductGroupCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewProductGroupCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewProductGroupCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleNewProductGroupCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewProductGroupCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewProductGroupCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewProductGroupCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleNewProductGroupCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewProductGroupCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewProductGroupCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewProductGroupCommand(this);
    }
    public void accept(ComponentContainerCommandVisitor visitor) throws PersistenceException {
        visitor.handleNewProductGroupCommand(this);
    }
    public <R> R accept(ComponentContainerCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewProductGroupCommand(this);
    }
    public <E extends model.UserException>  void accept(ComponentContainerCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewProductGroupCommand(this);
    }
    public <R, E extends model.UserException> R accept(ComponentContainerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewProductGroupCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentNewProductGroupCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentNewProductGroupCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentNewProductGroupCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentNewProductGroupCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentNewProductGroupCommand)this.getTheObject()).sendResult();
    }

    
}
