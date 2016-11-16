
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class CustomerDeliveryTime extends ViewObject implements CustomerDeliveryTimeView{
    
    protected common.Fraction price;
    protected long deliveryTime;
    
    public CustomerDeliveryTime(common.Fraction price,long deliveryTime,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.price = price;
        this.deliveryTime = deliveryTime;        
    }
    
    static public long getTypeId() {
        return 234;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public common.Fraction getPrice()throws ModelException{
        return this.price;
    }
    public void setPrice(common.Fraction newValue) throws ModelException {
        this.price = newValue;
    }
    public long getDeliveryTime()throws ModelException{
        return this.deliveryTime;
    }
    public void setDeliveryTime(long newValue) throws ModelException {
        this.deliveryTime = newValue;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleCustomerDeliveryTime(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerDeliveryTime(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerDeliveryTime(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerDeliveryTime(this);
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
    public int getPriceIndex() throws ModelException {
        return 0;
    }
    public int getDeliveryTimeIndex() throws ModelException {
        return 0 + 1;
    }
    public int getRowCount(){
        return 0 
            + 1
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "price";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "deliveryTime";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return this.getPrice();
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return new Long(getDeliveryTime());
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
            this.setPrice(common.Fraction.parse(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setDeliveryTime(Long.parseLong(newValue));
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
