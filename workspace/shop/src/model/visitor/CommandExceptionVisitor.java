
package model.visitor;

public interface CommandExceptionVisitor<E extends model.UserException> extends ArticleCommandExceptionVisitor<E>,ProducerLstCommandExceptionVisitor<E>,ProductGroupCommandExceptionVisitor<E>,SubComponentCommandExceptionVisitor<E>{
    
    
}
