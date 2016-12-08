package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class CustomerDeliveryTimeProxi extends ViewProxi implements CustomerDeliveryTimeView{
    
    public CustomerDeliveryTimeProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public CustomerDeliveryTimeView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        String name = (String)resultTable.get("name");
        common.Fraction price = common.Fraction.parse((String)resultTable.get("price"));
        long deliveryTime = new Long((String)resultTable.get("deliveryTime")).longValue();
        CustomerDeliveryTimeView result$$ = new CustomerDeliveryTime((String)name,(common.Fraction)price,(long)deliveryTime, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
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
    
    public String getName()throws ModelException{
        return ((CustomerDeliveryTime)this.getTheObject()).getName();
    }
    public void setName(String newValue) throws ModelException {
        ((CustomerDeliveryTime)this.getTheObject()).setName(newValue);
    }
    public common.Fraction getPrice()throws ModelException{
        return ((CustomerDeliveryTime)this.getTheObject()).getPrice();
    }
    public void setPrice(common.Fraction newValue) throws ModelException {
        ((CustomerDeliveryTime)this.getTheObject()).setPrice(newValue);
    }
    public long getDeliveryTime()throws ModelException{
        return ((CustomerDeliveryTime)this.getTheObject()).getDeliveryTime();
    }
    public void setDeliveryTime(long newValue) throws ModelException {
        ((CustomerDeliveryTime)this.getTheObject()).setDeliveryTime(newValue);
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
