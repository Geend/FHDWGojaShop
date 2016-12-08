package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class CustomerDeliveryTimeManagerProxi extends ViewProxi implements CustomerDeliveryTimeManagerView{
    
    public CustomerDeliveryTimeManagerProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public CustomerDeliveryTimeManagerView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Vector<String> customerDeliveryTimes_string = (java.util.Vector<String>)resultTable.get("customerDeliveryTimes");
        java.util.Vector<CustomerDeliveryTimeView> customerDeliveryTimes = ViewProxi.getProxiVector(customerDeliveryTimes_string, connectionKey);
        CustomerDeliveryTimeManagerView result$$ = new CustomerDeliveryTimeManager(customerDeliveryTimes, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
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
        if (this.object == null) return this.getLeafInfo() == 0;
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
    
    public java.util.Vector<CustomerDeliveryTimeView> getCustomerDeliveryTimes()throws ModelException{
        return ((CustomerDeliveryTimeManager)this.getTheObject()).getCustomerDeliveryTimes();
    }
    public void setCustomerDeliveryTimes(java.util.Vector<CustomerDeliveryTimeView> newValue) throws ModelException {
        ((CustomerDeliveryTimeManager)this.getTheObject()).setCustomerDeliveryTimes(newValue);
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
