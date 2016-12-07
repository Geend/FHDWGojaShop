package view;

import view.objects.*;

import view.visitor.*;

public interface ShopView extends Anything, AbstractViewRoot {
    
    public ComponentManagerView getComponentManager()throws ModelException;
    public void setComponentManager(ComponentManagerView newValue) throws ModelException ;
    public ProducerLstView getPrmanager()throws ModelException;
    public void setPrmanager(ProducerLstView newValue) throws ModelException ;
    public CustomerDeliveryTimeManagerView getCustomerDeliveryTimeManager()throws ModelException;
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManagerView newValue) throws ModelException ;
    
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

