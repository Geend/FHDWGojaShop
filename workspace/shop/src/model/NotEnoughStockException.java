
package model;

import constants.StringConstants;
import persistence.*;
import model.visitor.*;

import java.text.MessageFormat;


/* Additional import section end */

@SuppressWarnings("serial")
public class NotEnoughStockException extends model.ArticleOrderException{
    
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            
        }
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    
    public NotEnoughStockException(String message) throws PersistenceException {
        super(message);        
    }
    
    static public long getTypeId() {
        return -221;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    
    public void accept(ArticleOrderExceptionVisitor visitor) throws PersistenceException {
        visitor.handleNotEnoughStockException(this);
    }
    public <R> R accept(ArticleOrderExceptionReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNotEnoughStockException(this);
    }
    public <E extends model.UserException>  void accept(ArticleOrderExceptionExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNotEnoughStockException(this);
    }
    public <R, E extends model.UserException> R accept(ArticleOrderExceptionReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNotEnoughStockException(this);
    }
    public void accept(UserExceptionVisitor visitor) throws PersistenceException {
        visitor.handleNotEnoughStockException(this);
    }
    public <R> R accept(UserExceptionReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNotEnoughStockException(this);
    }
    public <E extends model.UserException>  void accept(UserExceptionExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNotEnoughStockException(this);
    }
    public <R, E extends model.UserException> R accept(UserExceptionReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNotEnoughStockException(this);
    }
    public int getLeafInfo() throws PersistenceException{
        return 0;
    }
    
    
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    public NotEnoughStockException(Long avaliable, Long requested) throws PersistenceException {
        super(MessageFormat.format(StringConstants.NOT_ENOUGH_STOCK_EXCEPTION_MESSAGE, avaliable, requested));
    }

    /* End of protected part that is not overridden by persistence generator */
    
}
