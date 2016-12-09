
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class OrderQuantifiedArticlePreOrder extends view.objects.OrderQuantifiedArticleState implements OrderQuantifiedArticlePreOrderView{
    
    protected long leftQuantity;
    
    public OrderQuantifiedArticlePreOrder(long leftQuantity,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.leftQuantity = leftQuantity;        
    }
    
    static public long getTypeId() {
        return 451;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public long getLeftQuantity()throws ModelException{
        return this.leftQuantity;
    }
    public void setLeftQuantity(long newValue) throws ModelException {
        this.leftQuantity = newValue;
    }
    
    public void accept(OrderQuantifiedArticleStateVisitor visitor) throws ModelException {
        visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R> R accept(OrderQuantifiedArticleStateReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <E extends view.UserException>  void accept(OrderQuantifiedArticleStateExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R, E extends view.UserException> R accept(OrderQuantifiedArticleStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
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
    public int getLeftQuantityIndex() throws ModelException {
        return 0;
    }
    public int getRowCount(){
        return 0 
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "leftQuantity";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return new Long(getLeftQuantity());
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
            this.setLeftQuantity(Long.parseLong(newValue));
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
