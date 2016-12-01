package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class WaitingForAcceptOrderStateProxi extends OrderStateProxi implements WaitingForAcceptOrderStateView{
    
    public WaitingForAcceptOrderStateProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public WaitingForAcceptOrderStateView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        long ticksLeft = new Long((String)resultTable.get("ticksLeft")).longValue();
        WaitingForAcceptOrderStateView result$$ = new WaitingForAcceptOrderState((long)ticksLeft, this.getId(), this.getClassId());
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
    
    public long getTicksLeft()throws ModelException{
        return ((WaitingForAcceptOrderState)this.getTheObject()).getTicksLeft();
    }
    public void setTicksLeft(long newValue) throws ModelException {
        ((WaitingForAcceptOrderState)this.getTheObject()).setTicksLeft(newValue);
    }
    
    public void accept(OrderStateVisitor visitor) throws ModelException {
        visitor.handleWaitingForAcceptOrderState(this);
    }
    public <R> R accept(OrderStateReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleWaitingForAcceptOrderState(this);
    }
    public <E extends view.UserException>  void accept(OrderStateExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleWaitingForAcceptOrderState(this);
    }
    public <R, E extends view.UserException> R accept(OrderStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleWaitingForAcceptOrderState(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleWaitingForAcceptOrderState(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleWaitingForAcceptOrderState(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleWaitingForAcceptOrderState(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleWaitingForAcceptOrderState(this);
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
