
package view;


import viewClient.*;
import view.visitor.*;


/* Additional import section end */

@SuppressWarnings("serial")
public class OrderNotAcceptableException extends view.UserException{
    
    public static OrderNotAcceptableException fromHashtableToOrderNotAcceptableException(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        String message = (String)resultTable.get("?Message?");
        return new OrderNotAcceptableException(message);
    }
    
    public OrderNotAcceptableException(String message) {
        /* Shall not be used. Objects are created on the server only */
        super(message);        
    }
    
    
    public void accept(UserExceptionVisitor visitor) throws ModelException {
        visitor.handleOrderNotAcceptableException(this);
    }
    public <R> R accept(UserExceptionReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderNotAcceptableException(this);
    }
    public <E extends view.UserException>  void accept(UserExceptionExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderNotAcceptableException(this);
    }
    public <R, E extends view.UserException> R accept(UserExceptionReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderNotAcceptableException(this);
    }
    
    
}
