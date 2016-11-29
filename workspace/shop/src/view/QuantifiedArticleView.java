package view;

import view.objects.*;

import view.visitor.*;

public interface QuantifiedArticleView extends Anything, AbstractViewRoot {
    
    public long getQuantity()throws ModelException;
    public void setQuantity(long newValue) throws ModelException ;
    public ArticleWrapperView getArticle()throws ModelException;
    public void setArticle(ArticleWrapperView newValue) throws ModelException ;
    
    public void accept(QuantifiedArticleVisitor visitor) throws ModelException;
    public <R> R accept(QuantifiedArticleReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(QuantifiedArticleExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(QuantifiedArticleReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

