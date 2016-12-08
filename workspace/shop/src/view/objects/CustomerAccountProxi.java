package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class CustomerAccountProxi extends ViewProxi implements CustomerAccountView{
    
    public CustomerAccountProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public CustomerAccountView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        String name = (String)resultTable.get("name");
        common.Fraction balance = common.Fraction.parse((String)resultTable.get("balance"));
        common.Fraction limit = common.Fraction.parse((String)resultTable.get("limit"));
        ViewProxi shoppingCart = null;
        String shoppingCart$String = (String)resultTable.get("shoppingCart");
        if (shoppingCart$String != null) {
            common.ProxiInformation shoppingCart$Info = common.RPCConstantsAndServices.createProxiInformation(shoppingCart$String);
            shoppingCart = view.objects.ViewProxi.createProxi(shoppingCart$Info,connectionKey);
            shoppingCart.setToString(shoppingCart$Info.getToString());
        }
        CustomerAccountView result$$ = new CustomerAccount((String)name,(common.Fraction)balance,(common.Fraction)limit,(ShoppingCartView)shoppingCart, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
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
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getShoppingCart() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getShoppingCart() != null && this.getShoppingCart().equals(child)) return result;
        if(this.getShoppingCart() != null) result = result + 1;
        return -1;
    }
    
    public String getName()throws ModelException{
        return ((CustomerAccount)this.getTheObject()).getName();
    }
    public void setName(String newValue) throws ModelException {
        ((CustomerAccount)this.getTheObject()).setName(newValue);
    }
    public common.Fraction getBalance()throws ModelException{
        return ((CustomerAccount)this.getTheObject()).getBalance();
    }
    public void setBalance(common.Fraction newValue) throws ModelException {
        ((CustomerAccount)this.getTheObject()).setBalance(newValue);
    }
    public common.Fraction getLimit()throws ModelException{
        return ((CustomerAccount)this.getTheObject()).getLimit();
    }
    public void setLimit(common.Fraction newValue) throws ModelException {
        ((CustomerAccount)this.getTheObject()).setLimit(newValue);
    }
    public ShoppingCartView getShoppingCart()throws ModelException{
        return ((CustomerAccount)this.getTheObject()).getShoppingCart();
    }
    public void setShoppingCart(ShoppingCartView newValue) throws ModelException {
        ((CustomerAccount)this.getTheObject()).setShoppingCart(newValue);
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
