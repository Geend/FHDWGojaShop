
package view.visitor;

import view.*;

public interface ProductGroupVisitor {
    
    public void handleRootProductGroup(RootProductGroupView rootProductGroup) throws ModelException;
    public void handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException;
    
}
