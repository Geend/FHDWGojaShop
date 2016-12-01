
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class ArticleReturn extends ViewObject implements ArticleReturnView{
    
    protected OrderView order;
    protected java.util.Vector<ReturnQuantifiedArticleView> returnArticles;
    
    public ArticleReturn(OrderView order,java.util.Vector<ReturnQuantifiedArticleView> returnArticles,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.order = order;
        this.returnArticles = returnArticles;        
    }
    
    static public long getTypeId() {
        return 349;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public OrderView getOrder()throws ModelException{
        return this.order;
    }
    public void setOrder(OrderView newValue) throws ModelException {
        this.order = newValue;
    }
    public java.util.Vector<ReturnQuantifiedArticleView> getReturnArticles()throws ModelException{
        return this.returnArticles;
    }
    public void setReturnArticles(java.util.Vector<ReturnQuantifiedArticleView> newValue) throws ModelException {
        this.returnArticles = newValue;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleArticleReturn(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArticleReturn(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArticleReturn(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArticleReturn(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        OrderView order = this.getOrder();
        if (order != null) {
            ((ViewProxi)order).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(order.getClassId(), order.getId())));
        }
        java.util.Vector<?> returnArticles = this.getReturnArticles();
        if (returnArticles != null) {
            ViewObject.resolveVectorProxies(returnArticles, resultTable);
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getOrder() != null) return new OrderArticleReturnWrapper(this, originalIndex, (ViewRoot)this.getOrder());
        if(this.getOrder() != null) index = index - 1;
        if(index < this.getReturnArticles().size()) return new ReturnArticlesArticleReturnWrapper(this, originalIndex, (ViewRoot)this.getReturnArticles().get(index));
        index = index - this.getReturnArticles().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getOrder() == null ? 0 : 1)
            + (this.getReturnArticles().size());
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getOrder() == null ? true : false)
            && (this.getReturnArticles().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getOrder() != null && this.getOrder().equals(child)) return result;
        if(this.getOrder() != null) result = result + 1;
        java.util.Iterator<?> getReturnArticlesIterator = this.getReturnArticles().iterator();
        while(getReturnArticlesIterator.hasNext()){
            if(getReturnArticlesIterator.next().equals(child)) return result;
            result = result + 1;
        }
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
