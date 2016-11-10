
package view.visitor;

import view.*;

public interface AnythingVisitor extends ArticleStateVisitor,ComponentVisitor{
    
    public void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException;
    public void handleProducer(ProducerView producer) throws ModelException;
    public void handleProducerLst(ProducerLstView producerLst) throws ModelException;
    public void handleServer(ServerView server) throws ModelException;
    
}
