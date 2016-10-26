package view.objects;

import view.*;
import viewClient.*;

public abstract class ArticleWrapperProxi extends ViewProxi implements ArticleWrapperView{
    
    public ArticleWrapperProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    
    public ArticleView getArticle()throws ModelException{
        return ((ArticleWrapper)this.getTheObject()).getArticle();
    }
    public void setArticle(ArticleView newValue) throws ModelException {
        ((ArticleWrapper)this.getTheObject()).setArticle(newValue);
    }
    public String getName()throws ModelException{
        return ((ArticleWrapper)this.getTheObject()).getName();
    }
    
    
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
