package view;

import view.objects.*;

import view.visitor.*;

public interface ArticleStateView extends Anything, AbstractViewRoot {
    
    
    public void accept(ArticleStateVisitor visitor) throws ModelException;
    public <R> R accept(ArticleStateReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ArticleStateExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ArticleStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

