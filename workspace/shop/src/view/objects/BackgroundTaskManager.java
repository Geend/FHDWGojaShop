
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class BackgroundTaskManager extends ViewObject implements BackgroundTaskManagerView{
    
    protected java.util.Vector<BackgroundTaskView> tasks;
    
    public BackgroundTaskManager(java.util.Vector<BackgroundTaskView> tasks,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.tasks = tasks;        
    }
    
    static public long getTypeId() {
        return 363;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public java.util.Vector<BackgroundTaskView> getTasks()throws ModelException{
        return this.tasks;
    }
    public void setTasks(java.util.Vector<BackgroundTaskView> newValue) throws ModelException {
        this.tasks = newValue;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleBackgroundTaskManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleBackgroundTaskManager(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleBackgroundTaskManager(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleBackgroundTaskManager(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        java.util.Vector<?> tasks = this.getTasks();
        if (tasks != null) {
            ViewObject.resolveVectorProxies(tasks, resultTable);
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getTasks().size()) return new TasksBackgroundTaskManagerWrapper(this, originalIndex, (ViewRoot)this.getTasks().get(index));
        index = index - this.getTasks().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getTasks().size());
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getTasks().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getTasksIterator = this.getTasks().iterator();
        while(getTasksIterator.hasNext()){
            if(getTasksIterator.next().equals(child)) return result;
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
