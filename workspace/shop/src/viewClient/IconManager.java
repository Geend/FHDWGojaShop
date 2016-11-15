package viewClient;

import javafx.scene.image.Image;
import sun.net.www.content.image.png;

public class IconManager {

	public static final int ARTICLE = 1;
	public static final int PRODUCT_GROUP = 2;
	public static final int NEW_PRODUCT_GROUP = 3;
	public static final int PRODUCER = 4;
	public static final int NEW_PRODUCER = 5;

	private IconManager(){}

	public static Image getImage(int iconInfo) {
		switch (iconInfo) {
			case ARTICLE:
				return getImage("Ecommerce/product-48.png");
			case PRODUCT_GROUP:
				return  getImage("Very_Basic/folder-48.png");
			case NEW_PRODUCT_GROUP:
				return getImage("Folders/add_folder-48.png");
			case PRODUCER:
				return getImage("Industry/factory-48.png");
			case NEW_PRODUCER:
				return getImage("Very_Basic/plus-48.png");
		default:
			return new Image("/viewResources/default.gif");
		}
	}

	private static Image getImage(String path){
		return new Image("/viewResources/icons/"+path, 16,16, true, true);
	}
}
