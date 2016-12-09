package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class OrderQuantifiedArticlePreOrderProxi extends OrderQuantifiedArticleStateProxi implements OrderQuantifiedArticlePreOrderView{
    
    public OrderQuantifiedArticlePreOrderProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public OrderQuantifiedArticlePreOrderView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        long leftQuantity = new Long((String)resultTable.get("leftQuantity")).longValue();
        OrderQuantifiedArticlePreOrderView result$$ = new OrderQuantifiedArticlePreOrder((long)leftQuantity, this.getId(), this.getClassId());
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
    
    public long getLeftQuantity()throws ModelException{
        return ((OrderQuantifiedArticlePreOrder)this.getTheObject()).getLeftQuantity();
    }
    public void setLeftQuantity(long newValue) throws ModelException {
        ((OrderQuantifiedArticlePreOrder)this.getTheObject()).setLeftQuantity(newValue);
    }
    
    public void accept(OrderQuantifiedArticleStateVisitor visitor) throws ModelException {
        visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R> R accept(OrderQuantifiedArticleStateReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <E extends view.UserException>  void accept(OrderQuantifiedArticleStateExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R, E extends view.UserException> R accept(OrderQuantifiedArticleStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
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
