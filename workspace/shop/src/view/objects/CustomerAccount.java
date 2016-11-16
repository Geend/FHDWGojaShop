
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class CustomerAccount extends ViewObject implements CustomerAccountView{
    
    protected common.Fraction balance;
    protected long limit;
    protected ShoppingCartView shoppingCart;
    
    public CustomerAccount(common.Fraction balance,long limit,ShoppingCartView shoppingCart,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.balance = balance;
        this.limit = limit;
        this.shoppingCart = shoppingCart;        
    }
    
    static public long getTypeId() {
        return 239;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public common.Fraction getBalance()throws ModelException{
        return this.balance;
    }
    public void setBalance(common.Fraction newValue) throws ModelException {
        this.balance = newValue;
    }
    public long getLimit()throws ModelException{
        return this.limit;
    }
    public void setLimit(long newValue) throws ModelException {
        this.limit = newValue;
    }
    public ShoppingCartView getShoppingCart()throws ModelException{
        return this.shoppingCart;
    }
    public void setShoppingCart(ShoppingCartView newValue) throws ModelException {
        this.shoppingCart = newValue;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleCustomerAccount(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerAccount(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerAccount(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerAccount(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        ShoppingCartView shoppingCart = this.getShoppingCart();
        if (shoppingCart != null) {
            ((ViewProxi)shoppingCart).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(shoppingCart.getClassId(), shoppingCart.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getShoppingCart() != null) return new ShoppingCartCustomerAccountWrapper(this, originalIndex, (ViewRoot)this.getShoppingCart());
        if(this.getShoppingCart() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getShoppingCart() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getShoppingCart() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getShoppingCart() != null && this.getShoppingCart().equals(child)) return result;
        if(this.getShoppingCart() != null) result = result + 1;
        return -1;
    }
    public int getBalanceIndex() throws ModelException {
        return 0;
    }
    public int getLimitIndex() throws ModelException {
        return 0 + 1;
    }
    public int getRowCount(){
        return 0 
            + 1
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "balance";
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return "limit";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return this.getBalance();
                rowIndex = rowIndex - 1;
                if(rowIndex == 0) return new Long(getLimit());
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
            this.setBalance(common.Fraction.parse(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
        if(rowIndex == 0){
            this.setLimit(Long.parseLong(newValue));
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
