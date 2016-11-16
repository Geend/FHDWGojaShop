package view;

import view.visitor.*;

public interface ShopArticleWrapperView extends ArticleWrapperView {
    
    
    public void accept(ArticleWrapperVisitor visitor) throws ModelException;
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(ComponentWrapperVisitor visitor) throws ModelException;
    public <R> R accept(ComponentWrapperReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ComponentWrapperExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ComponentWrapperReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

