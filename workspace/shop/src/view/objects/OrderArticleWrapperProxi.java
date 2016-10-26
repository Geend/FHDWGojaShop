package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class OrderArticleWrapperProxi extends ArticleWrapperProxi implements OrderArticleWrapperView{
    
    public OrderArticleWrapperProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public OrderArticleWrapperView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        ViewProxi article = null;
        String article$String = (String)resultTable.get("article");
        if (article$String != null) {
            common.ProxiInformation article$Info = common.RPCConstantsAndServices.createProxiInformation(article$String);
            article = view.objects.ViewProxi.createProxi(article$Info,connectionKey);
            article.setToString(article$Info.getToString());
        }
        String name = (String)resultTable.get("name");
        common.Fraction priceAtOrder = common.Fraction.parse((String)resultTable.get("priceAtOrder"));
        OrderArticleWrapperView result$$ = new OrderArticleWrapper((ArticleView)article,(String)name,(common.Fraction)priceAtOrder, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getArticle() != null) return new ArticleArticleWrapperWrapper(this, originalIndex, (ViewRoot)this.getArticle());
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
    
    public common.Fraction getPriceAtOrder()throws ModelException{
        return ((OrderArticleWrapper)this.getTheObject()).getPriceAtOrder();
    }
    public void setPriceAtOrder(common.Fraction newValue) throws ModelException {
        ((OrderArticleWrapper)this.getTheObject()).setPriceAtOrder(newValue);
    }
    
    public void accept(ArticleWrapperVisitor visitor) throws ModelException {
        visitor.handleOrderArticleWrapper(this);
    }
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderArticleWrapper(this);
    }
    public <E extends view.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderArticleWrapper(this);
    }
    public <R, E extends view.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderArticleWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleOrderArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderArticleWrapper(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderArticleWrapper(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderArticleWrapper(this);
    }
    
    public boolean hasTransientFields(){
        return true;
    }
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    private final int RemoteDepth = 1;
    
    /* End of protected part that is not overridden by persistence generator */
    
}
