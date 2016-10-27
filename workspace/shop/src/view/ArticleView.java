package view;

import view.visitor.*;

public interface ArticleView extends ComponentView {
    
    public common.Fraction getPrice()throws ModelException;
    public void setPrice(common.Fraction newValue) throws ModelException ;
    public long getMinStock()throws ModelException;
    public void setMinStock(long newValue) throws ModelException ;
    public long getMaxStock()throws ModelException;
    public void setMaxStock(long newValue) throws ModelException ;
    public long getCurrentStock()throws ModelException;
    public void setCurrentStock(long newValue) throws ModelException ;
    public long getProducerDeliveryTime()throws ModelException;
    public void setProducerDeliveryTime(long newValue) throws ModelException ;
    public ProducerView getProducer()throws ModelException;
    public void setProducer(ProducerView newValue) throws ModelException ;
    public ArticleStateView getState()throws ModelException;
    public void setState(ArticleStateView newValue) throws ModelException ;
    
    public void accept(ComponentVisitor visitor) throws ModelException;
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

