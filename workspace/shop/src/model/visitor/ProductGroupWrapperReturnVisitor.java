
package model.visitor;

import persistence.*;

public interface ProductGroupWrapperReturnVisitor<R> {
    
    public R handleDefaultProductGroupWrapper(DefaultProductGroupWrapper4Public defaultProductGroupWrapper) throws PersistenceException;
    
}
