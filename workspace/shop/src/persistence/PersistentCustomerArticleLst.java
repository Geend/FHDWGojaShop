package persistence;


public interface PersistentCustomerArticleLst extends Anything, SubjInterface, AbstractPersistentProxi, CustomerArticleLst4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentCustomerArticleLst getThis() throws PersistenceException ;
    
    

}

