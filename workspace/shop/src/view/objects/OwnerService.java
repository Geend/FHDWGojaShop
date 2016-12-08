
package view.objects;

import view.*;
import viewClient.*;
import view.visitor.*;


/* Additional import section end */

public class OwnerService extends view.objects.Service implements OwnerServiceView{
    
    protected ComponentManagerView componentManager;
    protected ProducerLstView prmanager;
    protected CustomerDeliveryTimeManagerView customerDeliveryTimeManager;
    protected SettingsView settings;
    protected ReOrderManagerView reOrderManager;
    protected GlobalOrderManagerView orderManager;
    protected ReturnManagerView returnManager;
    protected GlobalOrderArchiveView orderArchive;
    
    public OwnerService(java.util.Vector<ErrorDisplayView> errors,ComponentManagerView componentManager,ProducerLstView prmanager,CustomerDeliveryTimeManagerView customerDeliveryTimeManager,SettingsView settings,ReOrderManagerView reOrderManager,GlobalOrderManagerView orderManager,ReturnManagerView returnManager,GlobalOrderArchiveView orderArchive,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(errors,id, classId);
        this.componentManager = componentManager;
        this.prmanager = prmanager;
        this.customerDeliveryTimeManager = customerDeliveryTimeManager;
        this.settings = settings;
        this.reOrderManager = reOrderManager;
        this.orderManager = orderManager;
        this.returnManager = returnManager;
        this.orderArchive = orderArchive;        
    }
    
    static public long getTypeId() {
        return -276;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public ComponentManagerView getComponentManager()throws ModelException{
        return this.componentManager;
    }
    public void setComponentManager(ComponentManagerView newValue) throws ModelException {
        this.componentManager = newValue;
    }
    public ProducerLstView getPrmanager()throws ModelException{
        return this.prmanager;
    }
    public void setPrmanager(ProducerLstView newValue) throws ModelException {
        this.prmanager = newValue;
    }
    public CustomerDeliveryTimeManagerView getCustomerDeliveryTimeManager()throws ModelException{
        return this.customerDeliveryTimeManager;
    }
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManagerView newValue) throws ModelException {
        this.customerDeliveryTimeManager = newValue;
    }
    public SettingsView getSettings()throws ModelException{
        return this.settings;
    }
    public void setSettings(SettingsView newValue) throws ModelException {
        this.settings = newValue;
    }
    public ReOrderManagerView getReOrderManager()throws ModelException{
        return this.reOrderManager;
    }
    public void setReOrderManager(ReOrderManagerView newValue) throws ModelException {
        this.reOrderManager = newValue;
    }
    public GlobalOrderManagerView getOrderManager()throws ModelException{
        return this.orderManager;
    }
    public void setOrderManager(GlobalOrderManagerView newValue) throws ModelException {
        this.orderManager = newValue;
    }
    public ReturnManagerView getReturnManager()throws ModelException{
        return this.returnManager;
    }
    public void setReturnManager(ReturnManagerView newValue) throws ModelException {
        this.returnManager = newValue;
    }
    public GlobalOrderArchiveView getOrderArchive()throws ModelException{
        return this.orderArchive;
    }
    public void setOrderArchive(GlobalOrderArchiveView newValue) throws ModelException {
        this.orderArchive = newValue;
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
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        java.util.Vector<?> errors = this.getErrors();
        if (errors != null) {
            ViewObject.resolveVectorProxies(errors, resultTable);
        }
        ComponentManagerView componentManager = this.getComponentManager();
        if (componentManager != null) {
            ((ViewProxi)componentManager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(componentManager.getClassId(), componentManager.getId())));
        }
        ProducerLstView prmanager = this.getPrmanager();
        if (prmanager != null) {
            ((ViewProxi)prmanager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(prmanager.getClassId(), prmanager.getId())));
        }
        CustomerDeliveryTimeManagerView customerDeliveryTimeManager = this.getCustomerDeliveryTimeManager();
        if (customerDeliveryTimeManager != null) {
            ((ViewProxi)customerDeliveryTimeManager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(customerDeliveryTimeManager.getClassId(), customerDeliveryTimeManager.getId())));
        }
        SettingsView settings = this.getSettings();
        if (settings != null) {
            ((ViewProxi)settings).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(settings.getClassId(), settings.getId())));
        }
        ReOrderManagerView reOrderManager = this.getReOrderManager();
        if (reOrderManager != null) {
            ((ViewProxi)reOrderManager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(reOrderManager.getClassId(), reOrderManager.getId())));
        }
        GlobalOrderManagerView orderManager = this.getOrderManager();
        if (orderManager != null) {
            ((ViewProxi)orderManager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(orderManager.getClassId(), orderManager.getId())));
        }
        ReturnManagerView returnManager = this.getReturnManager();
        if (returnManager != null) {
            ((ViewProxi)returnManager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(returnManager.getClassId(), returnManager.getId())));
        }
        GlobalOrderArchiveView orderArchive = this.getOrderArchive();
        if (orderArchive != null) {
            ((ViewProxi)orderArchive).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(orderArchive.getClassId(), orderArchive.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
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
    public int getRowCount(){
        return 0 ;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
            } else {
            }
            throw new ModelException("Table index out of bounds!", -1);
        } catch (ModelException e){
            return e.getMessage();
        }
    }
    
    public boolean isRowEditable(int index){
        return true;
    }
    public void setValueAt(String newValue, int rowIndex) throws Exception {
        
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
    }
    
    public boolean hasTransientFields(){
        return false;
    }
    /* Start of protected part that is not overridden by persistence generator */
    
    public javafx.scene.image.Image getImage() {
        return super.getImage();
    }
    /* End of protected part that is not overridden by persistence generator */
    
    
}
