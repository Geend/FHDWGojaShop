package persistence;


import model.visitor.*;

public interface Settings4Public extends Anything, SubjInterface, AbstractPersistentProxi {
    
    public common.Fraction getNewCustomerDefaultBalance() throws PersistenceException ;
    public common.Fraction getNewCustomerDefaultLimit() throws PersistenceException ;
    public common.Fraction getReturnPercentage() throws PersistenceException ;
    
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void changeNewCustomerDefaultBalance(final common.Fraction newValue) 
				throws model.InvalidInputException, PersistenceException;
    public void changeNewCustomerDefaultLimit(final common.Fraction newValue) 
				throws model.InvalidInputException, PersistenceException;
    public void changeReturnPercentage(final common.Fraction newValue) 
				throws model.InvalidInputException, PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;

}

