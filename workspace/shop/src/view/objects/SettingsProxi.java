package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class SettingsProxi extends ViewProxi implements SettingsView{
    
    public SettingsProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public SettingsView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        common.Fraction newCustomerDefaultBalance = common.Fraction.parse((String)resultTable.get("newCustomerDefaultBalance"));
        common.Fraction newCustomerDefaultLimit = common.Fraction.parse((String)resultTable.get("newCustomerDefaultLimit"));
        common.Fraction returnPercentage = common.Fraction.parse((String)resultTable.get("returnPercentage"));
        SettingsView result$$ = new Settings((common.Fraction)newCustomerDefaultBalance,(common.Fraction)newCustomerDefaultLimit,(common.Fraction)returnPercentage, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 ;
    }
    public boolean isLeaf() throws ModelException {
        return true;
    }
    public int getIndexOfChild(Object child) throws ModelException {
        
        return -1;
    }
    
    public common.Fraction getNewCustomerDefaultBalance()throws ModelException{
        return ((Settings)this.getTheObject()).getNewCustomerDefaultBalance();
    }
    public void setNewCustomerDefaultBalance(common.Fraction newValue) throws ModelException {
        ((Settings)this.getTheObject()).setNewCustomerDefaultBalance(newValue);
    }
    public common.Fraction getNewCustomerDefaultLimit()throws ModelException{
        return ((Settings)this.getTheObject()).getNewCustomerDefaultLimit();
    }
    public void setNewCustomerDefaultLimit(common.Fraction newValue) throws ModelException {
        ((Settings)this.getTheObject()).setNewCustomerDefaultLimit(newValue);
    }
    public common.Fraction getReturnPercentage()throws ModelException{
        return ((Settings)this.getTheObject()).getReturnPercentage();
    }
    public void setReturnPercentage(common.Fraction newValue) throws ModelException {
        ((Settings)this.getTheObject()).setReturnPercentage(newValue);
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleSettings(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleSettings(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleSettings(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleSettings(this);
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
