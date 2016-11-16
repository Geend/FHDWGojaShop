package persistence;

import model.visitor.*;

/* Additional import section end */

public interface ProducerLstCommand extends  Command {
    
    

    public void accept(ProducerLstCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(ProducerLstCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ProducerLstCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ProducerLstCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

