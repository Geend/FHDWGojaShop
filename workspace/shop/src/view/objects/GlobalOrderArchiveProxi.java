package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class GlobalOrderArchiveProxi extends ViewProxi implements GlobalOrderArchiveView{
    
    public GlobalOrderArchiveProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public GlobalOrderArchiveView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Vector<String> orders_string = (java.util.Vector<String>)resultTable.get("orders");
        java.util.Vector<OrderView> orders = ViewProxi.getProxiVector(orders_string, connectionKey);
        GlobalOrderArchiveView result$$ = new GlobalOrderArchive(orders, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getOrders().size()) return new OrdersGlobalOrderArchiveWrapper(this, originalIndex, (ViewRoot)this.getOrders().get(index));
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
    
    public java.util.Vector<OrderView> getOrders()throws ModelException{
        return ((GlobalOrderArchive)this.getTheObject()).getOrders();
    }
    public void setOrders(java.util.Vector<OrderView> newValue) throws ModelException {
        ((GlobalOrderArchive)this.getTheObject()).setOrders(newValue);
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleGlobalOrderArchive(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleGlobalOrderArchive(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleGlobalOrderArchive(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleGlobalOrderArchive(this);
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
