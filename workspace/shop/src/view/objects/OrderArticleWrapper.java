
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class OrderArticleWrapper extends view.objects.ArticleWrapper implements OrderArticleWrapperView{
    
    protected common.Fraction priceAtOrder;
    
    public OrderArticleWrapper(common.Fraction priceAtOrder,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.priceAtOrder = priceAtOrder;        
    }
    
    static public long getTypeId() {
        return 280;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public common.Fraction getPriceAtOrder()throws ModelException{
        return this.priceAtOrder;
    }
    public void setPriceAtOrder(common.Fraction newValue) throws ModelException {
        this.priceAtOrder = newValue;
    }
    
    public void accept(ArticleWrapperVisitor visitor) throws ModelException {
        visitor.handleOrderArticleWrapper(this);
    }
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderArticleWrapper(this);
    }
    public <E extends view.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderArticleWrapper(this);
    }
    public <R, E extends view.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderArticleWrapper(this);
    }
    public void accept(ComponentWrapperVisitor visitor) throws ModelException {
        visitor.handleOrderArticleWrapper(this);
    }
    public <R> R accept(ComponentWrapperReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderArticleWrapper(this);
    }
    public <E extends view.UserException>  void accept(ComponentWrapperExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderArticleWrapper(this);
    }
    public <R, E extends view.UserException> R accept(ComponentWrapperReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderArticleWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleOrderArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderArticleWrapper(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderArticleWrapper(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderArticleWrapper(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 ;
    }
    public boolean isLeaf() throws ModelException {
        return true;
    }
    public int getIndexOfChild(Object child) throws ModelException {
        
        return -1;
    }
    public int getPriceAtOrderIndex() throws ModelException {
        return 0;
    }
    public int getRowCount(){
        return 0 
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "priceAtOrder";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return this.getPriceAtOrder();
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
            this.setPriceAtOrder(common.Fraction.parse(newValue));
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
