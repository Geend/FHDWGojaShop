package persistence;



import model.visitor.*;

public class MoveToCommandICProxi extends PersistentInCacheProxi implements PersistentMoveToCommand{
    
    public MoveToCommandICProxi(long objectId) {
        super(objectId);
    }
    public MoveToCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theMoveToCommandFacade
            .getMoveToCommand(this.getId());
    }
    
    public long getClassId() {
        return 269;
    }
    
    public ProductGroup4Public getProductGroup() throws PersistenceException {
        return ((PersistentMoveToCommand)this.getTheObject()).getProductGroup();
    }
    public void setProductGroup(ProductGroup4Public newValue) throws PersistenceException {
        ((PersistentMoveToCommand)this.getTheObject()).setProductGroup(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentMoveToCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentMoveToCommand)this.getTheObject()).setInvoker(newValue);
    }
    public SubComponent getCommandReceiver() throws PersistenceException {
        return ((PersistentMoveToCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(SubComponent newValue) throws PersistenceException {
        ((PersistentMoveToCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentMoveToCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentMoveToCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentMoveToCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentMoveToCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentMoveToCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentMoveToCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleMoveToCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleMoveToCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleMoveToCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleMoveToCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleMoveToCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleMoveToCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleMoveToCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleMoveToCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleMoveToCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleMoveToCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleMoveToCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleMoveToCommand(this);
    }
    public void accept(SubComponentCommandVisitor visitor) throws PersistenceException {
        visitor.handleMoveToCommand(this);
    }
    public <R> R accept(SubComponentCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleMoveToCommand(this);
    }
    public <E extends model.UserException>  void accept(SubComponentCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleMoveToCommand(this);
    }
    public <R, E extends model.UserException> R accept(SubComponentCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleMoveToCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentMoveToCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentMoveToCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentMoveToCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentMoveToCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentMoveToCommand)this.getTheObject()).sendResult();
    }

    
}
