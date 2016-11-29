
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class CustomerDeliveryTimeManager extends ViewObject implements CustomerDeliveryTimeManagerView{
    
    protected java.util.Vector<CustomerDeliveryTimeView> customerDeliveryTimes;
    
    public CustomerDeliveryTimeManager(java.util.Vector<CustomerDeliveryTimeView> customerDeliveryTimes,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.customerDeliveryTimes = customerDeliveryTimes;        
    }
    
    static public long getTypeId() {
        return 296;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public java.util.Vector<CustomerDeliveryTimeView> getCustomerDeliveryTimes()throws ModelException{
        return this.customerDeliveryTimes;
    }
    public void setCustomerDeliveryTimes(java.util.Vector<CustomerDeliveryTimeView> newValue) throws ModelException {
        this.customerDeliveryTimes = newValue;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleCustomerDeliveryTimeManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerDeliveryTimeManager(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerDeliveryTimeManager(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerDeliveryTimeManager(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        java.util.Vector<?> customerDeliveryTimes = this.getCustomerDeliveryTimes();
        if (customerDeliveryTimes != null) {
            ViewObject.resolveVectorProxies(customerDeliveryTimes, resultTable);
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getCustomerDeliveryTimes().size()) return new CustomerDeliveryTimesCustomerDeliveryTimeManagerWrapper(this, originalIndex, (ViewRoot)this.getCustomerDeliveryTimes().get(index));
        index = index - this.getCustomerDeliveryTimes().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getCustomerDeliveryTimes().size());
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getCustomerDeliveryTimes().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getCustomerDeliveryTimesIterator = this.getCustomerDeliveryTimes().iterator();
        while(getCustomerDeliveryTimesIterator.hasNext()){
            if(getCustomerDeliveryTimesIterator.next().equals(child)) return result;
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
