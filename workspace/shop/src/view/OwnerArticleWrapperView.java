package view;

import view.visitor.*;

public interface OwnerArticleWrapperView extends ArticleWrapperView {
    
    public ArticleView getArticle()throws ModelException;
    public String getName()throws ModelException;
    public common.Fraction getPrice()throws ModelException;
    public long getMinStock()throws ModelException;
    public long getMaxStock()throws ModelException;
    public long getCurrentStock()throws ModelException;
    public long getProducerDeliveryTime()throws ModelException;
    public String getCurrentState()throws ModelException;
    public String getProducerName()throws ModelException;
    public ArticleStateView getState()throws ModelException;
    
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

