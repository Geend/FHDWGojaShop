package persistence;

import model.visitor.*;

/* Additional import section end */

public interface ComponentLstCommand extends  Command {
    
    

    public void accept(ComponentLstCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(ComponentLstCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ComponentLstCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ComponentLstCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

