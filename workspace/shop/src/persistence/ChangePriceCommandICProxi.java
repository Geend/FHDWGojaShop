package persistence;



import model.visitor.*;

public class ChangePriceCommandICProxi extends PersistentInCacheProxi implements PersistentChangePriceCommand{
    
    public ChangePriceCommandICProxi(long objectId) {
        super(objectId);
    }
    public ChangePriceCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theChangePriceCommandFacade
            .getChangePriceCommand(this.getId());
    }
    
    public long getClassId() {
        return 291;
    }
    
    public common.Fraction getNewPrice() throws PersistenceException {
        return ((PersistentChangePriceCommand)this.getTheObject()).getNewPrice();
    }
    public void setNewPrice(common.Fraction newValue) throws PersistenceException {
        ((PersistentChangePriceCommand)this.getTheObject()).setNewPrice(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentChangePriceCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentChangePriceCommand)this.getTheObject()).setInvoker(newValue);
    }
    public ArticleWrapper4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentChangePriceCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(ArticleWrapper4Public newValue) throws PersistenceException {
        ((PersistentChangePriceCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentChangePriceCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentChangePriceCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentChangePriceCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentChangePriceCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentChangePriceCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentChangePriceCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleChangePriceCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangePriceCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangePriceCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangePriceCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleChangePriceCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangePriceCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangePriceCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangePriceCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleChangePriceCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangePriceCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangePriceCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangePriceCommand(this);
    }
    public void accept(ArticleWrapperCommandVisitor visitor) throws PersistenceException {
        visitor.handleChangePriceCommand(this);
    }
    public <R> R accept(ArticleWrapperCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangePriceCommand(this);
    }
    public <E extends model.UserException>  void accept(ArticleWrapperCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangePriceCommand(this);
    }
    public <R, E extends model.UserException> R accept(ArticleWrapperCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangePriceCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentChangePriceCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentChangePriceCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentChangePriceCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentChangePriceCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentChangePriceCommand)this.getTheObject()).sendResult();
    }

    
}
