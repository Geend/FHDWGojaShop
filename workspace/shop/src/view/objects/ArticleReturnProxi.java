package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ArticleReturnProxi extends ViewProxi implements ArticleReturnView{
    
    public ArticleReturnProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public ArticleReturnView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        ViewProxi order = null;
        String order$String = (String)resultTable.get("order");
        if (order$String != null) {
            common.ProxiInformation order$Info = common.RPCConstantsAndServices.createProxiInformation(order$String);
            order = view.objects.ViewProxi.createProxi(order$Info,connectionKey);
            order.setToString(order$Info.getToString());
        }
        java.util.Vector<String> returnArticles_string = (java.util.Vector<String>)resultTable.get("returnArticles");
        java.util.Vector<ReturnQuantifiedArticleView> returnArticles = ViewProxi.getProxiVector(returnArticles_string, connectionKey);
        ArticleReturnView result$$ = new ArticleReturn((OrderView)order,returnArticles, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getOrder() != null) return new OrderArticleReturnWrapper(this, originalIndex, (ViewRoot)this.getOrder());
        if(this.getOrder() != null) index = index - 1;
        if(index < this.getReturnArticles().size()) return new ReturnArticlesArticleReturnWrapper(this, originalIndex, (ViewRoot)this.getReturnArticles().get(index));
        index = index - this.getReturnArticles().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getOrder() == null ? 0 : 1)
            + (this.getReturnArticles().size());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getOrder() == null ? true : false)
            && (this.getReturnArticles().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getOrder() != null && this.getOrder().equals(child)) return result;
        if(this.getOrder() != null) result = result + 1;
        java.util.Iterator<?> getReturnArticlesIterator = this.getReturnArticles().iterator();
        while(getReturnArticlesIterator.hasNext()){
            if(getReturnArticlesIterator.next().equals(child)) return result;
            result = result + 1;
        }
        return -1;
    }
    
    public OrderView getOrder()throws ModelException{
        return ((ArticleReturn)this.getTheObject()).getOrder();
    }
    public void setOrder(OrderView newValue) throws ModelException {
        ((ArticleReturn)this.getTheObject()).setOrder(newValue);
    }
    public java.util.Vector<ReturnQuantifiedArticleView> getReturnArticles()throws ModelException{
        return ((ArticleReturn)this.getTheObject()).getReturnArticles();
    }
    public void setReturnArticles(java.util.Vector<ReturnQuantifiedArticleView> newValue) throws ModelException {
        ((ArticleReturn)this.getTheObject()).setReturnArticles(newValue);
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleArticleReturn(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArticleReturn(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArticleReturn(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArticleReturn(this);
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
