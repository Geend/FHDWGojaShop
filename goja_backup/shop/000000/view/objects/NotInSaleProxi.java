package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class NotInSaleProxi extends ArticleStateProxi implements NotInSaleView{
    
    public NotInSaleProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public NotInSaleView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        NotInSaleView result$$ = new NotInSale( this.getId(), this.getClassId());
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
    
    
    public void accept(ArticleStateVisitor visitor) throws ModelException {
        visitor.handleNotInSale(this);
    }
    public <R> R accept(ArticleStateReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleNotInSale(this);
    }
    public <E extends view.UserException>  void accept(ArticleStateExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleNotInSale(this);
    }
    public <R, E extends view.UserException> R accept(ArticleStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleNotInSale(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleNotInSale(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleNotInSale(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleNotInSale(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleNotInSale(this);
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
