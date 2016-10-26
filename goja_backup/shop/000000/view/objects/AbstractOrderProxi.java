package view.objects;

import view.*;
import viewClient.*;

public abstract class AbstractOrderProxi extends ViewProxi implements AbstractOrderView{
    
    public AbstractOrderProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    
    public OrderQuantifiedArticleView getArticles()throws ModelException{
        return ((AbstractOrder)this.getTheObject()).getArticles();
    }
    public void setArticles(OrderQuantifiedArticleView newValue) throws ModelException {
        ((AbstractOrder)this.getTheObject()).setArticles(newValue);
    }
    public CustomerDeliveryTimeView getCustomerDeliveryTime()throws ModelException{
        return ((AbstractOrder)this.getTheObject()).getCustomerDeliveryTime();
    }
    public void setCustomerDeliveryTime(CustomerDeliveryTimeView newValue) throws ModelException {
        ((AbstractOrder)this.getTheObject()).setCustomerDeliveryTime(newValue);
    }
    
    
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
