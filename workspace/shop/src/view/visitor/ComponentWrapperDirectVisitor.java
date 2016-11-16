
package view.visitor;

import view.*;

public abstract class ComponentWrapperDirectVisitor implements ComponentWrapperVisitor {
    
    public abstract void handleProductGroupWrapper(ProductGroupWrapperView productGroupWrapper) throws ModelException;
    
    public void handleDefaultProductGroupWrapper(DefaultProductGroupWrapperView defaultProductGroupWrapper) throws ModelException{
        this.handleProductGroupWrapper(defaultProductGroupWrapper);
    }
    public abstract void handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException;
    
    public void handleOrderArticleWrapper(OrderArticleWrapperView orderArticleWrapper) throws ModelException{
        this.handleArticleWrapper(orderArticleWrapper);
    }
    public void handleStandardArticleWrapper(StandardArticleWrapperView standardArticleWrapper) throws ModelException{
        this.handleArticleWrapper(standardArticleWrapper);
    }
    public void handleCustomerShopArticleWrapper(CustomerShopArticleWrapperView customerShopArticleWrapper) throws ModelException{
        this.handleArticleWrapper(customerShopArticleWrapper);
    }
    public void handleOwnerArticleWrapper(OwnerArticleWrapperView ownerArticleWrapper) throws ModelException{
        this.handleArticleWrapper(ownerArticleWrapper);
    }
    public void handleShopArticleWrapper(ShopArticleWrapperView shopArticleWrapper) throws ModelException{
        this.handleArticleWrapper(shopArticleWrapper);
    }
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapperView shoppingCartArticleWrapper) throws ModelException{
        this.handleArticleWrapper(shoppingCartArticleWrapper);
    }
    
}
