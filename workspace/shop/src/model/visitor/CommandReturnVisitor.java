
package model.visitor;

public interface CommandReturnVisitor<R> extends CustomerRegisterServiceCommandReturnVisitor<R> ,OwnerArticleWrapperCommandReturnVisitor<R> ,ProducerLstCommandReturnVisitor<R> ,ProductGroupCommandReturnVisitor<R> ,SubComponentCommandReturnVisitor<R> {
    
    
}
