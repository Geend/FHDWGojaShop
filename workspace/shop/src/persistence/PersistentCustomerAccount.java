package persistence;


public interface PersistentCustomerAccount extends Anything, SubjInterface, AbstractPersistentProxi, CustomerAccount4Public {
    
    public void setName(String newValue) throws PersistenceException ;
    public void setBalance(common.Fraction newValue) throws PersistenceException ;
    public common.Fraction getLimit() throws PersistenceException ;
    public void setLimit(common.Fraction newValue) throws PersistenceException ;
    public ShoppingCart4Public getShoppingCart() throws PersistenceException ;
    public void setShoppingCart(ShoppingCart4Public newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentCustomerAccount getThis() throws PersistenceException ;
    
    

}

