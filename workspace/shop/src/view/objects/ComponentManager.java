
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class ComponentManager extends ViewObject implements ComponentManagerView{
    
    protected ComponentContainerImplementationView container;
    
    public ComponentManager(ComponentContainerImplementationView container,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.container = container;        
    }
    
    static public long getTypeId() {
        return 379;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public ComponentContainerImplementationView getContainer()throws ModelException{
        return this.container;
    }
    public void setContainer(ComponentContainerImplementationView newValue) throws ModelException {
        this.container = newValue;
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
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        ComponentContainerImplementationView container = this.getContainer();
        if (container != null) {
            ((ViewProxi)container).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(container.getClassId(), container.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
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
        return true 
            && (this.getContainer() == null ? true : this.getContainer().getTheObject().isLeaf());
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getContainer() != null && this.getContainer().equals(child)) return result;
        if(this.getContainer() != null) result = result + 1;
        return -1;
    }
    public int getRowCount(){
        return 0 ;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
            } else {
            }
            throw new ModelException("Table index out of bounds!", -1);
        } catch (ModelException e){
            return e.getMessage();
        }
    }
    
    public boolean isRowEditable(int index){
        return true;
    }
    public void setValueAt(String newValue, int rowIndex) throws Exception {
        
    }
    public boolean hasTransientFields(){
        return false;
    }
    /* Start of protected part that is not overridden by persistence generator */
    
    public javafx.scene.image.Image getImage() {
        return super.getImage();
    }
    /* End of protected part that is not overridden by persistence generator */
    
    
}
