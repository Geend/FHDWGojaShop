package model.meta;

public interface ShopMssgs {
    void accept(ShopMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ShopDOWNMssgs extends Mssgs, ShopMssgs{}
interface ShopUPMssgs extends Mssgs, ShopMssgs{}
