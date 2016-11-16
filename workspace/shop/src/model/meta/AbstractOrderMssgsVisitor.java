package model.meta;

public interface AbstractOrderMssgsVisitor extends AbstractOrderDOWNMssgsVisitor, AbstractOrderUPMssgsVisitor {}


interface AbstractOrderDOWNMssgsVisitor extends PreOrderDOWNMssgsVisitor, OrderDOWNMssgsVisitor {

    
}


interface AbstractOrderUPMssgsVisitor  {

    
}
