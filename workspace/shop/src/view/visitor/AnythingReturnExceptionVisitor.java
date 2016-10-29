
package view.visitor;

import view.*;

public interface AnythingReturnExceptionVisitor<R, E extends view.UserException> extends ArticleStateReturnExceptionVisitor<R, E> ,ComponentReturnExceptionVisitor<R, E> {
    
    public R handleComponentLst(ComponentLstView componentLst) throws ModelException, E;
    public R handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException, E;
    public R handleProducer(ProducerView producer) throws ModelException, E;
    public R handleProducerLst(ProducerLstView producerLst) throws ModelException, E;
    public R handleServer(ServerView server) throws ModelException, E;
    
}
