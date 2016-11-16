
package model.visitor;

import persistence.*;

public abstract class CompHierarchyHIERARCHYStandardVisitor implements CompHierarchyHIERARCHYVisitor {
    
    public void handleOrderArticleWrapper(OrderArticleWrapper4Public orderArticleWrapper) throws PersistenceException{
        this.standardHandling(orderArticleWrapper);
    }
    public void handleStandardArticleWrapper(StandardArticleWrapper4Public standardArticleWrapper) throws PersistenceException{
        this.standardHandling(standardArticleWrapper);
    }
    public void handleDefaultProductGroupWrapper(DefaultProductGroupWrapper4Public defaultProductGroupWrapper) throws PersistenceException{
        this.standardHandling(defaultProductGroupWrapper);
    }
    public void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException{
        this.standardHandling(rootProductGroup);
    }
    public void handleArticle(Article4Public article) throws PersistenceException{
        this.standardHandling(article);
    }
    public void handleCustomerShopArticleWrapper(CustomerShopArticleWrapper4Public customerShopArticleWrapper) throws PersistenceException{
        this.standardHandling(customerShopArticleWrapper);
    }
    public void handleOwnerArticleWrapper(OwnerArticleWrapper4Public ownerArticleWrapper) throws PersistenceException{
        this.standardHandling(ownerArticleWrapper);
    }
    public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException{
        this.standardHandling(subProductGroup);
    }
    public void handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException{
        this.standardHandling(productGroupComponents);
    }
    public void handleShopArticleWrapper(ShopArticleWrapper4Public shopArticleWrapper) throws PersistenceException{
        this.standardHandling(shopArticleWrapper);
    }
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapper4Public shoppingCartArticleWrapper) throws PersistenceException{
        this.standardHandling(shoppingCartArticleWrapper);
    }
    protected abstract void standardHandling(CompHierarchyHIERARCHY compHierarchyHIERARCHY) throws PersistenceException;
}
