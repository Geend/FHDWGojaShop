package persistence;



import model.visitor.*;

public class NewArticleCommandProxi extends PersistentProxi implements PersistentNewArticleCommand{
    
    public NewArticleCommandProxi(long objectId) {
        super(objectId);
    }
    public NewArticleCommandProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 272;
    }
    
    public ComponentContainer getParent() throws PersistenceException {
        return ((PersistentNewArticleCommand)this.getTheObject()).getParent();
    }
    public void setParent(ComponentContainer newValue) throws PersistenceException {
        ((PersistentNewArticleCommand)this.getTheObject()).setParent(newValue);
    }
    public String getName() throws PersistenceException {
        return ((PersistentNewArticleCommand)this.getTheObject()).getName();
    }
    public void setName(String newValue) throws PersistenceException {
        ((PersistentNewArticleCommand)this.getTheObject()).setName(newValue);
    }
    public common.Fraction getPrice() throws PersistenceException {
        return ((PersistentNewArticleCommand)this.getTheObject()).getPrice();
    }
    public void setPrice(common.Fraction newValue) throws PersistenceException {
        ((PersistentNewArticleCommand)this.getTheObject()).setPrice(newValue);
    }
    public long getMinStock() throws PersistenceException {
        return ((PersistentNewArticleCommand)this.getTheObject()).getMinStock();
    }
    public void setMinStock(long newValue) throws PersistenceException {
        ((PersistentNewArticleCommand)this.getTheObject()).setMinStock(newValue);
    }
    public long getMaxStock() throws PersistenceException {
        return ((PersistentNewArticleCommand)this.getTheObject()).getMaxStock();
    }
    public void setMaxStock(long newValue) throws PersistenceException {
        ((PersistentNewArticleCommand)this.getTheObject()).setMaxStock(newValue);
    }
    public long getProducerDeliveryTime() throws PersistenceException {
        return ((PersistentNewArticleCommand)this.getTheObject()).getProducerDeliveryTime();
    }
    public void setProducerDeliveryTime(long newValue) throws PersistenceException {
        ((PersistentNewArticleCommand)this.getTheObject()).setProducerDeliveryTime(newValue);
    }
    public Producer4Public getProducer() throws PersistenceException {
        return ((PersistentNewArticleCommand)this.getTheObject()).getProducer();
    }
    public void setProducer(Producer4Public newValue) throws PersistenceException {
        ((PersistentNewArticleCommand)this.getTheObject()).setProducer(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentNewArticleCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentNewArticleCommand)this.getTheObject()).setInvoker(newValue);
    }
    public Shop4Public getCommandReceiver() throws PersistenceException {
        return ((PersistentNewArticleCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(Shop4Public newValue) throws PersistenceException {
        ((PersistentNewArticleCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public ArticleWrapper4Public getCommandResult() throws PersistenceException {
        return ((PersistentNewArticleCommand)this.getTheObject()).getCommandResult();
    }
    public void setCommandResult(ArticleWrapper4Public newValue) throws PersistenceException {
        ((PersistentNewArticleCommand)this.getTheObject()).setCommandResult(newValue);
    }
    public CommonDate4Public getMyCommonDate() throws PersistenceException {
        return ((PersistentNewArticleCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(CommonDate4Public newValue) throws PersistenceException {
        ((PersistentNewArticleCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentNewArticleCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentNewArticleCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentNewArticleCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentNewArticleCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleNewArticleCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewArticleCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleNewArticleCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewArticleCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleNewArticleCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewArticleCommand(this);
    }
    public void accept(ShopCommandVisitor visitor) throws PersistenceException {
        visitor.handleNewArticleCommand(this);
    }
    public <R> R accept(ShopCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(ShopCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(ShopCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewArticleCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentNewArticleCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentNewArticleCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentNewArticleCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentNewArticleCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentNewArticleCommand)this.getTheObject()).sendResult();
    }

    
}
