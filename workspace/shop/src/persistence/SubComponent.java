package persistence;

import model.visitor.*;

/* Additional import section end */

public interface SubComponent extends  SubjInterface {
    public ProductGroup4Public getParent() throws PersistenceException ;
    public void setParent(ProductGroup4Public newValue) throws PersistenceException ;
    
    
    public void moveTo(final ProductGroup4Public productGroup) 
				throws model.CycleException, PersistenceException;
    public void moveTo(final ProductGroup4Public productGroup, final Invoker invoker) 
				throws PersistenceException;
    public void moveToImplementation(final ProductGroup4Public productGroup) 
				throws model.CycleException, PersistenceException;

    public void accept(SubComponentVisitor visitor) throws PersistenceException;
    public <R> R accept(SubComponentReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubComponentExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

