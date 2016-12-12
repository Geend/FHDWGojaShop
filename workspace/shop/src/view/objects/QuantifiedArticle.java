
package view.objects;

import view.*;


/* Additional import section end */

public abstract class QuantifiedArticle extends ViewObject implements QuantifiedArticleView{
    
    protected long quantity;
    protected ArticleWrapperView article;
    
    public QuantifiedArticle(long quantity,ArticleWrapperView article,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.quantity = quantity;
        this.article = article;        
    }
    
    public long getQuantity()throws ModelException{
        return this.quantity;
    }
    public void setQuantity(long newValue) throws ModelException {
        this.quantity = newValue;
    }
    public ArticleWrapperView getArticle()throws ModelException{
        return this.article;
    }
    public void setArticle(ArticleWrapperView newValue) throws ModelException {
        this.article = newValue;
    }
    
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        ArticleWrapperView article = this.getArticle();
        if (article != null) {
            ((ViewProxi)article).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(article.getClassId(), article.getId())));
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
    public int getQuantityIndex() throws ModelException {
        return 0;
    }
    public int getRowCount(){
        return 0 
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "Anzahl";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return new Long(getQuantity());
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
            this.setQuantity(Long.parseLong(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
    }
    /* Start of protected part that is not overridden by persistence generator */
    
    public javafx.scene.image.Image getImage() {
        return super.getImage();
    }
    /* End of protected part that is not overridden by persistence generator */
    
    
}
