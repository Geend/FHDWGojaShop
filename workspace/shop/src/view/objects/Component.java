
package view.objects;

import view.*;


/* Additional import section end */

public abstract class Component extends ViewObject implements ComponentView{
    
    protected ComponentContainer parent;
    
    public Component(ComponentContainer parent,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.parent = parent;        
    }
    
    public ComponentContainer getParent()throws ModelException{
        return this.parent;
    }
    public void setParent(ComponentContainer newValue) throws ModelException {
        this.parent = newValue;
    }
    
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        ComponentContainer parent = this.getParent();
        if (parent != null) {
            ((ViewProxi)parent).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(parent.getClassId(), parent.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
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
    /* Start of protected part that is not overridden by persistence generator */
    
    public javafx.scene.image.Image getImage() {
        return super.getImage();
    }
    /* End of protected part that is not overridden by persistence generator */
    
    
}
