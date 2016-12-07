
package view.objects;

import view.*;
import viewClient.*;
import view.visitor.*;


/* Additional import section end */

public class CustomerService extends view.objects.Service implements CustomerServiceView{
    
    protected CustomerArticleLstView articleLst;
    protected ComponentManagerView componentManager;
    protected CustomerDeliveryTimeManagerView customerDeliveryTimeManager;
    protected CustomerAccountView account;
    protected ShoppingCartView cart;
    protected CustomerOrderManagerView orderManager;
    
    public CustomerService(java.util.Vector<ErrorDisplayView> errors,CustomerArticleLstView articleLst,ComponentManagerView componentManager,CustomerDeliveryTimeManagerView customerDeliveryTimeManager,CustomerAccountView account,ShoppingCartView cart,CustomerOrderManagerView orderManager,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(errors,id, classId);
        this.articleLst = articleLst;
        this.componentManager = componentManager;
        this.customerDeliveryTimeManager = customerDeliveryTimeManager;
        this.account = account;
        this.cart = cart;
        this.orderManager = orderManager;        
    }
    
    static public long getTypeId() {
        return -278;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public CustomerArticleLstView getArticleLst()throws ModelException{
        return this.articleLst;
    }
    public void setArticleLst(CustomerArticleLstView newValue) throws ModelException {
        this.articleLst = newValue;
    }
    public ComponentManagerView getComponentManager()throws ModelException{
        return this.componentManager;
    }
    public void setComponentManager(ComponentManagerView newValue) throws ModelException {
        this.componentManager = newValue;
    }
    public CustomerDeliveryTimeManagerView getCustomerDeliveryTimeManager()throws ModelException{
        return this.customerDeliveryTimeManager;
    }
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManagerView newValue) throws ModelException {
        this.customerDeliveryTimeManager = newValue;
    }
    public CustomerAccountView getAccount()throws ModelException{
        return this.account;
    }
    public void setAccount(CustomerAccountView newValue) throws ModelException {
        this.account = newValue;
    }
    public ShoppingCartView getCart()throws ModelException{
        return this.cart;
    }
    public void setCart(ShoppingCartView newValue) throws ModelException {
        this.cart = newValue;
    }
    public CustomerOrderManagerView getOrderManager()throws ModelException{
        return this.orderManager;
    }
    public void setOrderManager(CustomerOrderManagerView newValue) throws ModelException {
        this.orderManager = newValue;
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
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        java.util.Vector<?> errors = this.getErrors();
        if (errors != null) {
            ViewObject.resolveVectorProxies(errors, resultTable);
        }
        CustomerArticleLstView articleLst = this.getArticleLst();
        if (articleLst != null) {
            ((ViewProxi)articleLst).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(articleLst.getClassId(), articleLst.getId())));
        }
        ComponentManagerView componentManager = this.getComponentManager();
        if (componentManager != null) {
            ((ViewProxi)componentManager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(componentManager.getClassId(), componentManager.getId())));
        }
        CustomerDeliveryTimeManagerView customerDeliveryTimeManager = this.getCustomerDeliveryTimeManager();
        if (customerDeliveryTimeManager != null) {
            ((ViewProxi)customerDeliveryTimeManager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(customerDeliveryTimeManager.getClassId(), customerDeliveryTimeManager.getId())));
        }
        CustomerAccountView account = this.getAccount();
        if (account != null) {
            ((ViewProxi)account).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(account.getClassId(), account.getId())));
        }
        ShoppingCartView cart = this.getCart();
        if (cart != null) {
            ((ViewProxi)cart).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(cart.getClassId(), cart.getId())));
        }
        CustomerOrderManagerView orderManager = this.getOrderManager();
        if (orderManager != null) {
            ((ViewProxi)orderManager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(orderManager.getClassId(), orderManager.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getArticleLst() != null) return new ArticleLstCustomerServiceWrapper(this, originalIndex, (ViewRoot)this.getArticleLst());
        if(this.getArticleLst() != null) index = index - 1;
        if(index == 0 && this.getComponentManager() != null) return new ComponentManagerCustomerServiceWrapper(this, originalIndex, (ViewRoot)this.getComponentManager());
        if(this.getComponentManager() != null) index = index - 1;
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
            + (this.getCustomerDeliveryTimeManager() == null ? 0 : 1)
            + (this.getAccount() == null ? 0 : 1)
            + (this.getCart() == null ? 0 : 1)
            + (this.getOrderManager() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getArticleLst() == null ? true : false)
            && (this.getComponentManager() == null ? true : false)
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
