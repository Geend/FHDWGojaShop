package persistence;

import java.util.*;

public class CustomerDeliveryTimeList {

	protected Vector<CustomerDeliveryTime4Public> data; //List of proxies
	protected CustomerDeliveryTimeList() {
		this.data = new Vector<CustomerDeliveryTime4Public>();
	}
	public Iterator<CustomerDeliveryTime4Public> iterator(PersistentListProxi<CustomerDeliveryTime4Public> listProxi) {
		return new PersistentListIterator<CustomerDeliveryTime4Public>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (CustomerDeliveryTime4Public entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public CustomerDeliveryTimeList copy() {
		CustomerDeliveryTimeList result = new CustomerDeliveryTimeList();
		result.data = (Vector<CustomerDeliveryTime4Public>)this.data.clone();
		return result;
	}


}


