
package model.visitor;

public interface CommandReturnVisitor<R> extends ProducerLstCommandReturnVisitor<R> ,ProductGroupCommandReturnVisitor<R> ,SubComponentCommandReturnVisitor<R> {
    
    
}
