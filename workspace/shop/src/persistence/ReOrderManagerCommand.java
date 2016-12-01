package persistence;


/* Additional import section end */

import model.visitor.ReOrderManagerCommandExceptionVisitor;
import model.visitor.ReOrderManagerCommandReturnExceptionVisitor;
import model.visitor.ReOrderManagerCommandReturnVisitor;
import model.visitor.ReOrderManagerCommandVisitor;

public interface ReOrderManagerCommand extends  Command {
    
    

    public void accept(ReOrderManagerCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(ReOrderManagerCommandReturnVisitor<R> visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ReOrderManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ReOrderManagerCommandReturnExceptionVisitor<R, E> visitor) throws PersistenceException, E;
}

