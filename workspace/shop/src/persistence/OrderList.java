package persistence;

import java.util.*;

public class OrderList {

	protected Vector<Order4Public> data; //List of proxies
	protected OrderList() {
		this.data = new Vector<Order4Public>();
	}
	public Iterator<Order4Public> iterator(PersistentListProxi<Order4Public> listProxi) {
		return new PersistentListIterator<Order4Public>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (Order4Public entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public OrderList copy() {
		OrderList result = new OrderList();
		result.data = (Vector<Order4Public>)this.data.clone();
		return result;
	}


}


