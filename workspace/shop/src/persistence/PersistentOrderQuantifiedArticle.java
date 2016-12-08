package persistence;


public interface PersistentOrderQuantifiedArticle extends PersistentQuantifiedArticle, OrderQuantifiedArticle4Public {
    
    public void setArticlePriceAtOrderTime(common.Fraction newValue) throws PersistenceException ;
    public void setState(OrderQuantifiedArticleState4Public newValue) throws PersistenceException ;
    public PersistentOrderQuantifiedArticle getThis() throws PersistenceException ;
    
    

}

