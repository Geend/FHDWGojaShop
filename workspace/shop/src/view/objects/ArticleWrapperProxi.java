package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ArticleWrapperProxi extends ComponentProxi implements ArticleWrapperView{
    
    public ArticleWrapperProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public ArticleWrapperView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        ViewProxi parent = null;
        String parent$String = (String)resultTable.get("parent");
        if (parent$String != null) {
            common.ProxiInformation parent$Info = common.RPCConstantsAndServices.createProxiInformation(parent$String);
            parent = view.objects.ViewProxi.createProxi(parent$Info,connectionKey);
            parent.setToString(parent$Info.getToString());
        }
        common.Fraction price = common.Fraction.parse((String)resultTable.get("price"));
        String name = (String)resultTable.get("name");
        ArticleWrapperView result$$ = new ArticleWrapper((ComponentContainer)parent,(common.Fraction)price,(String)name, this.getId(), this.getClassId());
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
    
    public common.Fraction getPrice()throws ModelException{
        return ((ArticleWrapper)this.getTheObject()).getPrice();
    }
    public String getName()throws ModelException{
        return ((ArticleWrapper)this.getTheObject()).getName();
    }
    
    public void accept(ComponentVisitor visitor) throws ModelException {
        visitor.handleArticleWrapper(this);
    }
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArticleWrapper(this);
    }
    public <E extends view.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArticleWrapper(this);
    }
    public <R, E extends view.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArticleWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArticleWrapper(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArticleWrapper(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArticleWrapper(this);
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
