
package view.objects;

import view.*;
import viewClient.*;
import view.visitor.*;


/* Additional import section end */

public class OwnerService extends view.objects.Service implements OwnerServiceView{
    
    protected ProducerLstView prmanager;
    
    public OwnerService(RootProductGroupView rootProductGroup,java.util.Vector<ErrorDisplayView> errors,ProducerLstView prmanager,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super((RootProductGroupView)rootProductGroup,errors,id, classId);
        this.prmanager = prmanager;        
    }
    
    static public long getTypeId() {
        return -276;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public ProducerLstView getPrmanager()throws ModelException{
        return this.prmanager;
    }
    public void setPrmanager(ProducerLstView newValue) throws ModelException {
        this.prmanager = newValue;
    }
    
    public void accept(ServiceVisitor visitor) throws ModelException {
        visitor.handleOwnerService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOwnerService(this);
    }
    public <E extends view.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOwnerService(this);
    }
    public <R, E extends view.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOwnerService(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleOwnerService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOwnerService(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOwnerService(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOwnerService(this);
    }
    public void accept(RemoteVisitor visitor) throws ModelException {
        visitor.handleOwnerService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOwnerService(this);
    }
    public <E extends view.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOwnerService(this);
    }
    public <R, E extends view.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOwnerService(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        RootProductGroupView rootProductGroup = this.getRootProductGroup();
        if (rootProductGroup != null) {
            ((ViewProxi)rootProductGroup).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(rootProductGroup.getClassId(), rootProductGroup.getId())));
        }
        java.util.Vector<?> errors = this.getErrors();
        if (errors != null) {
            ViewObject.resolveVectorProxies(errors, resultTable);
        }
        ProducerLstView prmanager = this.getPrmanager();
        if (prmanager != null) {
            ((ViewProxi)prmanager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(prmanager.getClassId(), prmanager.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getRootProductGroup() != null) return new RootProductGroupServiceWrapper(this, originalIndex, (ViewRoot)this.getRootProductGroup());
        if(this.getRootProductGroup() != null) index = index - 1;
        if(index == 0 && this.getPrmanager() != null) return new PrmanagerOwnerServiceWrapper(this, originalIndex, (ViewRoot)this.getPrmanager());
        if(this.getPrmanager() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getRootProductGroup() == null ? 0 : 1)
            + (this.getPrmanager() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getRootProductGroup() == null ? true : false)
            && (this.getPrmanager() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getRootProductGroup() != null && this.getRootProductGroup().equals(child)) return result;
        if(this.getRootProductGroup() != null) result = result + 1;
        if(this.getPrmanager() != null && this.getPrmanager().equals(child)) return result;
        if(this.getPrmanager() != null) result = result + 1;
        return -1;
    }
    public int getRowCount(){
        return 0 ;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
            } else {
            }
            throw new ModelException("Table index out of bounds!", -1);
        } catch (ModelException e){
            return e.getMessage();
        }
    }
    
    public boolean isRowEditable(int index){
        return true;
    }
    public void setValueAt(String newValue, int rowIndex) throws Exception {
        
    }
    public OwnerServiceConnection connectOwnerService(ConnectionMaster master, final ExceptionAndEventHandler handler) throws ModelException{
        OwnerServiceConnection result;
		try {
			result = (OwnerServiceConnection) new OwnerServiceConnection(master.getUrlString(), master.getHandler(), master.getReporter()).fork(master, this);
		} catch (java.net.MalformedURLException e) {
			throw new ModelException(e.getMessage(),0);
		}
		result.setHandler(handler);
		ConnectionIndex.getTheConnectionIndex().setConnection(handler,result);
		handler.setConnection(result);
		handler.initializeConnection();
		return result;
    }
    
    public boolean hasTransientFields(){
        return false;
    }
    /* Start of protected part that is not overridden by persistence generator */
    
    public javafx.scene.image.Image getImage() {
        return super.getImage();
    }
    /* End of protected part that is not overridden by persistence generator */
    
    
}
