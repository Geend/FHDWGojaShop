
package model.visitor;

public interface CommandExceptionVisitor<E extends model.UserException> extends CustomerRegisterServiceCommandExceptionVisitor<E>,OwnerArticleWrapperCommandExceptionVisitor<E>,ProducerLstCommandExceptionVisitor<E>,ProductGroupCommandExceptionVisitor<E>,SubComponentCommandExceptionVisitor<E>{
    
    
}
