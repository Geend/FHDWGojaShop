package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class SubProductGroupProxi extends ProductGroupProxi implements SubProductGroupView{
    
    public SubProductGroupProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public SubProductGroupView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        String name = (String)resultTable.get("name");
        java.util.Vector<String> components_string = (java.util.Vector<String>)resultTable.get("components");
        java.util.Vector<ComponentView> components = ViewProxi.getProxiVector(components_string, connectionKey);
        ViewProxi parent = null;
        String parent$String = (String)resultTable.get("parent");
        if (parent$String != null) {
            common.ProxiInformation parent$Info = common.RPCConstantsAndServices.createProxiInformation(parent$String);
            parent = view.objects.ViewProxi.createProxi(parent$Info,connectionKey);
            parent.setToString(parent$Info.getToString());
        }
        SubProductGroupView result$$ = new SubProductGroup((String)name,components,(ProductGroupView)parent, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getComponents().size()) return new ComponentsProductGroupWrapper(this, originalIndex, (ViewRoot)this.getComponents().get(index));
        index = index - this.getComponents().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getComponents().size());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getComponents().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getComponentsIterator = this.getComponents().iterator();
        while(getComponentsIterator.hasNext()){
            if(getComponentsIterator.next().equals(child)) return result;
            result = result + 1;
        }
        return -1;
    }
    
    public ProductGroupView getParent()throws ModelException{
        return ((SubProductGroup)this.getTheObject()).getParent();
    }
    public void setParent(ProductGroupView newValue) throws ModelException {
        ((SubProductGroup)this.getTheObject()).setParent(newValue);
    }
    
    public void accept(ProductGroupVisitor visitor) throws ModelException {
        visitor.handleSubProductGroup(this);
    }
    public <R> R accept(ProductGroupReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleSubProductGroup(this);
    }
    public <E extends view.UserException>  void accept(ProductGroupExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleSubProductGroup(this);
    }
    public <R, E extends view.UserException> R accept(ProductGroupReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleSubProductGroup(this);
    }
    public void accept(ComponentVisitor visitor) throws ModelException {
        visitor.handleSubProductGroup(this);
    }
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleSubProductGroup(this);
    }
    public <E extends view.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleSubProductGroup(this);
    }
    public <R, E extends view.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleSubProductGroup(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleSubProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleSubProductGroup(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleSubProductGroup(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleSubProductGroup(this);
    }
    public void accept(SubComponentVisitor visitor) throws ModelException {
        visitor.handleSubProductGroup(this);
    }
    public <R> R accept(SubComponentReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleSubProductGroup(this);
    }
    public <E extends view.UserException>  void accept(SubComponentExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleSubProductGroup(this);
    }
    public <R, E extends view.UserException> R accept(SubComponentReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleSubProductGroup(this);
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
