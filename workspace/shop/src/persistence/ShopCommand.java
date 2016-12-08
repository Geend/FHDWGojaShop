package persistence;

import model.visitor.*;

/* Additional import section end */

public interface ShopCommand extends  Command {
    
    

    public void accept(ShopCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(ShopCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ShopCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ShopCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

