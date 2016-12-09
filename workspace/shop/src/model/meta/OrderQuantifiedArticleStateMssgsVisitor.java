package model.meta;

public interface OrderQuantifiedArticleStateMssgsVisitor extends OrderQuantifiedArticleStateDOWNMssgsVisitor, OrderQuantifiedArticleStateUPMssgsVisitor {}


interface OrderQuantifiedArticleStateDOWNMssgsVisitor extends OrderQuantifiedArticleNormalStateDOWNMssgsVisitor, OrderQuantifiedArticleMarkedForReturnStateDOWNMssgsVisitor, OrderQuantifiedArticlePreOrderDOWNMssgsVisitor {

    
}


interface OrderQuantifiedArticleStateUPMssgsVisitor  {

    
}
