
package view.objects;

import view.*;
import viewClient.*;
import view.visitor.*;


/* Additional import section end */

public class OwnerService extends view.objects.Service implements OwnerServiceView{
    
    protected ShopView shop;
    protected SettingsView settings;
    protected ReOrderManagerView reOrderManager;
    protected OwnerOrderManagerView ownerOrderManager;
    protected ReturnManagerView returnManager;
    
    public OwnerService(java.util.Vector<ErrorDisplayView> errors,ShopView shop,SettingsView settings,ReOrderManagerView reOrderManager,OwnerOrderManagerView ownerOrderManager,ReturnManagerView returnManager,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(errors,id, classId);
        this.shop = shop;
        this.settings = settings;
        this.reOrderManager = reOrderManager;
        this.ownerOrderManager = ownerOrderManager;
        this.returnManager = returnManager;        
    }
    
    static public long getTypeId() {
        return -276;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public ShopView getShop()throws ModelException{
        return this.shop;
    }
    public void setShop(ShopView newValue) throws ModelException {
        this.shop = newValue;
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
    public OwnerOrderManagerView getOwnerOrderManager()throws ModelException{
        return this.ownerOrderManager;
    }
    public void setOwnerOrderManager(OwnerOrderManagerView newValue) throws ModelException {
        this.ownerOrderManager = newValue;
    }
    public ReturnManagerView getReturnManager()throws ModelException{
        return this.returnManager;
    }
    public void setReturnManager(ReturnManagerView newValue) throws ModelException {
        this.returnManager = newValue;
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
        ShopView shop = this.getShop();
        if (shop != null) {
            ((ViewProxi)shop).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(shop.getClassId(), shop.getId())));
        }
        SettingsView settings = this.getSettings();
        if (settings != null) {
            ((ViewProxi)settings).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(settings.getClassId(), settings.getId())));
        }
        ReOrderManagerView reOrderManager = this.getReOrderManager();
        if (reOrderManager != null) {
            ((ViewProxi)reOrderManager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(reOrderManager.getClassId(), reOrderManager.getId())));
        }
        OwnerOrderManagerView ownerOrderManager = this.getOwnerOrderManager();
        if (ownerOrderManager != null) {
            ((ViewProxi)ownerOrderManager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(ownerOrderManager.getClassId(), ownerOrderManager.getId())));
        }
        ReturnManagerView returnManager = this.getReturnManager();
        if (returnManager != null) {
            ((ViewProxi)returnManager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(returnManager.getClassId(), returnManager.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(this.getShop() != null && index < this.getShop().getTheObject().getChildCount())
            return this.getShop().getTheObject().getChild(index);
        if(this.getShop() != null) index = index - this.getShop().getTheObject().getChildCount();
        if(index == 0 && this.getSettings() != null) return new SettingsOwnerServiceWrapper(this, originalIndex, (ViewRoot)this.getSettings());
        if(this.getSettings() != null) index = index - 1;
        if(index == 0 && this.getReOrderManager() != null) return new ReOrderManagerOwnerServiceWrapper(this, originalIndex, (ViewRoot)this.getReOrderManager());
        if(this.getReOrderManager() != null) index = index - 1;
        if(index == 0 && this.getOwnerOrderManager() != null) return new OwnerOrderManagerOwnerServiceWrapper(this, originalIndex, (ViewRoot)this.getOwnerOrderManager());
        if(this.getOwnerOrderManager() != null) index = index - 1;
        if(index == 0 && this.getReturnManager() != null) return new ReturnManagerOwnerServiceWrapper(this, originalIndex, (ViewRoot)this.getReturnManager());
        if(this.getReturnManager() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getShop() == null ? 0 : this.getShop().getTheObject().getChildCount())
            + (this.getSettings() == null ? 0 : 1)
            + (this.getReOrderManager() == null ? 0 : 1)
            + (this.getOwnerOrderManager() == null ? 0 : 1)
            + (this.getReturnManager() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getShop() == null ? true : this.getShop().getTheObject().isLeaf())
            && (this.getSettings() == null ? true : false)
            && (this.getReOrderManager() == null ? true : false)
            && (this.getOwnerOrderManager() == null ? true : false)
            && (this.getReturnManager() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getShop() != null && this.getShop().equals(child)) return result;
        if(this.getShop() != null) result = result + 1;
        if(this.getSettings() != null && this.getSettings().equals(child)) return result;
        if(this.getSettings() != null) result = result + 1;
        if(this.getReOrderManager() != null && this.getReOrderManager().equals(child)) return result;
        if(this.getReOrderManager() != null) result = result + 1;
        if(this.getOwnerOrderManager() != null && this.getOwnerOrderManager().equals(child)) return result;
        if(this.getOwnerOrderManager() != null) result = result + 1;
        if(this.getReturnManager() != null && this.getReturnManager().equals(child)) return result;
        if(this.getReturnManager() != null) result = result + 1;
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
