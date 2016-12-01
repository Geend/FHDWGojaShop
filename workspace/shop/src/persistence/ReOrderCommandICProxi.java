package persistence;



import model.visitor.*;

public class ReOrderCommandICProxi extends PersistentInCacheProxi implements PersistentReOrderCommand{
    
    public ReOrderCommandICProxi(long objectId) {
        super(objectId);
    }
    public ReOrderCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theReOrderCommandFacade
            .getReOrderCommand(this.getId());
    }
    
    public long getClassId() {
        return 330;
    }
    
    public ArticleWrapper4Public getArticle() throws PersistenceException {
        return ((PersistentReOrderCommand)this.getTheObject()).getArticle();
    }
    public void setArticle(ArticleWrapper4Public newValue) throws PersistenceException {
        ((PersistentReOrderCommand)this.getTheObject()).setArticle(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentReOrderCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentReOrderCommand)this.getTheObject()).setInvoker(newValue);
    }
    public ReOrderManager4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentReOrderCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(ReOrderManager4Public newValue) throws PersistenceException {
        ((PersistentReOrderCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentReOrderCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentReOrderCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentReOrderCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentReOrderCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentReOrderCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentReOrderCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleReOrderCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleReOrderCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderCommand(this);
    }
    public void accept(ReOrderManagerCommandVisitor visitor) throws PersistenceException {
        visitor.handleReOrderCommand(this);
    }
    public <R> R accept(ReOrderManagerCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderCommand(this);
    }
    public <E extends model.UserException>  void accept(ReOrderManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderCommand(this);
    }
    public <R, E extends model.UserException> R accept(ReOrderManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleReOrderCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentReOrderCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentReOrderCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentReOrderCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentReOrderCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentReOrderCommand)this.getTheObject()).sendResult();
    }

    
}
