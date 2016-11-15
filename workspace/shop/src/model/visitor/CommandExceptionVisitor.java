
package model.visitor;

public interface CommandExceptionVisitor<E extends model.UserException> extends ArticleCommandExceptionVisitor<E>,CustomerRegisterServiceCommandExceptionVisitor<E>,ProducerLstCommandExceptionVisitor<E>,ProductGroupCommandExceptionVisitor<E>,SubComponentCommandExceptionVisitor<E>{
    
    
}
