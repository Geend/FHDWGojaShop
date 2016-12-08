package view.objects;

import view.*;
import viewClient.*;

public abstract class ComponentProxi extends ViewProxi implements ComponentView{
    
    public ComponentProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    
    public ComponentContainer getParent()throws ModelException{
        return ((Component)this.getTheObject()).getParent();
    }
    public void setParent(ComponentContainer newValue) throws ModelException {
        ((Component)this.getTheObject()).setParent(newValue);
    }
    
    
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
