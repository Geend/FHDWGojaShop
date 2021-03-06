package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ReturnQuantifiedArticleProxi extends QuantifiedArticleProxi implements ReturnQuantifiedArticleView{
    
    public ReturnQuantifiedArticleProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public ReturnQuantifiedArticleView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        long quantity = new Long((String)resultTable.get("quantity")).longValue();
        ViewProxi article = null;
        String article$String = (String)resultTable.get("article");
        if (article$String != null) {
            common.ProxiInformation article$Info = common.RPCConstantsAndServices.createProxiInformation(article$String);
            article = view.objects.ViewProxi.createProxi(article$Info,connectionKey);
            article.setToString(article$Info.getToString());
        }
        ReturnQuantifiedArticleView result$$ = new ReturnQuantifiedArticle((long)quantity,(ArticleWrapperView)article, this.getId(), this.getClassId());
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
    
    
    public void accept(QuantifiedArticleVisitor visitor) throws ModelException {
        visitor.handleReturnQuantifiedArticle(this);
    }
    public <R> R accept(QuantifiedArticleReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleReturnQuantifiedArticle(this);
    }
    public <E extends view.UserException>  void accept(QuantifiedArticleExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleReturnQuantifiedArticle(this);
    }
    public <R, E extends view.UserException> R accept(QuantifiedArticleReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleReturnQuantifiedArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleReturnQuantifiedArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleReturnQuantifiedArticle(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleReturnQuantifiedArticle(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleReturnQuantifiedArticle(this);
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
