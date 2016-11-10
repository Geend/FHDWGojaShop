
package model.visitor;

public interface CommandExceptionVisitor<E extends model.UserException> extends ProducerLstCommandExceptionVisitor<E>,ProductGroupCommandExceptionVisitor<E>,SubComponentCommandExceptionVisitor<E>{
    
    
}
