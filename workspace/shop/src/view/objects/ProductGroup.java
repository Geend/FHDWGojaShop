
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class ProductGroup extends view.objects.Component implements ProductGroupView{
    
    protected java.util.Vector<ComponentView> components;
    protected String name;
    
    public ProductGroup(ComponentContainer parent,java.util.Vector<ComponentView> components,String name,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super((ComponentContainer)parent,id, classId);
        this.components = components;
        this.name = name;        
    }
    
    static public long getTypeId() {
        return 121;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public java.util.Vector<ComponentView> getComponents()throws ModelException{
        return this.components;
    }
    public void setComponents(java.util.Vector<ComponentView> newValue) throws ModelException {
        this.components = newValue;
    }
    public String getName()throws ModelException{
        return this.name;
    }
    public void setName(String newValue) throws ModelException {
        this.name = newValue;
    }
    
    public void accept(ComponentVisitor visitor) throws ModelException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleProductGroup(this);
    }
    public <E extends view.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends view.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleProductGroup(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleProductGroup(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleProductGroup(this);
    }
    public void accept(ComponentContainerVisitor visitor) throws ModelException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(ComponentContainerReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleProductGroup(this);
    }
    public <E extends view.UserException>  void accept(ComponentContainerExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends view.UserException> R accept(ComponentContainerReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleProductGroup(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        ComponentContainer parent = this.getParent();
        if (parent != null) {
            ((ViewProxi)parent).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(parent.getClassId(), parent.getId())));
        }
        java.util.Vector<?> components = this.getComponents();
        if (components != null) {
            ViewObject.resolveVectorProxies(components, resultTable);
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getComponents().size()) return new ComponentsProductGroupWrapper(this, originalIndex, (ViewRoot)this.getComponents().get(index));
        index = index - this.getComponents().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getComponents().size());
    }
    public boolean isLeaf() throws ModelException {
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
    public int getNameIndex() throws ModelException {
        return 0 + this.getComponents().size();
    }
    public int getRowCount(){
        return 0 
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "Name";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return this.getName();
                rowIndex = rowIndex - 1;
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
        if(rowIndex == 0){
            this.setName(newValue);
            return;
        }
        rowIndex = rowIndex - 1;
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
