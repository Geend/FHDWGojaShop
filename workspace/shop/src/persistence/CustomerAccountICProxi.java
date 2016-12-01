package persistence;



import model.visitor.*;

public class CustomerAccountICProxi extends PersistentInCacheProxiOptimistic implements PersistentCustomerAccount{
    
    public CustomerAccountICProxi(long objectId) {
        super(objectId);
    }
    public CustomerAccountICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade
            .getCustomerAccount(this.getId());
    }
    
    public long getClassId() {
        return 239;
    }
    
    public String getName() throws PersistenceException {
        return ((PersistentCustomerAccount)this.getTheObject()).getName();
    }
    public void setName(String newValue) throws PersistenceException {
        ((PersistentCustomerAccount)this.getTheObject()).setName(newValue);
    }
    public common.Fraction getBalance() throws PersistenceException {
        return ((PersistentCustomerAccount)this.getTheObject()).getBalance();
    }
    public void setBalance(common.Fraction newValue) throws PersistenceException {
        ((PersistentCustomerAccount)this.getTheObject()).setBalance(newValue);
    }
    public common.Fraction getLimit() throws PersistenceException {
        return ((PersistentCustomerAccount)this.getTheObject()).getLimit();
    }
    public void setLimit(common.Fraction newValue) throws PersistenceException {
        ((PersistentCustomerAccount)this.getTheObject()).setLimit(newValue);
    }
    public ShoppingCart4Public getShoppingCart() throws PersistenceException {
        return ((PersistentCustomerAccount)this.getTheObject()).getShoppingCart();
    }
    public void setShoppingCart(ShoppingCart4Public newValue) throws PersistenceException {
        ((PersistentCustomerAccount)this.getTheObject()).setShoppingCart(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentCustomerAccount)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentCustomerAccount)this.getTheObject()).setSubService(newValue);
    }
    public PersistentCustomerAccount getThis() throws PersistenceException {
        return ((PersistentCustomerAccount)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerAccount(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerAccount(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerAccount(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerAccount(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerAccount(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerAccount(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerAccount(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerAccount(this);
    }
    
    
    public void debit(final common.Fraction amount, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomerAccount)this.getTheObject()).debit(amount, invoker);
    }
    public void deposit(final common.Fraction amount, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomerAccount)this.getTheObject()).deposit(amount, invoker);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCustomerAccount)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCustomerAccount)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCustomerAccount)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCustomerAccount)this.getTheObject()).updateObservers(event);
    }
    public void withdraw(final common.Fraction amount, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomerAccount)this.getTheObject()).withdraw(amount, invoker);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCustomerAccount)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void debit(final common.Fraction amount) 
				throws model.NotEnoughMoneyException, PersistenceException{
        ((PersistentCustomerAccount)this.getTheObject()).debit(amount);
    }
    public void deposit(final common.Fraction amount) 
				throws PersistenceException{
        ((PersistentCustomerAccount)this.getTheObject()).deposit(amount);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCustomerAccount)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCustomerAccount)this.getTheObject()).initializeOnInstantiation();
    }
    public void withdraw(final common.Fraction amount) 
				throws model.NotEnoughMoneyException, PersistenceException{
        ((PersistentCustomerAccount)this.getTheObject()).withdraw(amount);
    }

    
}
