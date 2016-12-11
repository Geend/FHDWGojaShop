package persistence;


public interface PersistentSettings extends Anything, SubjInterface, AbstractPersistentProxi, Settings4Public {
    
    public void setNewCustomerDefaultBalance(common.Fraction newValue) throws PersistenceException ;
    public void setNewCustomerDefaultLimit(common.Fraction newValue) throws PersistenceException ;
    public void setReturnPercentage(common.Fraction newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentSettings getThis() throws PersistenceException ;
    
    

}

