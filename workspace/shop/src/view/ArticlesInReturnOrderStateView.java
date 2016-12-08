package view;

import view.visitor.*;

public interface ArticlesInReturnOrderStateView extends OrderStatusView {
    
    public ArticleReturnView getArticleReturn()throws ModelException;
    public void setArticleReturn(ArticleReturnView newValue) throws ModelException ;
    public long getTicksLeft()throws ModelException;
    public void setTicksLeft(long newValue) throws ModelException ;
    
    public void accept(OrderStatusVisitor visitor) throws ModelException;
    public <R> R accept(OrderStatusReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(OrderStatusExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(OrderStatusReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

