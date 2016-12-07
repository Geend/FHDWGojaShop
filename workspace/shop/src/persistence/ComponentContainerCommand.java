package persistence;

import model.visitor.*;

/* Additional import section end */

public interface ComponentContainerCommand extends  Command {
    
    

    public void accept(ComponentContainerCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(ComponentContainerCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ComponentContainerCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ComponentContainerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

