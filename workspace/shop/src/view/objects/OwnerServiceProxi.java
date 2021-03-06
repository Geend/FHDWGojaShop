package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class OwnerServiceProxi extends ServiceProxi implements OwnerServiceView{
    
    public OwnerServiceProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public OwnerServiceView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Vector<String> errors_string = (java.util.Vector<String>)resultTable.get("errors");
        java.util.Vector<ErrorDisplayView> errors = ViewProxi.getProxiVector(errors_string, connectionKey);
        ViewProxi componentManager = null;
        String componentManager$String = (String)resultTable.get("componentManager");
        if (componentManager$String != null) {
            common.ProxiInformation componentManager$Info = common.RPCConstantsAndServices.createProxiInformation(componentManager$String);
            componentManager = view.objects.ViewProxi.createProxi(componentManager$Info,connectionKey);
            componentManager.setToString(componentManager$Info.getToString());
        }
        ViewProxi prmanager = null;
        String prmanager$String = (String)resultTable.get("prmanager");
        if (prmanager$String != null) {
            common.ProxiInformation prmanager$Info = common.RPCConstantsAndServices.createProxiInformation(prmanager$String);
            prmanager = view.objects.ViewProxi.createProxi(prmanager$Info,connectionKey);
            prmanager.setToString(prmanager$Info.getToString());
        }
        ViewProxi customerDeliveryTimeManager = null;
        String customerDeliveryTimeManager$String = (String)resultTable.get("customerDeliveryTimeManager");
        if (customerDeliveryTimeManager$String != null) {
            common.ProxiInformation customerDeliveryTimeManager$Info = common.RPCConstantsAndServices.createProxiInformation(customerDeliveryTimeManager$String);
            customerDeliveryTimeManager = view.objects.ViewProxi.createProxi(customerDeliveryTimeManager$Info,connectionKey);
            customerDeliveryTimeManager.setToString(customerDeliveryTimeManager$Info.getToString());
        }
        ViewProxi settings = null;
        String settings$String = (String)resultTable.get("settings");
        if (settings$String != null) {
            common.ProxiInformation settings$Info = common.RPCConstantsAndServices.createProxiInformation(settings$String);
            settings = view.objects.ViewProxi.createProxi(settings$Info,connectionKey);
            settings.setToString(settings$Info.getToString());
        }
        ViewProxi reOrderManager = null;
        String reOrderManager$String = (String)resultTable.get("reOrderManager");
        if (reOrderManager$String != null) {
            common.ProxiInformation reOrderManager$Info = common.RPCConstantsAndServices.createProxiInformation(reOrderManager$String);
            reOrderManager = view.objects.ViewProxi.createProxi(reOrderManager$Info,connectionKey);
            reOrderManager.setToString(reOrderManager$Info.getToString());
        }
        ViewProxi orderManager = null;
        String orderManager$String = (String)resultTable.get("orderManager");
        if (orderManager$String != null) {
            common.ProxiInformation orderManager$Info = common.RPCConstantsAndServices.createProxiInformation(orderManager$String);
            orderManager = view.objects.ViewProxi.createProxi(orderManager$Info,connectionKey);
            orderManager.setToString(orderManager$Info.getToString());
        }
        ViewProxi returnManager = null;
        String returnManager$String = (String)resultTable.get("returnManager");
        if (returnManager$String != null) {
            common.ProxiInformation returnManager$Info = common.RPCConstantsAndServices.createProxiInformation(returnManager$String);
            returnManager = view.objects.ViewProxi.createProxi(returnManager$Info,connectionKey);
            returnManager.setToString(returnManager$Info.getToString());
        }
        ViewProxi orderArchive = null;
        String orderArchive$String = (String)resultTable.get("orderArchive");
        if (orderArchive$String != null) {
            common.ProxiInformation orderArchive$Info = common.RPCConstantsAndServices.createProxiInformation(orderArchive$String);
            orderArchive = view.objects.ViewProxi.createProxi(orderArchive$Info,connectionKey);
            orderArchive.setToString(orderArchive$Info.getToString());
        }
        OwnerServiceView result$$ = new OwnerService(errors,(ComponentManagerView)componentManager,(ProducerLstView)prmanager,(CustomerDeliveryTimeManagerView)customerDeliveryTimeManager,(SettingsView)settings,(ReOrderManagerView)reOrderManager,(GlobalOrderManagerView)orderManager,(ReturnManagerView)returnManager,(GlobalOrderArchiveView)orderArchive, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getComponentManager() != null) return new ComponentManagerOwnerServiceWrapper(this, originalIndex, (ViewRoot)this.getComponentManager());
        if(this.getComponentManager() != null) index = index - 1;
        if(index == 0 && this.getPrmanager() != null) return new PrmanagerOwnerServiceWrapper(this, originalIndex, (ViewRoot)this.getPrmanager());
        if(this.getPrmanager() != null) index = index - 1;
        if(index == 0 && this.getCustomerDeliveryTimeManager() != null) return new CustomerDeliveryTimeManagerOwnerServiceWrapper(this, originalIndex, (ViewRoot)this.getCustomerDeliveryTimeManager());
        if(this.getCustomerDeliveryTimeManager() != null) index = index - 1;
        if(index == 0 && this.getSettings() != null) return new SettingsOwnerServiceWrapper(this, originalIndex, (ViewRoot)this.getSettings());
        if(this.getSettings() != null) index = index - 1;
        if(index == 0 && this.getReOrderManager() != null) return new ReOrderManagerOwnerServiceWrapper(this, originalIndex, (ViewRoot)this.getReOrderManager());
        if(this.getReOrderManager() != null) index = index - 1;
        if(index == 0 && this.getOrderManager() != null) return new OrderManagerOwnerServiceWrapper(this, originalIndex, (ViewRoot)this.getOrderManager());
        if(this.getOrderManager() != null) index = index - 1;
        if(index == 0 && this.getReturnManager() != null) return new ReturnManagerOwnerServiceWrapper(this, originalIndex, (ViewRoot)this.getReturnManager());
        if(this.getReturnManager() != null) index = index - 1;
        if(index == 0 && this.getOrderArchive() != null) return new OrderArchiveOwnerServiceWrapper(this, originalIndex, (ViewRoot)this.getOrderArchive());
        if(this.getOrderArchive() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getComponentManager() == null ? 0 : 1)
            + (this.getPrmanager() == null ? 0 : 1)
            + (this.getCustomerDeliveryTimeManager() == null ? 0 : 1)
            + (this.getSettings() == null ? 0 : 1)
            + (this.getReOrderManager() == null ? 0 : 1)
            + (this.getOrderManager() == null ? 0 : 1)
            + (this.getReturnManager() == null ? 0 : 1)
            + (this.getOrderArchive() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getComponentManager() == null ? true : false)
            && (this.getPrmanager() == null ? true : false)
            && (this.getCustomerDeliveryTimeManager() == null ? true : false)
            && (this.getSettings() == null ? true : false)
            && (this.getReOrderManager() == null ? true : false)
            && (this.getOrderManager() == null ? true : false)
            && (this.getReturnManager() == null ? true : false)
            && (this.getOrderArchive() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getComponentManager() != null && this.getComponentManager().equals(child)) return result;
        if(this.getComponentManager() != null) result = result + 1;
        if(this.getPrmanager() != null && this.getPrmanager().equals(child)) return result;
        if(this.getPrmanager() != null) result = result + 1;
        if(this.getCustomerDeliveryTimeManager() != null && this.getCustomerDeliveryTimeManager().equals(child)) return result;
        if(this.getCustomerDeliveryTimeManager() != null) result = result + 1;
        if(this.getSettings() != null && this.getSettings().equals(child)) return result;
        if(this.getSettings() != null) result = result + 1;
        if(this.getReOrderManager() != null && this.getReOrderManager().equals(child)) return result;
        if(this.getReOrderManager() != null) result = result + 1;
        if(this.getOrderManager() != null && this.getOrderManager().equals(child)) return result;
        if(this.getOrderManager() != null) result = result + 1;
        if(this.getReturnManager() != null && this.getReturnManager().equals(child)) return result;
        if(this.getReturnManager() != null) result = result + 1;
        if(this.getOrderArchive() != null && this.getOrderArchive().equals(child)) return result;
        if(this.getOrderArchive() != null) result = result + 1;
        return -1;
    }
    
    public ComponentManagerView getComponentManager()throws ModelException{
        return ((OwnerService)this.getTheObject()).getComponentManager();
    }
    public void setComponentManager(ComponentManagerView newValue) throws ModelException {
        ((OwnerService)this.getTheObject()).setComponentManager(newValue);
    }
    public ProducerLstView getPrmanager()throws ModelException{
        return ((OwnerService)this.getTheObject()).getPrmanager();
    }
    public void setPrmanager(ProducerLstView newValue) throws ModelException {
        ((OwnerService)this.getTheObject()).setPrmanager(newValue);
    }
    public CustomerDeliveryTimeManagerView getCustomerDeliveryTimeManager()throws ModelException{
        return ((OwnerService)this.getTheObject()).getCustomerDeliveryTimeManager();
    }
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManagerView newValue) throws ModelException {
        ((OwnerService)this.getTheObject()).setCustomerDeliveryTimeManager(newValue);
    }
    public SettingsView getSettings()throws ModelException{
        return ((OwnerService)this.getTheObject()).getSettings();
    }
    public void setSettings(SettingsView newValue) throws ModelException {
        ((OwnerService)this.getTheObject()).setSettings(newValue);
    }
    public ReOrderManagerView getReOrderManager()throws ModelException{
        return ((OwnerService)this.getTheObject()).getReOrderManager();
    }
    public void setReOrderManager(ReOrderManagerView newValue) throws ModelException {
        ((OwnerService)this.getTheObject()).setReOrderManager(newValue);
    }
    public GlobalOrderManagerView getOrderManager()throws ModelException{
        return ((OwnerService)this.getTheObject()).getOrderManager();
    }
    public void setOrderManager(GlobalOrderManagerView newValue) throws ModelException {
        ((OwnerService)this.getTheObject()).setOrderManager(newValue);
    }
    public ReturnManagerView getReturnManager()throws ModelException{
        return ((OwnerService)this.getTheObject()).getReturnManager();
    }
    public void setReturnManager(ReturnManagerView newValue) throws ModelException {
        ((OwnerService)this.getTheObject()).setReturnManager(newValue);
    }
    public GlobalOrderArchiveView getOrderArchive()throws ModelException{
        return ((OwnerService)this.getTheObject()).getOrderArchive();
    }
    public void setOrderArchive(GlobalOrderArchiveView newValue) throws ModelException {
        ((OwnerService)this.getTheObject()).setOrderArchive(newValue);
    }
    
    public void accept(ServiceVisitor visitor) throws ModelException {
        visitor.handleOwnerService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOwnerService(this);
    }
    public <E extends view.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOwnerService(this);
    }
    public <R, E extends view.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOwnerService(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleOwnerService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOwnerService(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOwnerService(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOwnerService(this);
    }
    public void accept(RemoteVisitor visitor) throws ModelException {
        visitor.handleOwnerService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOwnerService(this);
    }
    public <E extends view.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOwnerService(this);
    }
    public <R, E extends view.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOwnerService(this);
    }
    
    
    public OwnerServiceConnection connectOwnerService(ConnectionMaster master, final ExceptionAndEventHandler handler) throws ModelException{
        OwnerServiceConnection result;
		try {
			result = (OwnerServiceConnection) new OwnerServiceConnection(master.getUrlString(), master.getHandler(), master.getReporter()).fork(master, this);
		} catch (java.net.MalformedURLException e) {
			throw new ModelException(e.getMessage(),0);
		}
		result.setHandler(handler);
		ConnectionIndex.getTheConnectionIndex().setConnection(handler,result);
		handler.setConnection(result);
		handler.initializeConnection();
		return result;
    }public boolean hasTransientFields(){
        return false;
    }
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    private final int RemoteDepth = 1;
    
    /* End of protected part that is not overridden by persistence generator */
    
}
