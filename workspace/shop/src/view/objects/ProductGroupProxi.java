package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ProductGroupProxi extends ComponentProxi implements ProductGroupView{
    
    public ProductGroupProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public ProductGroupView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        ViewProxi parent = null;
        String parent$String = (String)resultTable.get("parent");
        if (parent$String != null) {
            common.ProxiInformation parent$Info = common.RPCConstantsAndServices.createProxiInformation(parent$String);
            parent = view.objects.ViewProxi.createProxi(parent$Info,connectionKey);
            parent.setToString(parent$Info.getToString());
        }
        java.util.Vector<String> components_string = (java.util.Vector<String>)resultTable.get("components");
        java.util.Vector<ComponentView> components = ViewProxi.getProxiVector(components_string, connectionKey);
        String name = (String)resultTable.get("name");
        ProductGroupView result$$ = new ProductGroup((ComponentContainer)parent,components,(String)name, this.getId(), this.getClassId());
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
    
    public java.util.Vector<ComponentView> getComponents()throws ModelException{
        return ((ProductGroup)this.getTheObject()).getComponents();
    }
    public void setComponents(java.util.Vector<ComponentView> newValue) throws ModelException {
        ((ProductGroup)this.getTheObject()).setComponents(newValue);
    }
    public String getName()throws ModelException{
        return ((ProductGroup)this.getTheObject()).getName();
    }
    public void setName(String newValue) throws ModelException {
        ((ProductGroup)this.getTheObject()).setName(newValue);
    }
    
    public void accept(ComponentVisitor visitor) throws ModelException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleProductGroup(this);
    }
    public <E extends view.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends view.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleProductGroup(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleProductGroup(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleProductGroup(this);
    }
    public void accept(ComponentContainerVisitor visitor) throws ModelException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(ComponentContainerReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleProductGroup(this);
    }
    public <E extends view.UserException>  void accept(ComponentContainerExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends view.UserException> R accept(ComponentContainerReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleProductGroup(this);
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
