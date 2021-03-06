
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class ArticleWrapper extends view.objects.Component implements ArticleWrapperView{
    
    protected common.Fraction price;
    protected String name;
    
    public ArticleWrapper(ComponentContainer parent,common.Fraction price,String name,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super((ComponentContainer)parent,id, classId);
        this.price = price;
        this.name = name;        
    }
    
    static public long getTypeId() {
        return 242;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public common.Fraction getPrice()throws ModelException{
        return this.price;
    }
    public String getName()throws ModelException{
        return this.name;
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
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        ComponentContainer parent = this.getParent();
        if (parent != null) {
            ((ViewProxi)parent).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(parent.getClassId(), parent.getId())));
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
    public int getPriceIndex() throws ModelException {
        return 0;
    }
    public int getNameIndex() throws ModelException {
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
                if(rowIndex == 0) return "Preis";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "Name";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return this.getPrice();
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return this.getName();
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
