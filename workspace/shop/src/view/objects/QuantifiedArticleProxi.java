package view.objects;

import view.*;
import viewClient.*;

public abstract class QuantifiedArticleProxi extends ViewProxi implements QuantifiedArticleView{
    
    public QuantifiedArticleProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    
    public long getQuantity()throws ModelException{
        return ((QuantifiedArticle)this.getTheObject()).getQuantity();
    }
    public void setQuantity(long newValue) throws ModelException {
        ((QuantifiedArticle)this.getTheObject()).setQuantity(newValue);
    }
    public ArticleWrapperView getArticle()throws ModelException{
        return ((QuantifiedArticle)this.getTheObject()).getArticle();
    }
    public void setArticle(ArticleWrapperView newValue) throws ModelException {
        ((QuantifiedArticle)this.getTheObject()).setArticle(newValue);
    }
    
    
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
