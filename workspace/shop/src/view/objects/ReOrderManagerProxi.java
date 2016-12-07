package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ReOrderManagerProxi extends ViewProxi implements ReOrderManagerView{
    
    public ReOrderManagerProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public ReOrderManagerView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Vector<String> reorderArticles_string = (java.util.Vector<String>)resultTable.get("reorderArticles");
        java.util.Vector<ReOrderQuantifiedArticleView> reorderArticles = ViewProxi.getProxiVector(reorderArticles_string, connectionKey);
        ViewProxi myCONCBackgroundTask = null;
        String myCONCBackgroundTask$String = (String)resultTable.get("myCONCBackgroundTask");
        if (myCONCBackgroundTask$String != null) {
            common.ProxiInformation myCONCBackgroundTask$Info = common.RPCConstantsAndServices.createProxiInformation(myCONCBackgroundTask$String);
            myCONCBackgroundTask = view.objects.ViewProxi.createProxi(myCONCBackgroundTask$Info,connectionKey);
            myCONCBackgroundTask.setToString(myCONCBackgroundTask$Info.getToString());
        }
        ReOrderManagerView result$$ = new ReOrderManager(reorderArticles,(BackgroundTaskView)myCONCBackgroundTask, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getReorderArticles().size()) return new ReorderArticlesReOrderManagerWrapper(this, originalIndex, (ViewRoot)this.getReorderArticles().get(index));
        index = index - this.getReorderArticles().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getReorderArticles().size());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getReorderArticles().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getReorderArticlesIterator = this.getReorderArticles().iterator();
        while(getReorderArticlesIterator.hasNext()){
            if(getReorderArticlesIterator.next().equals(child)) return result;
            result = result + 1;
        }
        return -1;
    }
    
    public java.util.Vector<ReOrderQuantifiedArticleView> getReorderArticles()throws ModelException{
        return ((ReOrderManager)this.getTheObject()).getReorderArticles();
    }
    public void setReorderArticles(java.util.Vector<ReOrderQuantifiedArticleView> newValue) throws ModelException {
        ((ReOrderManager)this.getTheObject()).setReorderArticles(newValue);
    }
    public BackgroundTaskView getMyCONCBackgroundTask()throws ModelException{
        return ((ReOrderManager)this.getTheObject()).getMyCONCBackgroundTask();
    }
    public void setMyCONCBackgroundTask(BackgroundTaskView newValue) throws ModelException {
        ((ReOrderManager)this.getTheObject()).setMyCONCBackgroundTask(newValue);
    }
    
    public void accept(BackgroundTaskVisitor visitor) throws ModelException {
        visitor.handleReOrderManager(this);
    }
    public <R> R accept(BackgroundTaskReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleReOrderManager(this);
    }
    public <E extends view.UserException>  void accept(BackgroundTaskExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleReOrderManager(this);
    }
    public <R, E extends view.UserException> R accept(BackgroundTaskReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleReOrderManager(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleReOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleReOrderManager(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleReOrderManager(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleReOrderManager(this);
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
