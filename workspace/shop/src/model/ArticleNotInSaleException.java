
package model;

import constants.StringConstants;
import persistence.*;
import model.visitor.*;


/* Additional import section end */

@SuppressWarnings("serial")
public class ArticleNotInSaleException extends model.ArticleOrderException{
    
    
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
    
    public ArticleNotInSaleException(String message) throws PersistenceException {
        super(message);        
    }
    
    static public long getTypeId() {
        return -440;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    
    public void accept(ArticleOrderExceptionVisitor visitor) throws PersistenceException {
        visitor.handleArticleNotInSaleException(this);
    }
    public <R> R accept(ArticleOrderExceptionReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticleNotInSaleException(this);
    }
    public <E extends model.UserException>  void accept(ArticleOrderExceptionExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticleNotInSaleException(this);
    }
    public <R, E extends model.UserException> R accept(ArticleOrderExceptionReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticleNotInSaleException(this);
    }
    public void accept(UserExceptionVisitor visitor) throws PersistenceException {
        visitor.handleArticleNotInSaleException(this);
    }
    public <R> R accept(UserExceptionReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticleNotInSaleException(this);
    }
    public <E extends model.UserException>  void accept(UserExceptionExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticleNotInSaleException(this);
    }
    public <R, E extends model.UserException> R accept(UserExceptionReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticleNotInSaleException(this);
    }
    public int getLeafInfo() throws PersistenceException{
        return 0;
    }
    
    
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */

    public ArticleNotInSaleException() throws PersistenceException {
        super(StringConstants.ARTICLE_NOT_IN_SALE_EXCEPTION_MESSAGE);
    }
    /* End of protected part that is not overridden by persistence generator */
    
}
