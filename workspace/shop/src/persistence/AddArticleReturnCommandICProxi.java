package persistence;



import model.visitor.*;

public class AddArticleReturnCommandICProxi extends PersistentInCacheProxi implements PersistentAddArticleReturnCommand{
    
    public AddArticleReturnCommandICProxi(long objectId) {
        super(objectId);
    }
    public AddArticleReturnCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theAddArticleReturnCommandFacade
            .getAddArticleReturnCommand(this.getId());
    }
    
    public long getClassId() {
        return 352;
    }
    
    public ArticleReturn4Public getArticleReturn() throws PersistenceException {
        return ((PersistentAddArticleReturnCommand)this.getTheObject()).getArticleReturn();
    }
    public void setArticleReturn(ArticleReturn4Public newValue) throws PersistenceException {
        ((PersistentAddArticleReturnCommand)this.getTheObject()).setArticleReturn(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentAddArticleReturnCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentAddArticleReturnCommand)this.getTheObject()).setInvoker(newValue);
    }
    public ReturnManager4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentAddArticleReturnCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(ReturnManager4Public newValue) throws PersistenceException {
        ((PersistentAddArticleReturnCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentAddArticleReturnCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentAddArticleReturnCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentAddArticleReturnCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentAddArticleReturnCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentAddArticleReturnCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentAddArticleReturnCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleAddArticleReturnCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAddArticleReturnCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAddArticleReturnCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAddArticleReturnCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleAddArticleReturnCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAddArticleReturnCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAddArticleReturnCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAddArticleReturnCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleAddArticleReturnCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAddArticleReturnCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAddArticleReturnCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAddArticleReturnCommand(this);
    }
    public void accept(ReturnManagerCommandVisitor visitor) throws PersistenceException {
        visitor.handleAddArticleReturnCommand(this);
    }
    public <R> R accept(ReturnManagerCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAddArticleReturnCommand(this);
    }
    public <E extends model.UserException>  void accept(ReturnManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAddArticleReturnCommand(this);
    }
    public <R, E extends model.UserException> R accept(ReturnManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAddArticleReturnCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentAddArticleReturnCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentAddArticleReturnCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentAddArticleReturnCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentAddArticleReturnCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentAddArticleReturnCommand)this.getTheObject()).sendResult();
    }

    
}
