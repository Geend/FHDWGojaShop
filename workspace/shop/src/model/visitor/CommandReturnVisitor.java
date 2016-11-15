
package model.visitor;

public interface CommandReturnVisitor<R> extends ArticleCommandReturnVisitor<R> ,CustomerRegisterServiceCommandReturnVisitor<R> ,ProducerLstCommandReturnVisitor<R> ,ProductGroupCommandReturnVisitor<R> ,SubComponentCommandReturnVisitor<R> {
    
    
}
