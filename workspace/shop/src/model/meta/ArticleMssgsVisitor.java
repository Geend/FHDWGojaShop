package model.meta;

public interface ArticleMssgsVisitor extends ArticleDOWNMssgsVisitor, ArticleUPMssgsVisitor {}


interface ArticleDOWNMssgsVisitor  {

    
}


interface ArticleUPMssgsVisitor extends ComponentUPMssgsVisitor, SubComponentUPMssgsVisitor {

    
}
