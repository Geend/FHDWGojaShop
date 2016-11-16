
package model.visitor;

import persistence.*;

public abstract class CompHierarchyHIERARCHYDirectVisitor implements CompHierarchyHIERARCHYVisitor {
    
    public abstract void handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException;
    
    public abstract void handleComponent(Component4Public component) throws PersistenceException;
    
    public void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException{
        this.handleComponent(rootProductGroup);
    }
    public void handleArticle(Article4Public article) throws PersistenceException{
        this.handleComponent(article);
    }
    public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException{
        this.handleComponent(subProductGroup);
    }
    public abstract void handleComponentWrapper(ComponentWrapper4Public componentWrapper) throws PersistenceException;
    
    public void handleOrderArticleWrapper(OrderArticleWrapper4Public orderArticleWrapper) throws PersistenceException{
        this.handleComponentWrapper(orderArticleWrapper);
    }
    public void handleStandardArticleWrapper(StandardArticleWrapper4Public standardArticleWrapper) throws PersistenceException{
        this.handleComponentWrapper(standardArticleWrapper);
    }
    public void handleDefaultProductGroupWrapper(DefaultProductGroupWrapper4Public defaultProductGroupWrapper) throws PersistenceException{
        this.handleComponentWrapper(defaultProductGroupWrapper);
    }
    public void handleCustomerShopArticleWrapper(CustomerShopArticleWrapper4Public customerShopArticleWrapper) throws PersistenceException{
        this.handleComponentWrapper(customerShopArticleWrapper);
    }
    public void handleOwnerArticleWrapper(OwnerArticleWrapper4Public ownerArticleWrapper) throws PersistenceException{
        this.handleComponentWrapper(ownerArticleWrapper);
    }
    public void handleShopArticleWrapper(ShopArticleWrapper4Public shopArticleWrapper) throws PersistenceException{
        this.handleComponentWrapper(shopArticleWrapper);
    }
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapper4Public shoppingCartArticleWrapper) throws PersistenceException{
        this.handleComponentWrapper(shoppingCartArticleWrapper);
    }
    
}
