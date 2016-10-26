
package view.objects;

import view.*;


/* Additional import section end */

public abstract class AbstractOrder extends ViewObject implements AbstractOrderView{
    
    protected OrderQuantifiedArticleView articles;
    protected CustomerDeliveryTimeView customerDeliveryTime;
    
    public AbstractOrder(OrderQuantifiedArticleView articles,CustomerDeliveryTimeView customerDeliveryTime,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.articles = articles;
        this.customerDeliveryTime = customerDeliveryTime;        
    }
    
    public OrderQuantifiedArticleView getArticles()throws ModelException{
        return this.articles;
    }
    public void setArticles(OrderQuantifiedArticleView newValue) throws ModelException {
        this.articles = newValue;
    }
    public CustomerDeliveryTimeView getCustomerDeliveryTime()throws ModelException{
        return this.customerDeliveryTime;
    }
    public void setCustomerDeliveryTime(CustomerDeliveryTimeView newValue) throws ModelException {
        this.customerDeliveryTime = newValue;
    }
    
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        OrderQuantifiedArticleView articles = this.getArticles();
        if (articles != null) {
            ((ViewProxi)articles).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(articles.getClassId(), articles.getId())));
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
    /* Start of protected part that is not overridden by persistence generator */
    
    public javafx.scene.image.Image getImage() {
        return super.getImage();
    }
    /* End of protected part that is not overridden by persistence generator */
    
    
}
