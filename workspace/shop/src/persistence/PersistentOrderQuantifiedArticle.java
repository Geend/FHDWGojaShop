package persistence;


public interface PersistentOrderQuantifiedArticle extends PersistentQuantifiedArticle, OrderQuantifiedArticle4Public {
    
    public common.Fraction getArticlePriceAtOrderTime() throws PersistenceException ;
    public void setArticlePriceAtOrderTime(common.Fraction newValue) throws PersistenceException ;
    public PersistentOrderQuantifiedArticle getThis() throws PersistenceException ;
    
    

}

