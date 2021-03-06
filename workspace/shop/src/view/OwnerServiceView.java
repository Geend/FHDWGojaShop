package view;

import viewClient.*;

import view.visitor.*;

public interface OwnerServiceView extends ServiceView {
    
    public ComponentManagerView getComponentManager()throws ModelException;
    public void setComponentManager(ComponentManagerView newValue) throws ModelException ;
    public ProducerLstView getPrmanager()throws ModelException;
    public void setPrmanager(ProducerLstView newValue) throws ModelException ;
    public CustomerDeliveryTimeManagerView getCustomerDeliveryTimeManager()throws ModelException;
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManagerView newValue) throws ModelException ;
    public SettingsView getSettings()throws ModelException;
    public void setSettings(SettingsView newValue) throws ModelException ;
    public ReOrderManagerView getReOrderManager()throws ModelException;
    public void setReOrderManager(ReOrderManagerView newValue) throws ModelException ;
    public GlobalOrderManagerView getOrderManager()throws ModelException;
    public void setOrderManager(GlobalOrderManagerView newValue) throws ModelException ;
    public ReturnManagerView getReturnManager()throws ModelException;
    public void setReturnManager(ReturnManagerView newValue) throws ModelException ;
    public GlobalOrderArchiveView getOrderArchive()throws ModelException;
    public void setOrderArchive(GlobalOrderArchiveView newValue) throws ModelException ;
    
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
    
    public OwnerServiceConnection connectOwnerService(ConnectionMaster master, final ExceptionAndEventHandler handler) throws ModelException;
}

