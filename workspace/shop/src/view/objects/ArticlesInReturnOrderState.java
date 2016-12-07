
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class ArticlesInReturnOrderState extends view.objects.OrderStatus implements ArticlesInReturnOrderStateView{
    
    protected long ticksLeft;
    
    public ArticlesInReturnOrderState(long ticksLeft,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.ticksLeft = ticksLeft;        
    }
    
    static public long getTypeId() {
        return 361;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public long getTicksLeft()throws ModelException{
        return this.ticksLeft;
    }
    public void setTicksLeft(long newValue) throws ModelException {
        this.ticksLeft = newValue;
    }
    
    public void accept(OrderStatusVisitor visitor) throws ModelException {
        visitor.handleArticlesInReturnOrderState(this);
    }
    public <R> R accept(OrderStatusReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArticlesInReturnOrderState(this);
    }
    public <E extends view.UserException>  void accept(OrderStatusExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArticlesInReturnOrderState(this);
    }
    public <R, E extends view.UserException> R accept(OrderStatusReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArticlesInReturnOrderState(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleArticlesInReturnOrderState(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArticlesInReturnOrderState(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArticlesInReturnOrderState(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArticlesInReturnOrderState(this);
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
    public int getTicksLeftIndex() throws ModelException {
        return 0;
    }
    public int getRowCount(){
        return 0 
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "ticksLeft";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return new Long(getTicksLeft());
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
            this.setTicksLeft(Long.parseLong(newValue));
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
