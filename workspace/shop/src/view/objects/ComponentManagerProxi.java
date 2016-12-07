package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ComponentManagerProxi extends ViewProxi implements ComponentManagerView{
    
    public ComponentManagerProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public ComponentManagerView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        ViewProxi container = null;
        String container$String = (String)resultTable.get("container");
        if (container$String != null) {
            common.ProxiInformation container$Info = common.RPCConstantsAndServices.createProxiInformation(container$String);
            container = view.objects.ViewProxi.createProxi(container$Info,connectionKey);
            container.setToString(container$Info.getToString());
        }
        ComponentManagerView result$$ = new ComponentManager((ComponentContainerImplementationView)container, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(this.getContainer() != null && index < this.getContainer().getTheObject().getChildCount())
            return this.getContainer().getTheObject().getChild(index);
        if(this.getContainer() != null) index = index - this.getContainer().getTheObject().getChildCount();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getContainer() == null ? 0 : this.getContainer().getTheObject().getChildCount());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getContainer() == null ? true : this.getContainer().getTheObject().isLeaf());
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getContainer() != null && this.getContainer().equals(child)) return result;
        if(this.getContainer() != null) result = result + 1;
        return -1;
    }
    
    public ComponentContainerImplementationView getContainer()throws ModelException{
        return ((ComponentManager)this.getTheObject()).getContainer();
    }
    public void setContainer(ComponentContainerImplementationView newValue) throws ModelException {
        ((ComponentManager)this.getTheObject()).setContainer(newValue);
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleComponentManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleComponentManager(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleComponentManager(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleComponentManager(this);
    }
    public void accept(ComponentContainerVisitor visitor) throws ModelException {
        visitor.handleComponentManager(this);
    }
    public <R> R accept(ComponentContainerReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleComponentManager(this);
    }
    public <E extends view.UserException>  void accept(ComponentContainerExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleComponentManager(this);
    }
    public <R, E extends view.UserException> R accept(ComponentContainerReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleComponentManager(this);
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
