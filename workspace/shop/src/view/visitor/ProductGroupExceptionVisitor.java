
package view.visitor;

import view.*;

public interface ProductGroupExceptionVisitor<E extends view.UserException> {
    
    public void handleRootProductGroup(RootProductGroupView rootProductGroup) throws ModelException, E;
    public void handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException, E;
    
}
