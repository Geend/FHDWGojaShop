package persistence;



import model.visitor.*;

public class StopSellingCommandICProxi extends PersistentInCacheProxi implements PersistentStopSellingCommand{
    
    public StopSellingCommandICProxi(long objectId) {
        super(objectId);
    }
    public StopSellingCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theStopSellingCommandFacade
            .getStopSellingCommand(this.getId());
    }
    
    public long getClassId() {
        return 273;
    }
    
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentStopSellingCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentStopSellingCommand)this.getTheObject()).setInvoker(newValue);
    }
    public OwnerArticleWrapper4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentStopSellingCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(OwnerArticleWrapper4Public newValue) throws PersistenceException {
        ((PersistentStopSellingCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentStopSellingCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentStopSellingCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentStopSellingCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentStopSellingCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentStopSellingCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentStopSellingCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleStopSellingCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStopSellingCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStopSellingCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStopSellingCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleStopSellingCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStopSellingCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStopSellingCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStopSellingCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleStopSellingCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStopSellingCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStopSellingCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStopSellingCommand(this);
    }
    public void accept(OwnerArticleWrapperCommandVisitor visitor) throws PersistenceException {
        visitor.handleStopSellingCommand(this);
    }
    public <R> R accept(OwnerArticleWrapperCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStopSellingCommand(this);
    }
    public <E extends model.UserException>  void accept(OwnerArticleWrapperCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStopSellingCommand(this);
    }
    public <R, E extends model.UserException> R accept(OwnerArticleWrapperCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStopSellingCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentStopSellingCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentStopSellingCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentStopSellingCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentStopSellingCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentStopSellingCommand)this.getTheObject()).sendResult();
    }

    
}
