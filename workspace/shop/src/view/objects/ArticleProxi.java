package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ArticleProxi extends ComponentProxi implements ArticleView{
    
    public ArticleProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public ArticleView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        String name = (String)resultTable.get("name");
        common.Fraction price = common.Fraction.parse((String)resultTable.get("price"));
        long minStock = new Long((String)resultTable.get("minStock")).longValue();
        long maxStock = new Long((String)resultTable.get("maxStock")).longValue();
        long currentStock = new Long((String)resultTable.get("currentStock")).longValue();
        long producerDeliveryTime = new Long((String)resultTable.get("producerDeliveryTime")).longValue();
        ViewProxi producer = null;
        String producer$String = (String)resultTable.get("producer");
        if (producer$String != null) {
            common.ProxiInformation producer$Info = common.RPCConstantsAndServices.createProxiInformation(producer$String);
            producer = view.objects.ViewProxi.createProxi(producer$Info,connectionKey);
            producer.setToString(producer$Info.getToString());
        }
        ViewProxi state = null;
        String state$String = (String)resultTable.get("state");
        if (state$String != null) {
            common.ProxiInformation state$Info = common.RPCConstantsAndServices.createProxiInformation(state$String);
            state = view.objects.ViewProxi.createProxi(state$Info,connectionKey);
            state.setToString(state$Info.getToString());
        }
        ViewProxi parent = null;
        String parent$String = (String)resultTable.get("parent");
        if (parent$String != null) {
            common.ProxiInformation parent$Info = common.RPCConstantsAndServices.createProxiInformation(parent$String);
            parent = view.objects.ViewProxi.createProxi(parent$Info,connectionKey);
            parent.setToString(parent$Info.getToString());
        }
        ArticleView result$$ = new Article((String)name,(common.Fraction)price,(long)minStock,(long)maxStock,(long)currentStock,(long)producerDeliveryTime,(ProducerView)producer,(ArticleStateView)state,(ProductGroupView)parent, this.getId(), this.getClassId());
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
        return ((Article)this.getTheObject()).getPrice();
    }
    public void setPrice(common.Fraction newValue) throws ModelException {
        ((Article)this.getTheObject()).setPrice(newValue);
    }
    public long getMinStock()throws ModelException{
        return ((Article)this.getTheObject()).getMinStock();
    }
    public void setMinStock(long newValue) throws ModelException {
        ((Article)this.getTheObject()).setMinStock(newValue);
    }
    public long getMaxStock()throws ModelException{
        return ((Article)this.getTheObject()).getMaxStock();
    }
    public void setMaxStock(long newValue) throws ModelException {
        ((Article)this.getTheObject()).setMaxStock(newValue);
    }
    public long getCurrentStock()throws ModelException{
        return ((Article)this.getTheObject()).getCurrentStock();
    }
    public void setCurrentStock(long newValue) throws ModelException {
        ((Article)this.getTheObject()).setCurrentStock(newValue);
    }
    public long getProducerDeliveryTime()throws ModelException{
        return ((Article)this.getTheObject()).getProducerDeliveryTime();
    }
    public void setProducerDeliveryTime(long newValue) throws ModelException {
        ((Article)this.getTheObject()).setProducerDeliveryTime(newValue);
    }
    public ProducerView getProducer()throws ModelException{
        return ((Article)this.getTheObject()).getProducer();
    }
    public void setProducer(ProducerView newValue) throws ModelException {
        ((Article)this.getTheObject()).setProducer(newValue);
    }
    public ArticleStateView getState()throws ModelException{
        return ((Article)this.getTheObject()).getState();
    }
    public void setState(ArticleStateView newValue) throws ModelException {
        ((Article)this.getTheObject()).setState(newValue);
    }
    public ProductGroupView getParent()throws ModelException{
        return ((Article)this.getTheObject()).getParent();
    }
    public void setParent(ProductGroupView newValue) throws ModelException {
        ((Article)this.getTheObject()).setParent(newValue);
    }
    
    public void accept(ComponentVisitor visitor) throws ModelException {
        visitor.handleArticle(this);
    }
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArticle(this);
    }
    public <E extends view.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArticle(this);
    }
    public <R, E extends view.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArticle(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArticle(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArticle(this);
    }
    public void accept(SubComponentVisitor visitor) throws ModelException {
        visitor.handleArticle(this);
    }
    public <R> R accept(SubComponentReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArticle(this);
    }
    public <E extends view.UserException>  void accept(SubComponentExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArticle(this);
    }
    public <R, E extends view.UserException> R accept(SubComponentReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArticle(this);
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
