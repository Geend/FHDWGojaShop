package persistence;


public interface PersistentOrderArticleWrapper extends PersistentArticleWrapper, OrderArticleWrapper4Public {
    
    public common.Fraction getPriceAtOrder() throws PersistenceException ;
    public void setPriceAtOrder(common.Fraction newValue) throws PersistenceException ;
    public PersistentOrderArticleWrapper getThis() throws PersistenceException ;
    
    

}

