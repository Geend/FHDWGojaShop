package persistence;

import model.visitor.*;

/* Additional import section end */

public interface SubComponentCommand extends  Command {
    
    

    public void accept(SubComponentCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(SubComponentCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubComponentCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubComponentCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

