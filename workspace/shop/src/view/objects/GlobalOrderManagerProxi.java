package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class GlobalOrderManagerProxi extends OrderManagerProxi implements GlobalOrderManagerView{
    
    public GlobalOrderManagerProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public GlobalOrderManagerView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Vector<String> orders_string = (java.util.Vector<String>)resultTable.get("orders");
        java.util.Vector<OrderView> orders = ViewProxi.getProxiVector(orders_string, connectionKey);
        ViewProxi myCONCBackgroundTask = null;
        String myCONCBackgroundTask$String = (String)resultTable.get("myCONCBackgroundTask");
        if (myCONCBackgroundTask$String != null) {
            common.ProxiInformation myCONCBackgroundTask$Info = common.RPCConstantsAndServices.createProxiInformation(myCONCBackgroundTask$String);
            myCONCBackgroundTask = view.objects.ViewProxi.createProxi(myCONCBackgroundTask$Info,connectionKey);
            myCONCBackgroundTask.setToString(myCONCBackgroundTask$Info.getToString());
        }
        GlobalOrderManagerView result$$ = new GlobalOrderManager(orders,(BackgroundTaskView)myCONCBackgroundTask, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
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
        if (this.object == null) return this.getLeafInfo() == 0;
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
    
    public BackgroundTaskView getMyCONCBackgroundTask()throws ModelException{
        return ((GlobalOrderManager)this.getTheObject()).getMyCONCBackgroundTask();
    }
    public void setMyCONCBackgroundTask(BackgroundTaskView newValue) throws ModelException {
        ((GlobalOrderManager)this.getTheObject()).setMyCONCBackgroundTask(newValue);
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
