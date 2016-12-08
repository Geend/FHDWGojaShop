
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class CustomerArticleLst extends ViewObject implements CustomerArticleLstView{
    
    protected java.util.Vector<ArticleWrapperView> articles;
    
    public CustomerArticleLst(java.util.Vector<ArticleWrapperView> articles,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.articles = articles;        
    }
    
    static public long getTypeId() {
        return 324;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public java.util.Vector<ArticleWrapperView> getArticles()throws ModelException{
        return this.articles;
    }
    public void setArticles(java.util.Vector<ArticleWrapperView> newValue) throws ModelException {
        this.articles = newValue;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleCustomerArticleLst(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerArticleLst(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerArticleLst(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerArticleLst(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        java.util.Vector<?> articles = this.getArticles();
        if (articles != null) {
            ViewObject.resolveVectorProxies(articles, resultTable);
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getArticles().size()) return new ArticlesCustomerArticleLstWrapper(this, originalIndex, (ViewRoot)this.getArticles().get(index));
        index = index - this.getArticles().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getArticles().size());
    }
    public boolean isLeaf() throws ModelException {
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
    public int getRowCount(){
        return 0 ;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
            } else {
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
        
    }
    public boolean hasTransientFields(){
        return false;
    }
    /* Start of protected part that is not overridden by persistence generator */
    
    public javafx.scene.image.Image getImage() {
        return super.getImage();
    }
    /* End of protected part that is not overridden by persistence generator */
    
    
}
