package persistence;



import model.visitor.*;

public class AddArticleCommandICProxi extends PersistentInCacheProxi implements PersistentAddArticleCommand{
    
    public AddArticleCommandICProxi(long objectId) {
        super(objectId);
    }
    public AddArticleCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theAddArticleCommandFacade
            .getAddArticleCommand(this.getId());
    }
    
    public long getClassId() {
        return 292;
    }
    
    public ShoppingCartQuantifiedArticle4Public getArticle() throws PersistenceException {
        return ((PersistentAddArticleCommand)this.getTheObject()).getArticle();
    }
    public void setArticle(ShoppingCartQuantifiedArticle4Public newValue) throws PersistenceException {
        ((PersistentAddArticleCommand)this.getTheObject()).setArticle(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentAddArticleCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentAddArticleCommand)this.getTheObject()).setInvoker(newValue);
    }
    public ShoppingCart4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentAddArticleCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(ShoppingCart4Public newValue) throws PersistenceException {
        ((PersistentAddArticleCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentAddArticleCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentAddArticleCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentAddArticleCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentAddArticleCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentAddArticleCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentAddArticleCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleAddArticleCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAddArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAddArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAddArticleCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleAddArticleCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAddArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAddArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAddArticleCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleAddArticleCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAddArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAddArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAddArticleCommand(this);
    }
    public void accept(ShoppingCartCommandVisitor visitor) throws PersistenceException {
        visitor.handleAddArticleCommand(this);
    }
    public <R> R accept(ShoppingCartCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAddArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(ShoppingCartCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAddArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(ShoppingCartCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAddArticleCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentAddArticleCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentAddArticleCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentAddArticleCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentAddArticleCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentAddArticleCommand)this.getTheObject()).sendResult();
    }

    
}
