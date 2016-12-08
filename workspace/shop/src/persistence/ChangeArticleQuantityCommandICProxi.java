package persistence;



import model.visitor.*;

public class ChangeArticleQuantityCommandICProxi extends PersistentInCacheProxi implements PersistentChangeArticleQuantityCommand{
    
    public ChangeArticleQuantityCommandICProxi(long objectId) {
        super(objectId);
    }
    public ChangeArticleQuantityCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theChangeArticleQuantityCommandFacade
            .getChangeArticleQuantityCommand(this.getId());
    }
    
    public long getClassId() {
        return 294;
    }
    
    public long getNewQuantity() throws PersistenceException {
        return ((PersistentChangeArticleQuantityCommand)this.getTheObject()).getNewQuantity();
    }
    public void setNewQuantity(long newValue) throws PersistenceException {
        ((PersistentChangeArticleQuantityCommand)this.getTheObject()).setNewQuantity(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentChangeArticleQuantityCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentChangeArticleQuantityCommand)this.getTheObject()).setInvoker(newValue);
    }
    public ShoppingCartQuantifiedArticle4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentChangeArticleQuantityCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(ShoppingCartQuantifiedArticle4Public newValue) throws PersistenceException {
        ((PersistentChangeArticleQuantityCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentChangeArticleQuantityCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentChangeArticleQuantityCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentChangeArticleQuantityCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentChangeArticleQuantityCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentChangeArticleQuantityCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentChangeArticleQuantityCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleChangeArticleQuantityCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeArticleQuantityCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeArticleQuantityCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeArticleQuantityCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleChangeArticleQuantityCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeArticleQuantityCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeArticleQuantityCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeArticleQuantityCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleChangeArticleQuantityCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeArticleQuantityCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeArticleQuantityCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeArticleQuantityCommand(this);
    }
    public void accept(ShoppingCartQuantifiedArticleCommandVisitor visitor) throws PersistenceException {
        visitor.handleChangeArticleQuantityCommand(this);
    }
    public <R> R accept(ShoppingCartQuantifiedArticleCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeArticleQuantityCommand(this);
    }
    public <E extends model.UserException>  void accept(ShoppingCartQuantifiedArticleCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeArticleQuantityCommand(this);
    }
    public <R, E extends model.UserException> R accept(ShoppingCartQuantifiedArticleCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeArticleQuantityCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentChangeArticleQuantityCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentChangeArticleQuantityCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentChangeArticleQuantityCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentChangeArticleQuantityCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentChangeArticleQuantityCommand)this.getTheObject()).sendResult();
    }

    
}
