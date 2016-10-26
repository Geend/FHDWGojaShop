package view;

import view.objects.*;

import view.visitor.*;

public interface ArticleWrapperView extends Anything, AbstractViewRoot {
    
    public ArticleView getArticle()throws ModelException;
    public void setArticle(ArticleView newValue) throws ModelException ;
    public String getName()throws ModelException;
    
    public void accept(ArticleWrapperVisitor visitor) throws ModelException;
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

