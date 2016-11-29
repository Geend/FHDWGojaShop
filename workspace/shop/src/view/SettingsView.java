package view;

import view.objects.*;

import view.visitor.*;

public interface SettingsView extends Anything, AbstractViewRoot {
    
    public common.Fraction getNewCustomerDefaultBalance()throws ModelException;
    public void setNewCustomerDefaultBalance(common.Fraction newValue) throws ModelException ;
    public common.Fraction getNewCustomerDefaultLimit()throws ModelException;
    public void setNewCustomerDefaultLimit(common.Fraction newValue) throws ModelException ;
    public common.Fraction getReturnPercentage()throws ModelException;
    public void setReturnPercentage(common.Fraction newValue) throws ModelException ;
    
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

