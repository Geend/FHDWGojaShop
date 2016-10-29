package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ProducerLstProxi extends ViewProxi implements ProducerLstView{
    
    public ProducerLstProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public ProducerLstView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Vector<String> currentProducer_string = (java.util.Vector<String>)resultTable.get("currentProducer");
        java.util.Vector<ProducerView> currentProducer = ViewProxi.getProxiVector(currentProducer_string, connectionKey);
        ProducerLstView result$$ = new ProducerLst(currentProducer, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getCurrentProducer().size()) return new CurrentProducerProducerLstWrapper(this, originalIndex, (ViewRoot)this.getCurrentProducer().get(index));
        index = index - this.getCurrentProducer().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getCurrentProducer().size());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getCurrentProducer().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getCurrentProducerIterator = this.getCurrentProducer().iterator();
        while(getCurrentProducerIterator.hasNext()){
            if(getCurrentProducerIterator.next().equals(child)) return result;
            result = result + 1;
        }
        return -1;
    }
    
    public java.util.Vector<ProducerView> getCurrentProducer()throws ModelException{
        return ((ProducerLst)this.getTheObject()).getCurrentProducer();
    }
    public void setCurrentProducer(java.util.Vector<ProducerView> newValue) throws ModelException {
        ((ProducerLst)this.getTheObject()).setCurrentProducer(newValue);
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleProducerLst(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleProducerLst(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleProducerLst(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleProducerLst(this);
    }
    
    public boolean hasTransientFields(){
        return false;
    }
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    private final int RemoteDepth = 1;
    
    /* End of protected part that is not overridden by persistence generator */
    
}
