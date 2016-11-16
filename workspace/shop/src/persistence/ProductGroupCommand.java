package persistence;

import model.visitor.*;

/* Additional import section end */

public interface ProductGroupCommand extends  Command {
    
    

    public void accept(ProductGroupCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(ProductGroupCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ProductGroupCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ProductGroupCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

