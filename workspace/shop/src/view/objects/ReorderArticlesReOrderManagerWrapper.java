package view.objects;


/* Additional import section end */

public class ReorderArticlesReOrderManagerWrapper extends AssociationInTreeWrapper {

	public ReorderArticlesReOrderManagerWrapper(ViewRoot parent, int index, ViewRoot object) {
		super(parent, index, object);
	}
    
    /*Start of protected part that is not overridden by persistence generator*/
	public javafx.scene.image.Image getImage() {
    	 return this.getWrappedObject().getImage();
    }
	
	
	public String toString(){
    	//TODO: Implement toString in wrapper class for association reorderArticles in class ReOrderManager
    	return this.getWrappedObject().toString();
    }

    /*End of protected part that is not overridden by persistence generator*/

}
