
package model.visitor;

import persistence.*;

public abstract class ComponentWrapperDirectVisitor implements ComponentWrapperVisitor {
    
    public abstract void handleProductGroupWrapper(ProductGroupWrapper4Public productGroupWrapper) throws PersistenceException;
    
    public void handleDefaultProductGroupWrapper(DefaultProductGroupWrapper4Public defaultProductGroupWrapper) throws PersistenceException{
        this.handleProductGroupWrapper(defaultProductGroupWrapper);
    }
    public abstract void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException;
    
    public void handleOrderArticleWrapper(OrderArticleWrapper4Public orderArticleWrapper) throws PersistenceException{
        this.handleArticleWrapper(orderArticleWrapper);
    }
    public void handleStandardArticleWrapper(StandardArticleWrapper4Public standardArticleWrapper) throws PersistenceException{
        this.handleArticleWrapper(standardArticleWrapper);
    }
    public void handleCustomerShopArticleWrapper(CustomerShopArticleWrapper4Public customerShopArticleWrapper) throws PersistenceException{
        this.handleArticleWrapper(customerShopArticleWrapper);
    }
    public void handleOwnerArticleWrapper(OwnerArticleWrapper4Public ownerArticleWrapper) throws PersistenceException{
        this.handleArticleWrapper(ownerArticleWrapper);
    }
    public void handleShopArticleWrapper(ShopArticleWrapper4Public shopArticleWrapper) throws PersistenceException{
        this.handleArticleWrapper(shopArticleWrapper);
    }
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapper4Public shoppingCartArticleWrapper) throws PersistenceException{
        this.handleArticleWrapper(shoppingCartArticleWrapper);
    }
    
}
