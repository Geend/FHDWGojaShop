
package view.visitor;

import view.*;

public interface ProductGroupReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleRootProductGroup(RootProductGroupView rootProductGroup) throws ModelException, E;
    public R handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException, E;
    
}
