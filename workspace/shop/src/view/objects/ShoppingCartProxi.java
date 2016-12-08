package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ShoppingCartProxi extends ViewProxi implements ShoppingCartView{
    
    public ShoppingCartProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public ShoppingCartView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Vector<String> articles_string = (java.util.Vector<String>)resultTable.get("articles");
        java.util.Vector<ShoppingCartQuantifiedArticleView> articles = ViewProxi.getProxiVector(articles_string, connectionKey);
        ShoppingCartView result$$ = new ShoppingCart(articles, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getArticles().size()) return new ArticlesShoppingCartWrapper(this, originalIndex, (ViewRoot)this.getArticles().get(index));
        index = index - this.getArticles().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getArticles().size());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getArticles().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getArticlesIterator = this.getArticles().iterator();
        while(getArticlesIterator.hasNext()){
            if(getArticlesIterator.next().equals(child)) return result;
            result = result + 1;
        }
        return -1;
    }
    
    public java.util.Vector<ShoppingCartQuantifiedArticleView> getArticles()throws ModelException{
        return ((ShoppingCart)this.getTheObject()).getArticles();
    }
    public void setArticles(java.util.Vector<ShoppingCartQuantifiedArticleView> newValue) throws ModelException {
        ((ShoppingCart)this.getTheObject()).setArticles(newValue);
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleShoppingCart(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleShoppingCart(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleShoppingCart(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleShoppingCart(this);
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
