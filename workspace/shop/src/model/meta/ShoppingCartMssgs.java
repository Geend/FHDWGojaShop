package model.meta;

public interface ShoppingCartMssgs {
    void accept(ShoppingCartMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ShoppingCartDOWNMssgs extends Mssgs, ShoppingCartMssgs{}
interface ShoppingCartUPMssgs extends Mssgs, ShoppingCartMssgs{}
