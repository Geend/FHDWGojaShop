package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ReturnManagerProxi extends ViewProxi implements ReturnManagerView{
    
    public ReturnManagerProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public ReturnManagerView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Vector<String> articleReturn_string = (java.util.Vector<String>)resultTable.get("articleReturn");
        java.util.Vector<ArticleReturnView> articleReturn = ViewProxi.getProxiVector(articleReturn_string, connectionKey);
        ReturnManagerView result$$ = new ReturnManager(articleReturn, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getArticleReturn().size()) return new ArticleReturnReturnManagerWrapper(this, originalIndex, (ViewRoot)this.getArticleReturn().get(index));
        index = index - this.getArticleReturn().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getArticleReturn().size());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getArticleReturn().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getArticleReturnIterator = this.getArticleReturn().iterator();
        while(getArticleReturnIterator.hasNext()){
            if(getArticleReturnIterator.next().equals(child)) return result;
            result = result + 1;
        }
        return -1;
    }
    
    public java.util.Vector<ArticleReturnView> getArticleReturn()throws ModelException{
        return ((ReturnManager)this.getTheObject()).getArticleReturn();
    }
    public void setArticleReturn(java.util.Vector<ArticleReturnView> newValue) throws ModelException {
        ((ReturnManager)this.getTheObject()).setArticleReturn(newValue);
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleReturnManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleReturnManager(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleReturnManager(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleReturnManager(this);
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
