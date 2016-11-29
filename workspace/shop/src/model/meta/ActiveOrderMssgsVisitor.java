package model.meta;

public interface ActiveOrderMssgsVisitor extends ActiveOrderDOWNMssgsVisitor, ActiveOrderUPMssgsVisitor {}


interface ActiveOrderDOWNMssgsVisitor  {

    
}


interface ActiveOrderUPMssgsVisitor extends OrderStateUPMssgsVisitor {

    
}
