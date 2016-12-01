package model.meta;

public interface QuantifiedArticleMssgsVisitor extends QuantifiedArticleDOWNMssgsVisitor, QuantifiedArticleUPMssgsVisitor {}


interface QuantifiedArticleDOWNMssgsVisitor extends OrderQuantifiedArticleDOWNMssgsVisitor, ReOrderQuantifiedArticleDOWNMssgsVisitor, ShoppingCartQuantifiedArticleDOWNMssgsVisitor, ReturnQuantifiedArticleDOWNMssgsVisitor {

    
}


interface QuantifiedArticleUPMssgsVisitor  {

    
}
