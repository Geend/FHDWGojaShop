package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class OrderProxi extends ViewProxi implements OrderView{
    
    public OrderProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public OrderView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Vector<String> articles_string = (java.util.Vector<String>)resultTable.get("articles");
        java.util.Vector<OrderQuantifiedArticleView> articles = ViewProxi.getProxiVector(articles_string, connectionKey);
        ViewProxi customerDeliveryTime = null;
        String customerDeliveryTime$String = (String)resultTable.get("customerDeliveryTime");
        if (customerDeliveryTime$String != null) {
            common.ProxiInformation customerDeliveryTime$Info = common.RPCConstantsAndServices.createProxiInformation(customerDeliveryTime$String);
            customerDeliveryTime = view.objects.ViewProxi.createProxi(customerDeliveryTime$Info,connectionKey);
            customerDeliveryTime.setToString(customerDeliveryTime$Info.getToString());
        }
        ViewProxi customerAccount = null;
        String customerAccount$String = (String)resultTable.get("customerAccount");
        if (customerAccount$String != null) {
            common.ProxiInformation customerAccount$Info = common.RPCConstantsAndServices.createProxiInformation(customerAccount$String);
            customerAccount = view.objects.ViewProxi.createProxi(customerAccount$Info,connectionKey);
            customerAccount.setToString(customerAccount$Info.getToString());
        }
        common.Fraction totalPrice = common.Fraction.parse((String)resultTable.get("totalPrice"));
        common.Fraction returnPercentageAtOrderTime = common.Fraction.parse((String)resultTable.get("returnPercentageAtOrderTime"));
        ViewProxi state = null;
        String state$String = (String)resultTable.get("state");
        if (state$String != null) {
            common.ProxiInformation state$Info = common.RPCConstantsAndServices.createProxiInformation(state$String);
            state = view.objects.ViewProxi.createProxi(state$Info,connectionKey);
            state.setToString(state$Info.getToString());
        }
        OrderView result$$ = new Order(articles,(CustomerDeliveryTimeView)customerDeliveryTime,(CustomerAccountView)customerAccount,(common.Fraction)totalPrice,(common.Fraction)returnPercentageAtOrderTime,(OrderStatusView)state, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
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
        if (this.object == null) return this.getLeafInfo() == 0;
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
    
    public java.util.Vector<OrderQuantifiedArticleView> getArticles()throws ModelException{
        return ((Order)this.getTheObject()).getArticles();
    }
    public void setArticles(java.util.Vector<OrderQuantifiedArticleView> newValue) throws ModelException {
        ((Order)this.getTheObject()).setArticles(newValue);
    }
    public CustomerDeliveryTimeView getCustomerDeliveryTime()throws ModelException{
        return ((Order)this.getTheObject()).getCustomerDeliveryTime();
    }
    public void setCustomerDeliveryTime(CustomerDeliveryTimeView newValue) throws ModelException {
        ((Order)this.getTheObject()).setCustomerDeliveryTime(newValue);
    }
    public CustomerAccountView getCustomerAccount()throws ModelException{
        return ((Order)this.getTheObject()).getCustomerAccount();
    }
    public void setCustomerAccount(CustomerAccountView newValue) throws ModelException {
        ((Order)this.getTheObject()).setCustomerAccount(newValue);
    }
    public common.Fraction getTotalPrice()throws ModelException{
        return ((Order)this.getTheObject()).getTotalPrice();
    }
    public void setTotalPrice(common.Fraction newValue) throws ModelException {
        ((Order)this.getTheObject()).setTotalPrice(newValue);
    }
    public common.Fraction getReturnPercentageAtOrderTime()throws ModelException{
        return ((Order)this.getTheObject()).getReturnPercentageAtOrderTime();
    }
    public void setReturnPercentageAtOrderTime(common.Fraction newValue) throws ModelException {
        ((Order)this.getTheObject()).setReturnPercentageAtOrderTime(newValue);
    }
    public OrderStatusView getState()throws ModelException{
        return ((Order)this.getTheObject()).getState();
    }
    public void setState(OrderStatusView newValue) throws ModelException {
        ((Order)this.getTheObject()).setState(newValue);
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
