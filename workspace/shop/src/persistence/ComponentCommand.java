package persistence;

import model.visitor.*;

/* Additional import section end */

public interface ComponentCommand extends  Command {
    
    

    public void accept(ComponentCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(ComponentCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ComponentCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ComponentCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

