package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class OrderProxi extends AbstractOrderProxi implements OrderView{
    
    public OrderProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public OrderView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        ViewProxi articles = null;
        String articles$String = (String)resultTable.get("articles");
        if (articles$String != null) {
            common.ProxiInformation articles$Info = common.RPCConstantsAndServices.createProxiInformation(articles$String);
            articles = view.objects.ViewProxi.createProxi(articles$Info,connectionKey);
            articles.setToString(articles$Info.getToString());
        }
        ViewProxi customerDeliveryTime = null;
        String customerDeliveryTime$String = (String)resultTable.get("customerDeliveryTime");
        if (customerDeliveryTime$String != null) {
            common.ProxiInformation customerDeliveryTime$Info = common.RPCConstantsAndServices.createProxiInformation(customerDeliveryTime$String);
            customerDeliveryTime = view.objects.ViewProxi.createProxi(customerDeliveryTime$Info,connectionKey);
            customerDeliveryTime.setToString(customerDeliveryTime$Info.getToString());
        }
        OrderView result$$ = new Order((OrderQuantifiedArticleView)articles,(CustomerDeliveryTimeView)customerDeliveryTime, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getArticles() != null) return new ArticlesAbstractOrderWrapper(this, originalIndex, (ViewRoot)this.getArticles());
        if(this.getArticles() != null) index = index - 1;
        if(index == 0 && this.getCustomerDeliveryTime() != null) return new CustomerDeliveryTimeAbstractOrderWrapper(this, originalIndex, (ViewRoot)this.getCustomerDeliveryTime());
        if(this.getCustomerDeliveryTime() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getArticles() == null ? 0 : 1)
            + (this.getCustomerDeliveryTime() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getArticles() == null ? true : false)
            && (this.getCustomerDeliveryTime() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getArticles() != null && this.getArticles().equals(child)) return result;
        if(this.getArticles() != null) result = result + 1;
        if(this.getCustomerDeliveryTime() != null && this.getCustomerDeliveryTime().equals(child)) return result;
        if(this.getCustomerDeliveryTime() != null) result = result + 1;
        return -1;
    }
    
    
    public void accept(AbstractOrderVisitor visitor) throws ModelException {
        visitor.handleOrder(this);
    }
    public <R> R accept(AbstractOrderReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrder(this);
    }
    public <E extends view.UserException>  void accept(AbstractOrderExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrder(this);
    }
    public <R, E extends view.UserException> R accept(AbstractOrderReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrder(this);
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
