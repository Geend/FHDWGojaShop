package persistence;



import model.visitor.*;

public class ReOrderForPreorderCommandICProxi extends PersistentInCacheProxi implements PersistentReOrderForPreorderCommand{
    
    public ReOrderForPreorderCommandICProxi(long objectId) {
        super(objectId);
    }
    public ReOrderForPreorderCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theReOrderForPreorderCommandFacade
            .getReOrderForPreorderCommand(this.getId());
    }
    
    public long getClassId() {
        return 368;
    }
    
    public ArticleWrapper4Public getArticle() throws PersistenceException {
        return ((PersistentReOrderForPreorderCommand)this.getTheObject()).getArticle();
    }
    public void setArticle(ArticleWrapper4Public newValue) throws PersistenceException {
        ((PersistentReOrderForPreorderCommand)this.getTheObject()).setArticle(newValue);
    }
    public long getQuantity() throws PersistenceException {
        return ((PersistentReOrderForPreorderCommand)this.getTheObject()).getQuantity();
    }
    public void setQuantity(long newValue) throws PersistenceException {
        ((PersistentReOrderForPreorderCommand)this.getTheObject()).setQuantity(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentReOrderForPreorderCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentReOrderForPreorderCommand)this.getTheObject()).setInvoker(newValue);
    }
    public ReOrderManager4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentReOrderForPreorderCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(ReOrderManager4Public newValue) throws PersistenceException {
        ((PersistentReOrderForPreorderCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentReOrderForPreorderCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentReOrderForPreorderCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentReOrderForPreorderCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentReOrderForPreorderCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentReOrderForPreorderCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentReOrderForPreorderCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleReOrderForPreorderCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderForPreorderCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderForPreorderCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderForPreorderCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleReOrderForPreorderCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderForPreorderCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderForPreorderCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderForPreorderCommand(this);
    }
    public void accept(ReOrderManagerCommandVisitor visitor) throws PersistenceException {
        visitor.handleReOrderForPreorderCommand(this);
    }
    public <R> R accept(ReOrderManagerCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderForPreorderCommand(this);
    }
    public <E extends model.UserException>  void accept(ReOrderManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderForPreorderCommand(this);
    }
    public <R, E extends model.UserException> R accept(ReOrderManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderForPreorderCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleReOrderForPreorderCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderForPreorderCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderForPreorderCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderForPreorderCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentReOrderForPreorderCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentReOrderForPreorderCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentReOrderForPreorderCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentReOrderForPreorderCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentReOrderForPreorderCommand)this.getTheObject()).sendResult();
    }

    
}
