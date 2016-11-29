package persistence;

import model.visitor.*;

/* Additional import section end */

public interface CustomerDeliveryTimeManagerCommand extends  Command {
    
    

    public void accept(CustomerDeliveryTimeManagerCommandVisitor visitor) throws PersistenceException;
    public <R> R accept(CustomerDeliveryTimeManagerCommandReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(CustomerDeliveryTimeManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(CustomerDeliveryTimeManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

