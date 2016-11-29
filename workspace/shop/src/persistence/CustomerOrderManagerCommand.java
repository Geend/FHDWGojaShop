package persistence;

import model.visitor.*;

/* Additional import section end */

public interface CustomerOrderManagerCommand extends  Command {
    
    

    public void accept(CustomerOrderManagerCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(CustomerOrderManagerCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(CustomerOrderManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(CustomerOrderManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

