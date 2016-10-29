
package view.visitor;

import view.*;

public interface AnythingExceptionVisitor<E extends view.UserException> extends ArticleStateExceptionVisitor<E>,ComponentExceptionVisitor<E>{
    
    public void handleComponentLst(ComponentLstView componentLst) throws ModelException, E;
    public void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException, E;
    public void handleProducer(ProducerView producer) throws ModelException, E;
    public void handleProducerLst(ProducerLstView producerLst) throws ModelException, E;
    public void handleServer(ServerView server) throws ModelException, E;
    
}
