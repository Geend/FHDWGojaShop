package view;

import viewClient.*;

import view.visitor.*;

public interface CustomerServiceView extends ServiceView {
    
    public CustomerArticleLstView getArticleLst()throws ModelException;
    public void setArticleLst(CustomerArticleLstView newValue) throws ModelException ;
    public ComponentManagerView getComponentManager()throws ModelException;
    public void setComponentManager(ComponentManagerView newValue) throws ModelException ;
    public CustomerDeliveryTimeManagerView getCustomerDeliveryTimeManager()throws ModelException;
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManagerView newValue) throws ModelException ;
    public CustomerAccountView getAccount()throws ModelException;
    public void setAccount(CustomerAccountView newValue) throws ModelException ;
    public ShoppingCartView getCart()throws ModelException;
    public void setCart(ShoppingCartView newValue) throws ModelException ;
    public CustomerOrderManagerView getOrderManager()throws ModelException;
    public void setOrderManager(CustomerOrderManagerView newValue) throws ModelException ;
    
    public void accept(ServiceVisitor visitor) throws ModelException;
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(RemoteVisitor visitor) throws ModelException;
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
    public CustomerServiceConnection connectCustomerService(ConnectionMaster master, final ExceptionAndEventHandler handler) throws ModelException;
}

