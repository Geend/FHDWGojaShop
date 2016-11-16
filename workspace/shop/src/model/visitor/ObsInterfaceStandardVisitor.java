
package model.visitor;

import persistence.*;

public abstract class ObsInterfaceStandardVisitor implements ObsInterfaceVisitor {
    
    public void handleServiceRootProductGroup(ServiceRootProductGroup4Public serviceRootProductGroup) throws PersistenceException{
        this.standardHandling(serviceRootProductGroup);
    }
    public void handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException{
        this.standardHandling(productGroupComponents);
    }
    protected abstract void standardHandling(ObsInterface obsInterface) throws PersistenceException;
}
