package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class BackgroundTaskManagerProxi extends ViewProxi implements BackgroundTaskManagerView{
    
    public BackgroundTaskManagerProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public BackgroundTaskManagerView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Vector<String> tasks_string = (java.util.Vector<String>)resultTable.get("tasks");
        java.util.Vector<BackgroundTaskView> tasks = ViewProxi.getProxiVector(tasks_string, connectionKey);
        BackgroundTaskManagerView result$$ = new BackgroundTaskManager(tasks, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
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
        if (this.object == null) return this.getLeafInfo() == 0;
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
    
    public java.util.Vector<BackgroundTaskView> getTasks()throws ModelException{
        return ((BackgroundTaskManager)this.getTheObject()).getTasks();
    }
    public void setTasks(java.util.Vector<BackgroundTaskView> newValue) throws ModelException {
        ((BackgroundTaskManager)this.getTheObject()).setTasks(newValue);
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
