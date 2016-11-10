package view.objects;

import view.*;
import viewClient.*;

public abstract class ProductGroupProxi extends ComponentProxi implements ProductGroupView{
    
    public ProductGroupProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    
    public java.util.Vector<ComponentView> getComponents()throws ModelException{
        return ((ProductGroup)this.getTheObject()).getComponents();
    }
    public void setComponents(java.util.Vector<ComponentView> newValue) throws ModelException {
        ((ProductGroup)this.getTheObject()).setComponents(newValue);
    }
    
    
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    private final int RemoteDepth = 1;
    
    /* End of protected part that is not overridden by persistence generator */
    
}
