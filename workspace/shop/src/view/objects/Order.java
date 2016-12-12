
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class Order extends ViewObject implements OrderView{
    
    protected java.util.Vector<OrderQuantifiedArticleView> articles;
    protected CustomerDeliveryTimeView customerDeliveryTime;
    protected CustomerAccountView customerAccount;
    protected common.Fraction totalPrice;
    protected common.Fraction returnPercentageAtOrderTime;
    protected OrderStatusView state;
    
    public Order(java.util.Vector<OrderQuantifiedArticleView> articles,CustomerDeliveryTimeView customerDeliveryTime,CustomerAccountView customerAccount,common.Fraction totalPrice,common.Fraction returnPercentageAtOrderTime,OrderStatusView state,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.articles = articles;
        this.customerDeliveryTime = customerDeliveryTime;
        this.customerAccount = customerAccount;
        this.totalPrice = totalPrice;
        this.returnPercentageAtOrderTime = returnPercentageAtOrderTime;
        this.state = state;        
    }
    
    static public long getTypeId() {
        return 238;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public java.util.Vector<OrderQuantifiedArticleView> getArticles()throws ModelException{
        return this.articles;
    }
    public void setArticles(java.util.Vector<OrderQuantifiedArticleView> newValue) throws ModelException {
        this.articles = newValue;
    }
    public CustomerDeliveryTimeView getCustomerDeliveryTime()throws ModelException{
        return this.customerDeliveryTime;
    }
    public void setCustomerDeliveryTime(CustomerDeliveryTimeView newValue) throws ModelException {
        this.customerDeliveryTime = newValue;
    }
    public CustomerAccountView getCustomerAccount()throws ModelException{
        return this.customerAccount;
    }
    public void setCustomerAccount(CustomerAccountView newValue) throws ModelException {
        this.customerAccount = newValue;
    }
    public common.Fraction getTotalPrice()throws ModelException{
        return this.totalPrice;
    }
    public void setTotalPrice(common.Fraction newValue) throws ModelException {
        this.totalPrice = newValue;
    }
    public common.Fraction getReturnPercentageAtOrderTime()throws ModelException{
        return this.returnPercentageAtOrderTime;
    }
    public void setReturnPercentageAtOrderTime(common.Fraction newValue) throws ModelException {
        this.returnPercentageAtOrderTime = newValue;
    }
    public OrderStatusView getState()throws ModelException{
        return this.state;
    }
    public void setState(OrderStatusView newValue) throws ModelException {
        this.state = newValue;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrder(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrder(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrder(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        java.util.Vector<?> articles = this.getArticles();
        if (articles != null) {
            ViewObject.resolveVectorProxies(articles, resultTable);
        }
        CustomerDeliveryTimeView customerDeliveryTime = this.getCustomerDeliveryTime();
        if (customerDeliveryTime != null) {
            ((ViewProxi)customerDeliveryTime).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(customerDeliveryTime.getClassId(), customerDeliveryTime.getId())));
        }
        CustomerAccountView customerAccount = this.getCustomerAccount();
        if (customerAccount != null) {
            ((ViewProxi)customerAccount).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(customerAccount.getClassId(), customerAccount.getId())));
        }
        OrderStatusView state = this.getState();
        if (state != null) {
            ((ViewProxi)state).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(state.getClassId(), state.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getArticles().size()) return new ArticlesOrderWrapper(this, originalIndex, (ViewRoot)this.getArticles().get(index));
        index = index - this.getArticles().size();
        if(index == 0 && this.getCustomerDeliveryTime() != null) return new CustomerDeliveryTimeOrderWrapper(this, originalIndex, (ViewRoot)this.getCustomerDeliveryTime());
        if(this.getCustomerDeliveryTime() != null) index = index - 1;
        if(index == 0 && this.getCustomerAccount() != null) return new CustomerAccountOrderWrapper(this, originalIndex, (ViewRoot)this.getCustomerAccount());
        if(this.getCustomerAccount() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getArticles().size())
            + (this.getCustomerDeliveryTime() == null ? 0 : 1)
            + (this.getCustomerAccount() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getArticles().size() == 0)
            && (this.getCustomerDeliveryTime() == null ? true : false)
            && (this.getCustomerAccount() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getArticlesIterator = this.getArticles().iterator();
        while(getArticlesIterator.hasNext()){
            if(getArticlesIterator.next().equals(child)) return result;
            result = result + 1;
        }
        if(this.getCustomerDeliveryTime() != null && this.getCustomerDeliveryTime().equals(child)) return result;
        if(this.getCustomerDeliveryTime() != null) result = result + 1;
        if(this.getCustomerAccount() != null && this.getCustomerAccount().equals(child)) return result;
        if(this.getCustomerAccount() != null) result = result + 1;
        return -1;
    }
    public int getTotalPriceIndex() throws ModelException {
        return 0 + this.getArticles().size() + (this.getCustomerDeliveryTime() == null ? 0 : 1) + (this.getCustomerAccount() == null ? 0 : 1);
    }
    public int getReturnPercentageAtOrderTimeIndex() throws ModelException {
        return 0 + this.getArticles().size() + (this.getCustomerDeliveryTime() == null ? 0 : 1) + (this.getCustomerAccount() == null ? 0 : 1) + 1;
    }
    public int getRowCount(){
        return 0 
            + 1
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "Gesamtpreis";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "Retourenprozentsatz";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return this.getTotalPrice();
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return this.getReturnPercentageAtOrderTime();
                rowIndex = rowIndex - 1;
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
        if(rowIndex == 0){
            this.setTotalPrice(common.Fraction.parse(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setReturnPercentageAtOrderTime(common.Fraction.parse(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
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
