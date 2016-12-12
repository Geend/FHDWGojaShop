
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class Settings extends ViewObject implements SettingsView{
    
    protected common.Fraction newCustomerDefaultBalance;
    protected common.Fraction newCustomerDefaultLimit;
    protected common.Fraction returnPercentage;
    
    public Settings(common.Fraction newCustomerDefaultBalance,common.Fraction newCustomerDefaultLimit,common.Fraction returnPercentage,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.newCustomerDefaultBalance = newCustomerDefaultBalance;
        this.newCustomerDefaultLimit = newCustomerDefaultLimit;
        this.returnPercentage = returnPercentage;        
    }
    
    static public long getTypeId() {
        return 318;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public common.Fraction getNewCustomerDefaultBalance()throws ModelException{
        return this.newCustomerDefaultBalance;
    }
    public void setNewCustomerDefaultBalance(common.Fraction newValue) throws ModelException {
        this.newCustomerDefaultBalance = newValue;
    }
    public common.Fraction getNewCustomerDefaultLimit()throws ModelException{
        return this.newCustomerDefaultLimit;
    }
    public void setNewCustomerDefaultLimit(common.Fraction newValue) throws ModelException {
        this.newCustomerDefaultLimit = newValue;
    }
    public common.Fraction getReturnPercentage()throws ModelException{
        return this.returnPercentage;
    }
    public void setReturnPercentage(common.Fraction newValue) throws ModelException {
        this.returnPercentage = newValue;
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
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        
    }
    public void sortSetValuedFields() throws ModelException {
        
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
    public int getNewCustomerDefaultBalanceIndex() throws ModelException {
        return 0;
    }
    public int getNewCustomerDefaultLimitIndex() throws ModelException {
        return 0 + 1;
    }
    public int getReturnPercentageIndex() throws ModelException {
        return 0 + 1 + 1;
    }
    public int getRowCount(){
        return 0 
            + 1
            + 1
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "Neukunden Startguthaben";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "Neukunden Limit";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "Retouren Prozentsatz";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return this.getNewCustomerDefaultBalance();
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return this.getNewCustomerDefaultLimit();
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return this.getReturnPercentage();
                rowIndex = rowIndex - 1;
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
        if(rowIndex == 0){
            this.setNewCustomerDefaultBalance(common.Fraction.parse(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setNewCustomerDefaultLimit(common.Fraction.parse(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setReturnPercentage(common.Fraction.parse(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
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
