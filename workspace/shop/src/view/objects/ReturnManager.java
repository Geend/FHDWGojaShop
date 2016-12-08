
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class ReturnManager extends ViewObject implements ReturnManagerView{
    
    protected java.util.Vector<ArticleReturnView> articleReturn;
    
    public ReturnManager(java.util.Vector<ArticleReturnView> articleReturn,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.articleReturn = articleReturn;        
    }
    
    static public long getTypeId() {
        return 351;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public java.util.Vector<ArticleReturnView> getArticleReturn()throws ModelException{
        return this.articleReturn;
    }
    public void setArticleReturn(java.util.Vector<ArticleReturnView> newValue) throws ModelException {
        this.articleReturn = newValue;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleReturnManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleReturnManager(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleReturnManager(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleReturnManager(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        java.util.Vector<?> articleReturn = this.getArticleReturn();
        if (articleReturn != null) {
            ViewObject.resolveVectorProxies(articleReturn, resultTable);
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getArticleReturn().size()) return new ArticleReturnReturnManagerWrapper(this, originalIndex, (ViewRoot)this.getArticleReturn().get(index));
        index = index - this.getArticleReturn().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getArticleReturn().size());
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getArticleReturn().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getArticleReturnIterator = this.getArticleReturn().iterator();
        while(getArticleReturnIterator.hasNext()){
            if(getArticleReturnIterator.next().equals(child)) return result;
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
