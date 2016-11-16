
package view.visitor;

import view.*;

public abstract class ProductGroupWrapperStandardVisitor implements ProductGroupWrapperVisitor {
    
    public void handleDefaultProductGroupWrapper(DefaultProductGroupWrapperView defaultProductGroupWrapper) throws ModelException{
        this.standardHandling(defaultProductGroupWrapper);
    }
    protected abstract void standardHandling(ProductGroupWrapperView productGroupWrapper) throws ModelException;
}
