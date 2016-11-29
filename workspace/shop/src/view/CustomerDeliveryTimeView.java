package view;

import view.objects.*;

import view.visitor.*;

public interface CustomerDeliveryTimeView extends Anything, AbstractViewRoot {
    
    public String getName()throws ModelException;
    public void setName(String newValue) throws ModelException ;
    public common.Fraction getPrice()throws ModelException;
    public void setPrice(common.Fraction newValue) throws ModelException ;
    public long getDeliveryTime()throws ModelException;
    public void setDeliveryTime(long newValue) throws ModelException ;
    
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

