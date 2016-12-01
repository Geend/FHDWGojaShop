package persistence;

import model.visitor.*;

/* Additional import section end */

public interface ReturnManagerCommand extends  Command {
    
    

    public void accept(ReturnManagerCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(ReturnManagerCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ReturnManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ReturnManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

