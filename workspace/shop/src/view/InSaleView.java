package view;

import view.visitor.*;

public interface InSaleView extends ArticleStateView {
    
    
    public void accept(ArticleStateVisitor visitor) throws ModelException;
    public <R> R accept(ArticleStateReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ArticleStateExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ArticleStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

