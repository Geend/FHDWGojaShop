package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ComponentContainerImplementationProxi extends ViewProxi implements ComponentContainerImplementationView{
    
    public ComponentContainerImplementationProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public ComponentContainerImplementationView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Vector<String> components_string = (java.util.Vector<String>)resultTable.get("components");
        java.util.Vector<ComponentView> components = ViewProxi.getProxiVector(components_string, connectionKey);
        ComponentContainerImplementationView result$$ = new ComponentContainerImplementation(components, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getComponents().size()) return new ComponentsComponentContainerImplementationWrapper(this, originalIndex, (ViewRoot)this.getComponents().get(index));
        index = index - this.getComponents().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getComponents().size());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getComponents().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getComponentsIterator = this.getComponents().iterator();
        while(getComponentsIterator.hasNext()){
            if(getComponentsIterator.next().equals(child)) return result;
            result = result + 1;
        }
        return -1;
    }
    
    public java.util.Vector<ComponentView> getComponents()throws ModelException{
        return ((ComponentContainerImplementation)this.getTheObject()).getComponents();
    }
    public void setComponents(java.util.Vector<ComponentView> newValue) throws ModelException {
        ((ComponentContainerImplementation)this.getTheObject()).setComponents(newValue);
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleComponentContainerImplementation(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleComponentContainerImplementation(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleComponentContainerImplementation(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleComponentContainerImplementation(this);
    }
    public void accept(ComponentContainerVisitor visitor) throws ModelException {
        visitor.handleComponentContainerImplementation(this);
    }
    public <R> R accept(ComponentContainerReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleComponentContainerImplementation(this);
    }
    public <E extends view.UserException>  void accept(ComponentContainerExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleComponentContainerImplementation(this);
    }
    public <R, E extends view.UserException> R accept(ComponentContainerReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleComponentContainerImplementation(this);
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
