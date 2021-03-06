package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ReOrderQuantifiedArticleProxi extends QuantifiedArticleProxi implements ReOrderQuantifiedArticleView{
    
    public ReOrderQuantifiedArticleProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public ReOrderQuantifiedArticleView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        long quantity = new Long((String)resultTable.get("quantity")).longValue();
        ViewProxi article = null;
        String article$String = (String)resultTable.get("article");
        if (article$String != null) {
            common.ProxiInformation article$Info = common.RPCConstantsAndServices.createProxiInformation(article$String);
            article = view.objects.ViewProxi.createProxi(article$Info,connectionKey);
            article.setToString(article$Info.getToString());
        }
        long producerDeliveryTimeAtReorder = new Long((String)resultTable.get("producerDeliveryTimeAtReorder")).longValue();
        long countdown = new Long((String)resultTable.get("countdown")).longValue();
        ReOrderQuantifiedArticleView result$$ = new ReOrderQuantifiedArticle((long)quantity,(ArticleWrapperView)article,(long)producerDeliveryTimeAtReorder,(long)countdown, this.getId(), this.getClassId());
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
    
    public long getProducerDeliveryTimeAtReorder()throws ModelException{
        return ((ReOrderQuantifiedArticle)this.getTheObject()).getProducerDeliveryTimeAtReorder();
    }
    public void setProducerDeliveryTimeAtReorder(long newValue) throws ModelException {
        ((ReOrderQuantifiedArticle)this.getTheObject()).setProducerDeliveryTimeAtReorder(newValue);
    }
    public long getCountdown()throws ModelException{
        return ((ReOrderQuantifiedArticle)this.getTheObject()).getCountdown();
    }
    public void setCountdown(long newValue) throws ModelException {
        ((ReOrderQuantifiedArticle)this.getTheObject()).setCountdown(newValue);
    }
    
    public void accept(QuantifiedArticleVisitor visitor) throws ModelException {
        visitor.handleReOrderQuantifiedArticle(this);
    }
    public <R> R accept(QuantifiedArticleReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleReOrderQuantifiedArticle(this);
    }
    public <E extends view.UserException>  void accept(QuantifiedArticleExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleReOrderQuantifiedArticle(this);
    }
    public <R, E extends view.UserException> R accept(QuantifiedArticleReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleReOrderQuantifiedArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleReOrderQuantifiedArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleReOrderQuantifiedArticle(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleReOrderQuantifiedArticle(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleReOrderQuantifiedArticle(this);
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
