
package view;


import viewClient.*;
import view.visitor.*;


/* Additional import section end */

@SuppressWarnings("serial")
public class ArticleNotInSaleException extends view.ArticleOrderException{
    
    public static ArticleNotInSaleException fromHashtableToArticleNotInSaleException(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        String message = (String)resultTable.get("?Message?");
        return new ArticleNotInSaleException(message);
    }
    
    public ArticleNotInSaleException(String message) {
        /* Shall not be used. Objects are created on the server only */
        super(message);        
    }
    
    
    public void accept(ArticleOrderExceptionVisitor visitor) throws ModelException {
        visitor.handleArticleNotInSaleException(this);
    }
    public <R> R accept(ArticleOrderExceptionReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArticleNotInSaleException(this);
    }
    public <E extends view.UserException>  void accept(ArticleOrderExceptionExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArticleNotInSaleException(this);
    }
    public <R, E extends view.UserException> R accept(ArticleOrderExceptionReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArticleNotInSaleException(this);
    }
    public void accept(UserExceptionVisitor visitor) throws ModelException {
        visitor.handleArticleNotInSaleException(this);
    }
    public <R> R accept(UserExceptionReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArticleNotInSaleException(this);
    }
    public <E extends view.UserException>  void accept(UserExceptionExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArticleNotInSaleException(this);
    }
    public <R, E extends view.UserException> R accept(UserExceptionReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArticleNotInSaleException(this);
    }
    
    
}
