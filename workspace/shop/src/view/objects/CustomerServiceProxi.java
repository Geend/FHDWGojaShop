package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class CustomerServiceProxi extends ServiceProxi implements CustomerServiceView{
    
    public CustomerServiceProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public CustomerServiceView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Vector<String> errors_string = (java.util.Vector<String>)resultTable.get("errors");
        java.util.Vector<ErrorDisplayView> errors = ViewProxi.getProxiVector(errors_string, connectionKey);
        ViewProxi articleLst = null;
        String articleLst$String = (String)resultTable.get("articleLst");
        if (articleLst$String != null) {
            common.ProxiInformation articleLst$Info = common.RPCConstantsAndServices.createProxiInformation(articleLst$String);
            articleLst = view.objects.ViewProxi.createProxi(articleLst$Info,connectionKey);
            articleLst.setToString(articleLst$Info.getToString());
        }
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
        ViewProxi account = null;
        String account$String = (String)resultTable.get("account");
        if (account$String != null) {
            common.ProxiInformation account$Info = common.RPCConstantsAndServices.createProxiInformation(account$String);
            account = view.objects.ViewProxi.createProxi(account$Info,connectionKey);
            account.setToString(account$Info.getToString());
        }
        ViewProxi cart = null;
        String cart$String = (String)resultTable.get("cart");
        if (cart$String != null) {
            common.ProxiInformation cart$Info = common.RPCConstantsAndServices.createProxiInformation(cart$String);
            cart = view.objects.ViewProxi.createProxi(cart$Info,connectionKey);
            cart.setToString(cart$Info.getToString());
        }
        ViewProxi orderManager = null;
        String orderManager$String = (String)resultTable.get("orderManager");
        if (orderManager$String != null) {
            common.ProxiInformation orderManager$Info = common.RPCConstantsAndServices.createProxiInformation(orderManager$String);
            orderManager = view.objects.ViewProxi.createProxi(orderManager$Info,connectionKey);
            orderManager.setToString(orderManager$Info.getToString());
        }
        CustomerServiceView result$$ = new CustomerService(errors,(CustomerArticleLstView)articleLst,(ComponentManagerView)componentManager,(ProducerLstView)prmanager,(CustomerDeliveryTimeManagerView)customerDeliveryTimeManager,(CustomerAccountView)account,(ShoppingCartView)cart,(CustomerOrderManagerView)orderManager, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getArticleLst() != null) return new ArticleLstCustomerServiceWrapper(this, originalIndex, (ViewRoot)this.getArticleLst());
        if(this.getArticleLst() != null) index = index - 1;
        if(index == 0 && this.getComponentManager() != null) return new ComponentManagerCustomerServiceWrapper(this, originalIndex, (ViewRoot)this.getComponentManager());
        if(this.getComponentManager() != null) index = index - 1;
        if(index == 0 && this.getPrmanager() != null) return new PrmanagerCustomerServiceWrapper(this, originalIndex, (ViewRoot)this.getPrmanager());
        if(this.getPrmanager() != null) index = index - 1;
        if(index == 0 && this.getCustomerDeliveryTimeManager() != null) return new CustomerDeliveryTimeManagerCustomerServiceWrapper(this, originalIndex, (ViewRoot)this.getCustomerDeliveryTimeManager());
        if(this.getCustomerDeliveryTimeManager() != null) index = index - 1;
        if(index == 0 && this.getAccount() != null) return new AccountCustomerServiceWrapper(this, originalIndex, (ViewRoot)this.getAccount());
        if(this.getAccount() != null) index = index - 1;
        if(index == 0 && this.getCart() != null) return new CartCustomerServiceWrapper(this, originalIndex, (ViewRoot)this.getCart());
        if(this.getCart() != null) index = index - 1;
        if(index == 0 && this.getOrderManager() != null) return new OrderManagerCustomerServiceWrapper(this, originalIndex, (ViewRoot)this.getOrderManager());
        if(this.getOrderManager() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getArticleLst() == null ? 0 : 1)
            + (this.getComponentManager() == null ? 0 : 1)
            + (this.getPrmanager() == null ? 0 : 1)
            + (this.getCustomerDeliveryTimeManager() == null ? 0 : 1)
            + (this.getAccount() == null ? 0 : 1)
            + (this.getCart() == null ? 0 : 1)
            + (this.getOrderManager() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getArticleLst() == null ? true : false)
            && (this.getComponentManager() == null ? true : false)
            && (this.getPrmanager() == null ? true : false)
            && (this.getCustomerDeliveryTimeManager() == null ? true : false)
            && (this.getAccount() == null ? true : false)
            && (this.getCart() == null ? true : false)
            && (this.getOrderManager() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getArticleLst() != null && this.getArticleLst().equals(child)) return result;
        if(this.getArticleLst() != null) result = result + 1;
        if(this.getComponentManager() != null && this.getComponentManager().equals(child)) return result;
        if(this.getComponentManager() != null) result = result + 1;
        if(this.getPrmanager() != null && this.getPrmanager().equals(child)) return result;
        if(this.getPrmanager() != null) result = result + 1;
        if(this.getCustomerDeliveryTimeManager() != null && this.getCustomerDeliveryTimeManager().equals(child)) return result;
        if(this.getCustomerDeliveryTimeManager() != null) result = result + 1;
        if(this.getAccount() != null && this.getAccount().equals(child)) return result;
        if(this.getAccount() != null) result = result + 1;
        if(this.getCart() != null && this.getCart().equals(child)) return result;
        if(this.getCart() != null) result = result + 1;
        if(this.getOrderManager() != null && this.getOrderManager().equals(child)) return result;
        if(this.getOrderManager() != null) result = result + 1;
        return -1;
    }
    
    public CustomerArticleLstView getArticleLst()throws ModelException{
        return ((CustomerService)this.getTheObject()).getArticleLst();
    }
    public void setArticleLst(CustomerArticleLstView newValue) throws ModelException {
        ((CustomerService)this.getTheObject()).setArticleLst(newValue);
    }
    public ComponentManagerView getComponentManager()throws ModelException{
        return ((CustomerService)this.getTheObject()).getComponentManager();
    }
    public void setComponentManager(ComponentManagerView newValue) throws ModelException {
        ((CustomerService)this.getTheObject()).setComponentManager(newValue);
    }
    public ProducerLstView getPrmanager()throws ModelException{
        return ((CustomerService)this.getTheObject()).getPrmanager();
    }
    public void setPrmanager(ProducerLstView newValue) throws ModelException {
        ((CustomerService)this.getTheObject()).setPrmanager(newValue);
    }
    public CustomerDeliveryTimeManagerView getCustomerDeliveryTimeManager()throws ModelException{
        return ((CustomerService)this.getTheObject()).getCustomerDeliveryTimeManager();
    }
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManagerView newValue) throws ModelException {
        ((CustomerService)this.getTheObject()).setCustomerDeliveryTimeManager(newValue);
    }
    public CustomerAccountView getAccount()throws ModelException{
        return ((CustomerService)this.getTheObject()).getAccount();
    }
    public void setAccount(CustomerAccountView newValue) throws ModelException {
        ((CustomerService)this.getTheObject()).setAccount(newValue);
    }
    public ShoppingCartView getCart()throws ModelException{
        return ((CustomerService)this.getTheObject()).getCart();
    }
    public void setCart(ShoppingCartView newValue) throws ModelException {
        ((CustomerService)this.getTheObject()).setCart(newValue);
    }
    public CustomerOrderManagerView getOrderManager()throws ModelException{
        return ((CustomerService)this.getTheObject()).getOrderManager();
    }
    public void setOrderManager(CustomerOrderManagerView newValue) throws ModelException {
        ((CustomerService)this.getTheObject()).setOrderManager(newValue);
    }
    
    public void accept(ServiceVisitor visitor) throws ModelException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerService(this);
    }
    public <E extends view.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends view.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerService(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(RemoteVisitor visitor) throws ModelException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerService(this);
    }
    public <E extends view.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends view.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerService(this);
    }
    
    
    public CustomerServiceConnection connectCustomerService(ConnectionMaster master, final ExceptionAndEventHandler handler) throws ModelException{
        CustomerServiceConnection result;
		try {
			result = (CustomerServiceConnection) new CustomerServiceConnection(master.getUrlString(), master.getHandler(), master.getReporter()).fork(master, this);
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
