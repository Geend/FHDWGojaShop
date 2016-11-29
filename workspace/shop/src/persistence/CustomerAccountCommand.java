package persistence;

import model.visitor.*;

/* Additional import section end */

public interface CustomerAccountCommand extends  Command {
    
    

    public void accept(CustomerAccountCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(CustomerAccountCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(CustomerAccountCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(CustomerAccountCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

