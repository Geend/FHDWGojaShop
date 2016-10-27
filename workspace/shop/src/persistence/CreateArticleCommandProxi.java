package persistence;



import model.visitor.*;

public class CreateArticleCommandProxi extends PersistentProxi implements PersistentCreateArticleCommand{
    
    public CreateArticleCommandProxi(long objectId) {
        super(objectId);
    }
    public CreateArticleCommandProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 172;
    }
    
    public String getName() throws PersistenceException {
        return ((PersistentCreateArticleCommand)this.getTheObject()).getName();
    }
    public void setName(String newValue) throws PersistenceException {
        ((PersistentCreateArticleCommand)this.getTheObject()).setName(newValue);
    }
    public common.Fraction getPrice() throws PersistenceException {
        return ((PersistentCreateArticleCommand)this.getTheObject()).getPrice();
    }
    public void setPrice(common.Fraction newValue) throws PersistenceException {
        ((PersistentCreateArticleCommand)this.getTheObject()).setPrice(newValue);
    }
    public long getMinStock() throws PersistenceException {
        return ((PersistentCreateArticleCommand)this.getTheObject()).getMinStock();
    }
    public void setMinStock(long newValue) throws PersistenceException {
        ((PersistentCreateArticleCommand)this.getTheObject()).setMinStock(newValue);
    }
    public long getMaxStock() throws PersistenceException {
        return ((PersistentCreateArticleCommand)this.getTheObject()).getMaxStock();
    }
    public void setMaxStock(long newValue) throws PersistenceException {
        ((PersistentCreateArticleCommand)this.getTheObject()).setMaxStock(newValue);
    }
    public long getProducerDeliveryTime() throws PersistenceException {
        return ((PersistentCreateArticleCommand)this.getTheObject()).getProducerDeliveryTime();
    }
    public void setProducerDeliveryTime(long newValue) throws PersistenceException {
        ((PersistentCreateArticleCommand)this.getTheObject()).setProducerDeliveryTime(newValue);
    }
    public PersistentProducer getProducer() throws PersistenceException {
        return ((PersistentCreateArticleCommand)this.getTheObject()).getProducer();
    }
    public void setProducer(PersistentProducer newValue) throws PersistenceException {
        ((PersistentCreateArticleCommand)this.getTheObject()).setProducer(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentCreateArticleCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentCreateArticleCommand)this.getTheObject()).setInvoker(newValue);
    }
    public PersistentProductGroup getCommandReceiver() throws PersistenceException {
        return ((PersistentCreateArticleCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(PersistentProductGroup newValue) throws PersistenceException {
        ((PersistentCreateArticleCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public PersistentArticle getCommandResult() throws PersistenceException {
        return ((PersistentCreateArticleCommand)this.getTheObject()).getCommandResult();
    }
    public void setCommandResult(PersistentArticle newValue) throws PersistenceException {
        ((PersistentCreateArticleCommand)this.getTheObject()).setCommandResult(newValue);
    }
    public PersistentCommonDate getMyCommonDate() throws PersistenceException {
        return ((PersistentCreateArticleCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException {
        ((PersistentCreateArticleCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentCreateArticleCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentCreateArticleCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentCreateArticleCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentCreateArticleCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleCreateArticleCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCreateArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCreateArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCreateArticleCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCreateArticleCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCreateArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCreateArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCreateArticleCommand(this);
    }
    public void accept(ProductGroupCommandVisitor visitor) throws PersistenceException {
        visitor.handleCreateArticleCommand(this);
    }
    public <R> R accept(ProductGroupCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCreateArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(ProductGroupCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCreateArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(ProductGroupCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCreateArticleCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleCreateArticleCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCreateArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCreateArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCreateArticleCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentCreateArticleCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentCreateArticleCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentCreateArticleCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentCreateArticleCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentCreateArticleCommand)this.getTheObject()).sendResult();
    }

    
}
