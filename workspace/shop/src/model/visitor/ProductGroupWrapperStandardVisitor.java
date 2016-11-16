
package model.visitor;

import persistence.*;

public abstract class ProductGroupWrapperStandardVisitor implements ProductGroupWrapperVisitor {
    
    public void handleDefaultProductGroupWrapper(DefaultProductGroupWrapper4Public defaultProductGroupWrapper) throws PersistenceException{
        this.standardHandling(defaultProductGroupWrapper);
    }
    protected abstract void standardHandling(ProductGroupWrapper4Public productGroupWrapper) throws PersistenceException;
}
