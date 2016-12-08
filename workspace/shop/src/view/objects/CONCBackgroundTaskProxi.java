package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class CONCBackgroundTaskProxi extends BackgroundTaskProxi implements CONCBackgroundTaskView{
    
    public CONCBackgroundTaskProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public CONCBackgroundTaskView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        CONCBackgroundTaskView result$$ = new CONCBackgroundTask( this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
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
    
    
    public void accept(BackgroundTaskVisitor visitor) throws ModelException {
        visitor.handleCONCBackgroundTask(this);
    }
    public <R> R accept(BackgroundTaskReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCONCBackgroundTask(this);
    }
    public <E extends view.UserException>  void accept(BackgroundTaskExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCONCBackgroundTask(this);
    }
    public <R, E extends view.UserException> R accept(BackgroundTaskReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCONCBackgroundTask(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleCONCBackgroundTask(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCONCBackgroundTask(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCONCBackgroundTask(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCONCBackgroundTask(this);
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
