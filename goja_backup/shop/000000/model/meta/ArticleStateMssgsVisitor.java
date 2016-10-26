package model.meta;

public interface ArticleStateMssgsVisitor extends ArticleStateDOWNMssgsVisitor, ArticleStateUPMssgsVisitor {}


interface ArticleStateDOWNMssgsVisitor extends RemainingStockDOWNMssgsVisitor, NotInSaleDOWNMssgsVisitor, InSaleDOWNMssgsVisitor, NewCreatedDOWNMssgsVisitor {

    
}


interface ArticleStateUPMssgsVisitor  {

    
}
