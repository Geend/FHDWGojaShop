
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class Article extends view.objects.Component implements ArticleView{
    
    protected common.Fraction price;
    protected long minStock;
    protected long maxStock;
    protected long currentStock;
    protected long producerDeliveryTime;
    protected ProducerView producer;
    protected ArticleStateView state;
    protected String currentState;
    protected String producerName;
    
    public Article(String name,common.Fraction price,long minStock,long maxStock,long currentStock,long producerDeliveryTime,ProducerView producer,ArticleStateView state,String currentState,String producerName,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super((String)name,id, classId);
        this.price = price;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.currentStock = currentStock;
        this.producerDeliveryTime = producerDeliveryTime;
        this.producer = producer;
        this.state = state;
        this.currentState = currentState;
        this.producerName = producerName;        
    }
    
    static public long getTypeId() {
        return 194;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public common.Fraction getPrice()throws ModelException{
        return this.price;
    }
    public void setPrice(common.Fraction newValue) throws ModelException {
        this.price = newValue;
    }
    public long getMinStock()throws ModelException{
        return this.minStock;
    }
    public void setMinStock(long newValue) throws ModelException {
        this.minStock = newValue;
    }
    public long getMaxStock()throws ModelException{
        return this.maxStock;
    }
    public void setMaxStock(long newValue) throws ModelException {
        this.maxStock = newValue;
    }
    public long getCurrentStock()throws ModelException{
        return this.currentStock;
    }
    public void setCurrentStock(long newValue) throws ModelException {
        this.currentStock = newValue;
    }
    public long getProducerDeliveryTime()throws ModelException{
        return this.producerDeliveryTime;
    }
    public void setProducerDeliveryTime(long newValue) throws ModelException {
        this.producerDeliveryTime = newValue;
    }
    public ProducerView getProducer()throws ModelException{
        return this.producer;
    }
    public void setProducer(ProducerView newValue) throws ModelException {
        this.producer = newValue;
    }
    public ArticleStateView getState()throws ModelException{
        return this.state;
    }
    public void setState(ArticleStateView newValue) throws ModelException {
        this.state = newValue;
    }
    public String getCurrentState()throws ModelException{
        return this.currentState;
    }
    public String getProducerName()throws ModelException{
        return this.producerName;
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
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        ProducerView producer = this.getProducer();
        if (producer != null) {
            ((ViewProxi)producer).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(producer.getClassId(), producer.getId())));
        }
        ArticleStateView state = this.getState();
        if (state != null) {
            ((ViewProxi)state).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(state.getClassId(), state.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
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
    public int getNameIndex() throws ModelException {
        return 0;
    }
    public int getPriceIndex() throws ModelException {
        return 0 + 1;
    }
    public int getMinStockIndex() throws ModelException {
        return 0 + 1 + 1;
    }
    public int getMaxStockIndex() throws ModelException {
        return 0 + 1 + 1 + 1;
    }
    public int getCurrentStockIndex() throws ModelException {
        return 0 + 1 + 1 + 1 + 1;
    }
    public int getProducerDeliveryTimeIndex() throws ModelException {
        return 0 + 1 + 1 + 1 + 1 + 1;
    }
    public int getCurrentStateIndex() throws ModelException {
        return 0 + 1 + 1 + 1 + 1 + 1 + 1;
    }
    public int getProducerNameIndex() throws ModelException {
        return 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
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
                if(rowIndex == 0) return "Name";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "Preis";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "Mindestlagerbestand";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "Maximallagerbestand";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "Lagerbestand";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "Herstellerlieferzeit";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "Status";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "Hersteller";
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
        if(rowIndex == 0){
            this.setName(newValue);
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setPrice(common.Fraction.parse(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setMinStock(Long.parseLong(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setMaxStock(Long.parseLong(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setCurrentStock(Long.parseLong(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setProducerDeliveryTime(Long.parseLong(newValue));
            return;
        }
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
