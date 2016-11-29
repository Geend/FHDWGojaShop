package viewClient;

import constants.IconConstants;
import javafx.scene.image.Image;

public class IconManager {

	private IconManager(){}

	public static Image getImage(int iconInfo) {
		switch (iconInfo) {
			case IconConstants.ARTICLE:
				return getImage("Ecommerce/product-48.png");
			case IconConstants.PRODUCT_GROUP:
				return  getImage("Very_Basic/folder-48.png");
			case IconConstants.NEW_PRODUCT_GROUP:
				return getImage("Folders/add_folder-48.png");
			case IconConstants.PRODUCER:
				return getImage("Industry/factory-48.png");
			case IconConstants.NEW_PRODUCER:
				return getImage("Very_Basic/plus-48.png");
			case IconConstants.USER:
				return getImage("Users/gender_neutral_user-48.png");
			case IconConstants.CHECKOUT:
				return getImage("Ecommerce/checkout-48.png");
			case IconConstants.CART:
				return getImage("Ecommerce/shopping_cart-48.png");
			case IconConstants.DELIVERY_TIME:
				return getImage("Ecommerce/delivery-48.png");
			case IconConstants.SETTINGS:
				return getImage("Programming/settings_3-48.png");
		default:
			return new Image("/viewResources/default.gif");
		}
	}

	private static Image getImage(String path){
		return new Image("/viewResources/icons/"+path, 16,16, true, true);
	}
}
