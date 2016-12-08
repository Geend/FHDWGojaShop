
package view;


import view.visitor.*;


/* Additional import section end */

@SuppressWarnings("serial")
public abstract class ArticleOrderException extends view.UserException{
    
    
    public ArticleOrderException(String message) {
        /* Shall not be used. Objects are created on the server only */
        super(message);        
    }
    
    
    abstract public void accept(ArticleOrderExceptionVisitor visitor) throws ModelException;
    abstract public <R> R accept(ArticleOrderExceptionReturnVisitor<R>  visitor) throws ModelException;
    abstract public <E extends view.UserException>  void accept(ArticleOrderExceptionExceptionVisitor<E> visitor) throws ModelException, E;
    abstract public <R, E extends view.UserException> R accept(ArticleOrderExceptionReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
    
}
