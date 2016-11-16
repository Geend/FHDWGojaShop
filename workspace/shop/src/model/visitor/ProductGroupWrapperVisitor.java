
package model.visitor;

import persistence.*;

public interface ProductGroupWrapperVisitor {
    
    public void handleDefaultProductGroupWrapper(DefaultProductGroupWrapper4Public defaultProductGroupWrapper) throws PersistenceException;
    
}
