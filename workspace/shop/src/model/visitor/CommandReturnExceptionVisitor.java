
package model.visitor;

public interface CommandReturnExceptionVisitor<R, E extends model.UserException> extends ComponentLstCommandReturnExceptionVisitor<R, E> ,ProducerLstCommandReturnExceptionVisitor<R, E> ,ProductGroupCommandReturnExceptionVisitor<R, E> {
    
    
}
