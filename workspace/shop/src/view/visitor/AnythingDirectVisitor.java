
package view.visitor;

import view.*;

public abstract class AnythingDirectVisitor implements AnythingVisitor {
    
    public abstract void handleProducerLst(ProducerLstView producerLst) throws ModelException;
    
    public abstract void handleServer(ServerView server) throws ModelException;
    
    public abstract void handleProducer(ProducerView producer) throws ModelException;
    
    public abstract void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException;
    
    public abstract void handleArticleState(ArticleStateView articleState) throws ModelException;
    
    public void handleRemainingStock(RemainingStockView remainingStock) throws ModelException{
        this.handleArticleState(remainingStock);
    }
    public void handleNotInSale(NotInSaleView notInSale) throws ModelException{
        this.handleArticleState(notInSale);
    }
    public void handleInSale(InSaleView inSale) throws ModelException{
        this.handleArticleState(inSale);
    }
    public void handleNewCreated(NewCreatedView newCreated) throws ModelException{
        this.handleArticleState(newCreated);
    }
    public abstract void handleComponent(ComponentView component) throws ModelException;
    
    public void handleRootProductGroup(RootProductGroupView rootProductGroup) throws ModelException{
        this.handleComponent(rootProductGroup);
    }
    public void handleArticle(ArticleView article) throws ModelException{
        this.handleComponent(article);
    }
    public void handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException{
        this.handleComponent(subProductGroup);
    }
    
}
