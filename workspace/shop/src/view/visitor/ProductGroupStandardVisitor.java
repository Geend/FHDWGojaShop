
package view.visitor;

import view.*;

public abstract class ProductGroupStandardVisitor implements ProductGroupVisitor {
    
    public void handleRootProductGroup(RootProductGroupView rootProductGroup) throws ModelException{
        this.standardHandling(rootProductGroup);
    }
    public void handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException{
        this.standardHandling(subProductGroup);
    }
    protected abstract void standardHandling(ProductGroupView productGroup) throws ModelException;
}
