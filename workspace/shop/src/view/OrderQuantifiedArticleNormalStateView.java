package view;

import view.visitor.*;

public interface OrderQuantifiedArticleNormalStateView extends OrderQuantifiedArticleStateView {
    
    
    public void accept(OrderQuantifiedArticleStateVisitor visitor) throws ModelException;
    public <R> R accept(OrderQuantifiedArticleStateReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(OrderQuantifiedArticleStateExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(OrderQuantifiedArticleStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

