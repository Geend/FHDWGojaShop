package model.meta;

public interface ArticleStateMssgsVisitor extends ArticleStateDOWNMssgsVisitor, ArticleStateUPMssgsVisitor {}


interface ArticleStateDOWNMssgsVisitor extends RemainingStockDOWNMssgsVisitor, NotInSaleDOWNMssgsVisitor, NewCreatedDOWNMssgsVisitor, InSaleDOWNMssgsVisitor {

    
}


interface ArticleStateUPMssgsVisitor  {

    
}
