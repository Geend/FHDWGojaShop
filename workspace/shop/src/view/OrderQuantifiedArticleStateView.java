package view;

import view.objects.*;

import view.visitor.*;

public interface OrderQuantifiedArticleStateView extends Anything, AbstractViewRoot {
    
    
    public void accept(OrderQuantifiedArticleStateVisitor visitor) throws ModelException;
    public <R> R accept(OrderQuantifiedArticleStateReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(OrderQuantifiedArticleStateExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(OrderQuantifiedArticleStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

