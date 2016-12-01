
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class ReOrderManager extends ViewObject implements ReOrderManagerView{
    
    protected java.util.Vector<ReOrderQuantifiedArticleView> reorderArticles;
    
    public ReOrderManager(java.util.Vector<ReOrderQuantifiedArticleView> reorderArticles,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.reorderArticles = reorderArticles;        
    }
    
    static public long getTypeId() {
        return 327;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public java.util.Vector<ReOrderQuantifiedArticleView> getReorderArticles()throws ModelException{
        return this.reorderArticles;
    }
    public void setReorderArticles(java.util.Vector<ReOrderQuantifiedArticleView> newValue) throws ModelException {
        this.reorderArticles = newValue;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleReOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleReOrderManager(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleReOrderManager(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleReOrderManager(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        java.util.Vector<?> reorderArticles = this.getReorderArticles();
        if (reorderArticles != null) {
            ViewObject.resolveVectorProxies(reorderArticles, resultTable);
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getReorderArticles().size()) return new ReorderArticlesReOrderManagerWrapper(this, originalIndex, (ViewRoot)this.getReorderArticles().get(index));
        index = index - this.getReorderArticles().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getReorderArticles().size());
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getReorderArticles().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getReorderArticlesIterator = this.getReorderArticles().iterator();
        while(getReorderArticlesIterator.hasNext()){
            if(getReorderArticlesIterator.next().equals(child)) return result;
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
