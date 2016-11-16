
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class OwnerArticleWrapper extends view.objects.ArticleWrapper implements OwnerArticleWrapperView{
    
    protected ArticleView article;
    protected String name;
    protected common.Fraction price;
    protected long minStock;
    protected long maxStock;
    protected long currentStock;
    protected long producerDeliveryTime;
    protected String currentState;
    protected String producerName;
    protected ArticleStateView state;
    
    public OwnerArticleWrapper(ArticleView article,String name,common.Fraction price,long minStock,long maxStock,long currentStock,long producerDeliveryTime,String currentState,String producerName,ArticleStateView state,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.article = article;
        this.name = name;
        this.price = price;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.currentStock = currentStock;
        this.producerDeliveryTime = producerDeliveryTime;
        this.currentState = currentState;
        this.producerName = producerName;
        this.state = state;        
    }
    
    static public long getTypeId() {
        return 295;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public ArticleView getArticle()throws ModelException{
        return this.article;
    }
    public String getName()throws ModelException{
        return this.name;
    }
    public common.Fraction getPrice()throws ModelException{
        return this.price;
    }
    public long getMinStock()throws ModelException{
        return this.minStock;
    }
    public long getMaxStock()throws ModelException{
        return this.maxStock;
    }
    public long getCurrentStock()throws ModelException{
        return this.currentStock;
    }
    public long getProducerDeliveryTime()throws ModelException{
        return this.producerDeliveryTime;
    }
    public String getCurrentState()throws ModelException{
        return this.currentState;
    }
    public String getProducerName()throws ModelException{
        return this.producerName;
    }
    public ArticleStateView getState()throws ModelException{
        return this.state;
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
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        ArticleView article = this.getArticle();
        if (article != null) {
            ((ViewProxi)article).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(article.getClassId(), article.getId())));
        }
        ArticleStateView state = this.getState();
        if (state != null) {
            ((ViewProxi)state).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(state.getClassId(), state.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
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
        return true 
            && (this.getArticle() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getArticle() != null && this.getArticle().equals(child)) return result;
        if(this.getArticle() != null) result = result + 1;
        return -1;
    }
    public int getNameIndex() throws ModelException {
        return 0 + (this.getArticle() == null ? 0 : 1);
    }
    public int getPriceIndex() throws ModelException {
        return 0 + (this.getArticle() == null ? 0 : 1) + 1;
    }
    public int getMinStockIndex() throws ModelException {
        return 0 + (this.getArticle() == null ? 0 : 1) + 1 + 1;
    }
    public int getMaxStockIndex() throws ModelException {
        return 0 + (this.getArticle() == null ? 0 : 1) + 1 + 1 + 1;
    }
    public int getCurrentStockIndex() throws ModelException {
        return 0 + (this.getArticle() == null ? 0 : 1) + 1 + 1 + 1 + 1;
    }
    public int getProducerDeliveryTimeIndex() throws ModelException {
        return 0 + (this.getArticle() == null ? 0 : 1) + 1 + 1 + 1 + 1 + 1;
    }
    public int getCurrentStateIndex() throws ModelException {
        return 0 + (this.getArticle() == null ? 0 : 1) + 1 + 1 + 1 + 1 + 1 + 1;
    }
    public int getProducerNameIndex() throws ModelException {
        return 0 + (this.getArticle() == null ? 0 : 1) + 1 + 1 + 1 + 1 + 1 + 1 + 1;
    }
    public int getRowCount(){
        return 0 
            + 1
            + 1
            + 1
            + 1
            + 1
            + 1
            + 1
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "name";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "price";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "minStock";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "maxStock";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "currentStock";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "producerDeliveryTime";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "currentState";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "producerName";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return this.getName();
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return this.getPrice();
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return new Long(getMinStock());
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return new Long(getMaxStock());
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return new Long(getCurrentStock());
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return new Long(getProducerDeliveryTime());
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return this.getCurrentState();
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return this.getProducerName();
                rowIndex = rowIndex - 1;
            }
            throw new ModelException("Table index out of bounds!", -1);
        } catch (ModelException e){
            return e.getMessage();
        }
    }
    
    public boolean isRowEditable(int index){
        return true;
    }
    public void setValueAt(String newValue, int rowIndex) throws Exception {
        rowIndex = rowIndex - 1;
        rowIndex = rowIndex - 1;
        rowIndex = rowIndex - 1;
        rowIndex = rowIndex - 1;
        rowIndex = rowIndex - 1;
        rowIndex = rowIndex - 1;
        rowIndex = rowIndex - 1;
        rowIndex = rowIndex - 1;
    }
    public boolean hasTransientFields(){
        return true;
    }
    /* Start of protected part that is not overridden by persistence generator */
    
    public javafx.scene.image.Image getImage() {
        return super.getImage();
    }
    /* End of protected part that is not overridden by persistence generator */
    
    
}
