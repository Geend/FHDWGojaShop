package persistence;

import model.visitor.*;

/* Additional import section end */

public interface CustomerRegisterServiceCommand extends  Command {
    
    

    public void accept(CustomerRegisterServiceCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(CustomerRegisterServiceCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(CustomerRegisterServiceCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(CustomerRegisterServiceCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

