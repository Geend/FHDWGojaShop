package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class OwnerArticleWrapperProxi extends ArticleWrapperProxi implements OwnerArticleWrapperView{
    
    public OwnerArticleWrapperProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public OwnerArticleWrapperView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        ViewProxi article = null;
        String article$String = (String)resultTable.get("article");
        if (article$String != null) {
            common.ProxiInformation article$Info = common.RPCConstantsAndServices.createProxiInformation(article$String);
            article = view.objects.ViewProxi.createProxi(article$Info,connectionKey);
            article.setToString(article$Info.getToString());
        }
        String name = (String)resultTable.get("name");
        common.Fraction price = common.Fraction.parse((String)resultTable.get("price"));
        long minStock = new Long((String)resultTable.get("minStock")).longValue();
        long maxStock = new Long((String)resultTable.get("maxStock")).longValue();
        long currentStock = new Long((String)resultTable.get("currentStock")).longValue();
        long producerDeliveryTime = new Long((String)resultTable.get("producerDeliveryTime")).longValue();
        String currentState = (String)resultTable.get("currentState");
        String producerName = (String)resultTable.get("producerName");
        ViewProxi state = null;
        String state$String = (String)resultTable.get("state");
        if (state$String != null) {
            common.ProxiInformation state$Info = common.RPCConstantsAndServices.createProxiInformation(state$String);
            state = view.objects.ViewProxi.createProxi(state$Info,connectionKey);
            state.setToString(state$Info.getToString());
        }
        OwnerArticleWrapperView result$$ = new OwnerArticleWrapper((ArticleView)article,(String)name,(common.Fraction)price,(long)minStock,(long)maxStock,(long)currentStock,(long)producerDeliveryTime,(String)currentState,(String)producerName,(ArticleStateView)state, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getArticle() != null) return new ArticleOwnerArticleWrapperWrapper(this, originalIndex, (ViewRoot)this.getArticle());
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
    
    public ArticleView getArticle()throws ModelException{
        return ((OwnerArticleWrapper)this.getTheObject()).getArticle();
    }
    public String getName()throws ModelException{
        return ((OwnerArticleWrapper)this.getTheObject()).getName();
    }
    public common.Fraction getPrice()throws ModelException{
        return ((OwnerArticleWrapper)this.getTheObject()).getPrice();
    }
    public long getMinStock()throws ModelException{
        return ((OwnerArticleWrapper)this.getTheObject()).getMinStock();
    }
    public long getMaxStock()throws ModelException{
        return ((OwnerArticleWrapper)this.getTheObject()).getMaxStock();
    }
    public long getCurrentStock()throws ModelException{
        return ((OwnerArticleWrapper)this.getTheObject()).getCurrentStock();
    }
    public long getProducerDeliveryTime()throws ModelException{
        return ((OwnerArticleWrapper)this.getTheObject()).getProducerDeliveryTime();
    }
    public String getCurrentState()throws ModelException{
        return ((OwnerArticleWrapper)this.getTheObject()).getCurrentState();
    }
    public String getProducerName()throws ModelException{
        return ((OwnerArticleWrapper)this.getTheObject()).getProducerName();
    }
    public ArticleStateView getState()throws ModelException{
        return ((OwnerArticleWrapper)this.getTheObject()).getState();
    }
    
    public void accept(ArticleWrapperVisitor visitor) throws ModelException {
        visitor.handleOwnerArticleWrapper(this);
    }
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public <E extends view.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOwnerArticleWrapper(this);
    }
    public <R, E extends view.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public void accept(ComponentWrapperVisitor visitor) throws ModelException {
        visitor.handleOwnerArticleWrapper(this);
    }
    public <R> R accept(ComponentWrapperReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public <E extends view.UserException>  void accept(ComponentWrapperExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOwnerArticleWrapper(this);
    }
    public <R, E extends view.UserException> R accept(ComponentWrapperReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleOwnerArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOwnerArticleWrapper(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOwnerArticleWrapper(this);
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
