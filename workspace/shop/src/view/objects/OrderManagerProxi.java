package view.objects;

import view.*;
import viewClient.*;

public abstract class OrderManagerProxi extends ViewProxi implements OrderManagerView{
    
    public OrderManagerProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    
    public java.util.Vector<OrderView> getOrders()throws ModelException{
        return ((OrderManager)this.getTheObject()).getOrders();
    }
    public void setOrders(java.util.Vector<OrderView> newValue) throws ModelException {
        ((OrderManager)this.getTheObject()).setOrders(newValue);
    }
    
    
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
