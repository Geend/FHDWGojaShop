package persistence;


public interface PersistentCustomerAccount extends Anything, AbstractPersistentProxi, CustomerAccount4Public {
    
    public common.Fraction getBalance() throws PersistenceException ;
    public void setBalance(common.Fraction newValue) throws PersistenceException ;
    public long getLimit() throws PersistenceException ;
    public void setLimit(long newValue) throws PersistenceException ;
    public PersistentShoppingCart getShoppingCart() throws PersistenceException ;
    public void setShoppingCart(PersistentShoppingCart newValue) throws PersistenceException ;
    public PersistentCustomerAccount getThis() throws PersistenceException ;
    
    

}

