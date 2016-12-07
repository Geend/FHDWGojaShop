
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class Shop extends ViewObject implements ShopView{
    
    protected ComponentManagerView componentManager;
    protected ProducerLstView prmanager;
    protected CustomerDeliveryTimeManagerView customerDeliveryTimeManager;
    
    public Shop(ComponentManagerView componentManager,ProducerLstView prmanager,CustomerDeliveryTimeManagerView customerDeliveryTimeManager,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.componentManager = componentManager;
        this.prmanager = prmanager;
        this.customerDeliveryTimeManager = customerDeliveryTimeManager;        
    }
    
    static public long getTypeId() {
        return 428;
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
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleShop(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleShop(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleShop(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleShop(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
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
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getComponentManager() != null) return new ComponentManagerShopWrapper(this, originalIndex, (ViewRoot)this.getComponentManager());
        if(this.getComponentManager() != null) index = index - 1;
        if(index == 0 && this.getPrmanager() != null) return new PrmanagerShopWrapper(this, originalIndex, (ViewRoot)this.getPrmanager());
        if(this.getPrmanager() != null) index = index - 1;
        if(index == 0 && this.getCustomerDeliveryTimeManager() != null) return new CustomerDeliveryTimeManagerShopWrapper(this, originalIndex, (ViewRoot)this.getCustomerDeliveryTimeManager());
        if(this.getCustomerDeliveryTimeManager() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getComponentManager() == null ? 0 : 1)
            + (this.getPrmanager() == null ? 0 : 1)
            + (this.getCustomerDeliveryTimeManager() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getComponentManager() == null ? true : false)
            && (this.getPrmanager() == null ? true : false)
            && (this.getCustomerDeliveryTimeManager() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getComponentManager() != null && this.getComponentManager().equals(child)) return result;
        if(this.getComponentManager() != null) result = result + 1;
        if(this.getPrmanager() != null && this.getPrmanager().equals(child)) return result;
        if(this.getPrmanager() != null) result = result + 1;
        if(this.getCustomerDeliveryTimeManager() != null && this.getCustomerDeliveryTimeManager().equals(child)) return result;
        if(this.getCustomerDeliveryTimeManager() != null) result = result + 1;
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
    public boolean hasTransientFields(){
        return false;
    }
    /* Start of protected part that is not overridden by persistence generator */
    
    public javafx.scene.image.Image getImage() {
        return super.getImage();
    }
    /* End of protected part that is not overridden by persistence generator */
    
    
}
