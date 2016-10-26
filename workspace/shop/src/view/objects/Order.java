
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class Order extends view.objects.AbstractOrder implements OrderView{
    
    
    public Order(java.util.Vector<OrderQuantifiedArticleView> articles,CustomerDeliveryTimeView customerDeliveryTime,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(articles,(CustomerDeliveryTimeView)customerDeliveryTime,id, classId);        
    }
    
    static public long getTypeId() {
        return 147;
    }
    
    public long getClassId() {
        return getTypeId();
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
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        java.util.Vector<?> articles = this.getArticles();
        if (articles != null) {
            ViewObject.resolveVectorProxies(articles, resultTable);
        }
        CustomerDeliveryTimeView customerDeliveryTime = this.getCustomerDeliveryTime();
        if (customerDeliveryTime != null) {
            ((ViewProxi)customerDeliveryTime).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(customerDeliveryTime.getClassId(), customerDeliveryTime.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getArticles().size()) return new ArticlesAbstractOrderWrapper(this, originalIndex, (ViewRoot)this.getArticles().get(index));
        index = index - this.getArticles().size();
        if(index == 0 && this.getCustomerDeliveryTime() != null) return new CustomerDeliveryTimeAbstractOrderWrapper(this, originalIndex, (ViewRoot)this.getCustomerDeliveryTime());
        if(this.getCustomerDeliveryTime() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getArticles().size())
            + (this.getCustomerDeliveryTime() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getArticles().size() == 0)
            && (this.getCustomerDeliveryTime() == null ? true : false);
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
