
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class CustomerShopArticleWrapper extends view.objects.ArticleWrapper implements CustomerShopArticleWrapperView{
    
    protected String name;
    protected common.Fraction price;
    
    public CustomerShopArticleWrapper(String name,common.Fraction price,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.name = name;
        this.price = price;        
    }
    
    static public long getTypeId() {
        return 298;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public String getName()throws ModelException{
        return this.name;
    }
    public common.Fraction getPrice()throws ModelException{
        return this.price;
    }
    
    public void accept(ArticleWrapperVisitor visitor) throws ModelException {
        visitor.handleCustomerShopArticleWrapper(this);
    }
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerShopArticleWrapper(this);
    }
    public <E extends view.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerShopArticleWrapper(this);
    }
    public <R, E extends view.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerShopArticleWrapper(this);
    }
    public void accept(ComponentWrapperVisitor visitor) throws ModelException {
        visitor.handleCustomerShopArticleWrapper(this);
    }
    public <R> R accept(ComponentWrapperReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerShopArticleWrapper(this);
    }
    public <E extends view.UserException>  void accept(ComponentWrapperExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerShopArticleWrapper(this);
    }
    public <R, E extends view.UserException> R accept(ComponentWrapperReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerShopArticleWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleCustomerShopArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerShopArticleWrapper(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerShopArticleWrapper(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerShopArticleWrapper(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        
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
    public int getRowCount(){
        return 0 
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
            } else {
                if(rowIndex == 0) return this.getName();
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return this.getPrice();
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
