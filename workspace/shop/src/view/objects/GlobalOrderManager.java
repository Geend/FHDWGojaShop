
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class GlobalOrderManager extends view.objects.OrderManager implements GlobalOrderManagerView{
    
    protected BackgroundTaskView myCONCBackgroundTask;
    
    public GlobalOrderManager(java.util.Vector<OrderView> orders,BackgroundTaskView myCONCBackgroundTask,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(orders,id, classId);
        this.myCONCBackgroundTask = myCONCBackgroundTask;        
    }
    
    static public long getTypeId() {
        return 343;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public BackgroundTaskView getMyCONCBackgroundTask()throws ModelException{
        return this.myCONCBackgroundTask;
    }
    public void setMyCONCBackgroundTask(BackgroundTaskView newValue) throws ModelException {
        this.myCONCBackgroundTask = newValue;
    }
    
    public void accept(OrderManagerVisitor visitor) throws ModelException {
        visitor.handleGlobalOrderManager(this);
    }
    public <R> R accept(OrderManagerReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleGlobalOrderManager(this);
    }
    public <E extends view.UserException>  void accept(OrderManagerExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleGlobalOrderManager(this);
    }
    public <R, E extends view.UserException> R accept(OrderManagerReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleGlobalOrderManager(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleGlobalOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleGlobalOrderManager(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleGlobalOrderManager(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleGlobalOrderManager(this);
    }
    public void accept(BackgroundTaskVisitor visitor) throws ModelException {
        visitor.handleGlobalOrderManager(this);
    }
    public <R> R accept(BackgroundTaskReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleGlobalOrderManager(this);
    }
    public <E extends view.UserException>  void accept(BackgroundTaskExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleGlobalOrderManager(this);
    }
    public <R, E extends view.UserException> R accept(BackgroundTaskReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleGlobalOrderManager(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        java.util.Vector<?> orders = this.getOrders();
        if (orders != null) {
            ViewObject.resolveVectorProxies(orders, resultTable);
        }
        BackgroundTaskView myCONCBackgroundTask = this.getMyCONCBackgroundTask();
        if (myCONCBackgroundTask != null) {
            ((ViewProxi)myCONCBackgroundTask).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(myCONCBackgroundTask.getClassId(), myCONCBackgroundTask.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getOrders().size()) return new OrdersOrderManagerWrapper(this, originalIndex, (ViewRoot)this.getOrders().get(index));
        index = index - this.getOrders().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getOrders().size());
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getOrders().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getOrdersIterator = this.getOrders().iterator();
        while(getOrdersIterator.hasNext()){
            if(getOrdersIterator.next().equals(child)) return result;
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
