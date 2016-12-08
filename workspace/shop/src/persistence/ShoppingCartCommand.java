package persistence;

import model.visitor.*;

/* Additional import section end */

public interface ShoppingCartCommand extends  Command {
    
    

    public void accept(ShoppingCartCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(ShoppingCartCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ShoppingCartCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ShoppingCartCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

