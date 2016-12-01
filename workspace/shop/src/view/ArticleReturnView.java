package view;

import view.objects.*;

import view.visitor.*;

public interface ArticleReturnView extends Anything, AbstractViewRoot {
    
    public OrderView getOrder()throws ModelException;
    public void setOrder(OrderView newValue) throws ModelException ;
    public java.util.Vector<ReturnQuantifiedArticleView> getReturnArticles()throws ModelException;
    public void setReturnArticles(java.util.Vector<ReturnQuantifiedArticleView> newValue) throws ModelException ;
    
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

