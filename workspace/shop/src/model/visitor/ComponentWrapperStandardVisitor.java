
package model.visitor;

import persistence.*;

public abstract class ComponentWrapperStandardVisitor implements ComponentWrapperVisitor {
    
    public void handleOrderArticleWrapper(OrderArticleWrapper4Public orderArticleWrapper) throws PersistenceException{
        this.standardHandling(orderArticleWrapper);
    }
    public void handleStandardArticleWrapper(StandardArticleWrapper4Public standardArticleWrapper) throws PersistenceException{
        this.standardHandling(standardArticleWrapper);
    }
    public void handleDefaultProductGroupWrapper(DefaultProductGroupWrapper4Public defaultProductGroupWrapper) throws PersistenceException{
        this.standardHandling(defaultProductGroupWrapper);
    }
    public void handleCustomerShopArticleWrapper(CustomerShopArticleWrapper4Public customerShopArticleWrapper) throws PersistenceException{
        this.standardHandling(customerShopArticleWrapper);
    }
    public void handleOwnerArticleWrapper(OwnerArticleWrapper4Public ownerArticleWrapper) throws PersistenceException{
        this.standardHandling(ownerArticleWrapper);
    }
    public void handleShopArticleWrapper(ShopArticleWrapper4Public shopArticleWrapper) throws PersistenceException{
        this.standardHandling(shopArticleWrapper);
    }
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapper4Public shoppingCartArticleWrapper) throws PersistenceException{
        this.standardHandling(shoppingCartArticleWrapper);
    }
    protected abstract void standardHandling(ComponentWrapper4Public componentWrapper) throws PersistenceException;
}
