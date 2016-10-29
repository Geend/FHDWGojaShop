
package model.visitor;

public interface CommandReturnVisitor<R> extends ComponentLstCommandReturnVisitor<R> ,ProducerLstCommandReturnVisitor<R> ,ProductGroupCommandReturnVisitor<R> {
    
    
}
