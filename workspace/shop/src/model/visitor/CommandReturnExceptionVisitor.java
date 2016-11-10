
package model.visitor;

public interface CommandReturnExceptionVisitor<R, E extends model.UserException> extends ProducerLstCommandReturnExceptionVisitor<R, E> ,ProductGroupCommandReturnExceptionVisitor<R, E> ,SubComponentCommandReturnExceptionVisitor<R, E> {
    
    
}
