package model.meta;

public interface ProductGroupMssgsVisitor extends ProductGroupDOWNMssgsVisitor, ProductGroupUPMssgsVisitor {}


interface ProductGroupDOWNMssgsVisitor extends RootProductGroupDOWNMssgsVisitor, SubProductGroupDOWNMssgsVisitor, SubComponentUPMssgsVisitor {

    
}


interface ProductGroupUPMssgsVisitor extends ComponentUPMssgsVisitor {

    
}
