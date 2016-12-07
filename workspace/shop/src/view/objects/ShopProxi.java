package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ShopProxi extends ViewProxi implements ShopView{
    
    public ShopProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public ShopView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
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
        ShopView result$$ = new Shop((ComponentManagerView)componentManager,(ProducerLstView)prmanager,(CustomerDeliveryTimeManagerView)customerDeliveryTimeManager, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
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
        if (this.object == null) return this.getLeafInfo() == 0;
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
    
    public ComponentManagerView getComponentManager()throws ModelException{
        return ((Shop)this.getTheObject()).getComponentManager();
    }
    public void setComponentManager(ComponentManagerView newValue) throws ModelException {
        ((Shop)this.getTheObject()).setComponentManager(newValue);
    }
    public ProducerLstView getPrmanager()throws ModelException{
        return ((Shop)this.getTheObject()).getPrmanager();
    }
    public void setPrmanager(ProducerLstView newValue) throws ModelException {
        ((Shop)this.getTheObject()).setPrmanager(newValue);
    }
    public CustomerDeliveryTimeManagerView getCustomerDeliveryTimeManager()throws ModelException{
        return ((Shop)this.getTheObject()).getCustomerDeliveryTimeManager();
    }
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManagerView newValue) throws ModelException {
        ((Shop)this.getTheObject()).setCustomerDeliveryTimeManager(newValue);
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
    
    public boolean hasTransientFields(){
        return false;
    }
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    private final int RemoteDepth = 1;
    
    /* End of protected part that is not overridden by persistence generator */
    
}
