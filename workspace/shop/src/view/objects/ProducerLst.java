
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class ProducerLst extends ViewObject implements ProducerLstView{
    
    protected java.util.Vector<ProducerView> currentProducer;
    
    public ProducerLst(java.util.Vector<ProducerView> currentProducer,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.currentProducer = currentProducer;        
    }
    
    static public long getTypeId() {
        return 210;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public java.util.Vector<ProducerView> getCurrentProducer()throws ModelException{
        return this.currentProducer;
    }
    public void setCurrentProducer(java.util.Vector<ProducerView> newValue) throws ModelException {
        this.currentProducer = newValue;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleProducerLst(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleProducerLst(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleProducerLst(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleProducerLst(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        java.util.Vector<?> currentProducer = this.getCurrentProducer();
        if (currentProducer != null) {
            ViewObject.resolveVectorProxies(currentProducer, resultTable);
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getCurrentProducer().size()) return new CurrentProducerProducerLstWrapper(this, originalIndex, (ViewRoot)this.getCurrentProducer().get(index));
        index = index - this.getCurrentProducer().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getCurrentProducer().size());
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getCurrentProducer().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getCurrentProducerIterator = this.getCurrentProducer().iterator();
        while(getCurrentProducerIterator.hasNext()){
            if(getCurrentProducerIterator.next().equals(child)) return result;
            result = result + 1;
        }
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
