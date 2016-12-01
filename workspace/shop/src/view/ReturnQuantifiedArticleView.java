package view;

import view.visitor.*;

public interface ReturnQuantifiedArticleView extends QuantifiedArticleView {
    
    
    public void accept(QuantifiedArticleVisitor visitor) throws ModelException;
    public <R> R accept(QuantifiedArticleReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(QuantifiedArticleExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(QuantifiedArticleReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

