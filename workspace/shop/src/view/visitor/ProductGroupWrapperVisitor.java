
package view.visitor;

import view.*;

public interface ProductGroupWrapperVisitor {
    
    public void handleDefaultProductGroupWrapper(DefaultProductGroupWrapperView defaultProductGroupWrapper) throws ModelException;
    
}
