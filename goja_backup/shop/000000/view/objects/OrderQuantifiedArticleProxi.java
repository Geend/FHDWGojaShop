package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class OrderQuantifiedArticleProxi extends QuantifiedArticleProxi implements OrderQuantifiedArticleView{
    
    public OrderQuantifiedArticleProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public OrderQuantifiedArticleView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        long quantity = new Long((String)resultTable.get("quantity")).longValue();
        ViewProxi article = null;
        String article$String = (String)resultTable.get("article");
        if (article$String != null) {
            common.ProxiInformation article$Info = common.RPCConstantsAndServices.createProxiInformation(article$String);
            article = view.objects.ViewProxi.createProxi(article$Info,connectionKey);
            article.setToString(article$Info.getToString());
        }
        OrderQuantifiedArticleView result$$ = new OrderQuantifiedArticle((long)quantity,(OrderArticleWrapperView)article, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getArticle() != null) return new ArticleOrderQuantifiedArticleWrapper(this, originalIndex, (ViewRoot)this.getArticle());
        if(this.getArticle() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getArticle() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getArticle() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getArticle() != null && this.getArticle().equals(child)) return result;
        if(this.getArticle() != null) result = result + 1;
        return -1;
    }
    
    public OrderArticleWrapperView getArticle()throws ModelException{
        return ((OrderQuantifiedArticle)this.getTheObject()).getArticle();
    }
    public void setArticle(OrderArticleWrapperView newValue) throws ModelException {
        ((OrderQuantifiedArticle)this.getTheObject()).setArticle(newValue);
    }
    
    public void accept(QuantifiedArticleVisitor visitor) throws ModelException {
        visitor.handleOrderQuantifiedArticle(this);
    }
    public <R> R accept(QuantifiedArticleReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    public <E extends view.UserException>  void accept(QuantifiedArticleExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderQuantifiedArticle(this);
    }
    public <R, E extends view.UserException> R accept(QuantifiedArticleReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleOrderQuantifiedArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderQuantifiedArticle(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderQuantifiedArticle(this);
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
