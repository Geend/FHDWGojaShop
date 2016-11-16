package model.meta;

public interface ProductGroupWrapperMssgsVisitor extends ProductGroupWrapperDOWNMssgsVisitor, ProductGroupWrapperUPMssgsVisitor {}


interface ProductGroupWrapperDOWNMssgsVisitor extends DefaultProductGroupWrapperDOWNMssgsVisitor {

    
}


interface ProductGroupWrapperUPMssgsVisitor extends ComponentWrapperUPMssgsVisitor {

    
}
